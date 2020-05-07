import React, { Component } from 'react';
import Chart from '../components/Chart';
import TitleBar from '../components/TitleBar';


// storyCodes and stories are for hacker news,
class ChartContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      songs: [],
      storyCodes: [],
      stories: []
    }
    this.handleSelectChange = this.handleSelectChange.bind(this);
    this.handlePlayPause = this.handlePlayPause.bind(this);
  }

  componentDidMount() {
    // const storyCodesUrl = "https://hacker-news.firebaseio.com/v0/topstories.json"
    // this.loadSongs(this.props.genres[0].url)

    // For HackerNews
    this.loadStories("https://hacker-news.firebaseio.com/v0/topstories.json")
    // this.loadStories(20);

  }

     loadStories(storyCodesUrl, numberOfStoriesFromTop) {
       // load story codes
       fetch(storyCodesUrl)
         .then(res => res.json())
         .then(codesArray => this.setState({ storyCodes: codesArray }))
         .then(() => {
           this.storyLoader(numberOfStoriesFromTop);
         })
         .catch(err => console.error);
      }

// For HAcker nwes
      storyLoader(numberOfStoriesFromTop) {

               const promisesArray = [];
               let currentPromise = null;
               let currentCode = 0;
               let storyUrltemplate = "";
               const storiesArray = [];

               for (let i=0;i<numberOfStoriesFromTop; i++) {
                 currentCode = this.state.storyCodes[i];
                 storyUrltemplate = `https://hacker-news.firebaseio.com/v0/item/${currentCode}.json`;
                 // debugger;
                 currentPromise =  fetch(storyUrltemplate);
                 promisesArray.push(currentPromise);
               }

               Promise.all(promisesArray)
                .then(stories => {
                  stories.forEach(story => {
                    this.process( story.json(), storiesArray );
                  })
                })
                .catch(err => {
                  console.error
                });

                this.setState({stories: storiesArray});
     }

// For Hacker news
      process(promise, storiesArray) {
        promise.then(data => {
          storiesArray.push(data);
        })
      }



      // fetch returns promise objects which marry perfectly with Promise.all
      // Promise.all(arrayOfPromises)

      // Promise.all([promiseObj1, promiseObj2])
      // .then(files => {
      //   files.forEach(file => {
      //     process( file.json() )
      //   })
      // }).catch(err => {
      //
      // });
      //
      //



  // ___________________________________________________________________________






  loadSongs(url) {

    fetch(url)
      .then(res => res.json())
      .then(songsList => this.setState({ songs: songsList.feed.entry }))
      .catch(err => console.error);
  }

  handlePlayPause(audio) {
    audio.paused ? audio.play() : audio.pause();
    audio.classList.toggle('playing');
  }

  handleSelectChange(event) {
    this.loadSongs(event.target.value);
  }

  render() {
    return (
      <div>
        <TitleBar
          handleSelectChange={this.handleSelectChange}
          genres={this.props.genres}
        />
        <Chart
          songs={this.state.songs}
          url={this.props.genres[0].url}
          handleSelectChange={this.handleSelectChange}
          handlePlayPause={this.handlePlayPause}
        />
      </div>
    )
  }
}

export default ChartContainer;
