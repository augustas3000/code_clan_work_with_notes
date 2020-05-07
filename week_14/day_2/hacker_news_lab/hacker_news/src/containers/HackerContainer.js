import React from 'react';

// storyCodes and stories are for hacker news,
import NewsList from '../components/NewsList.js';

class HackerContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      storyCodes: [],
      stories: [],
      filteredStories: []
    }

  }

  componentDidMount() {
    // call teh loadStories() which will first fetch all story codes,
    // then use the argument numberOfStoriesFromTop to fetch the right number of stories using sotry codes:
    this.loadStories("https://hacker-news.firebaseio.com/v0/topstories.json", 20)
  }

  fetchStories(numberOfStoriesFromTop) {

    // get the number of stories from top of the list,
    // number specified by the argument of this function
    const storyCodes = [];
    for (let i=0;i<numberOfStoriesFromTop; i++) {
      storyCodes.push(this.state.storyCodes[i]);
    }

    // based on selected storyCodes in the array, we fetch a story for each code, the promises are mapped to an array - promises. Crucial to use map method, which is synchronous, allowing us to first generate all promises and then resolve.
    let promises = storyCodes.map(code => {
      return fetch(
        `https://hacker-news.firebaseio.com/v0/item/${code}.json`
      ).then(res => res.json());
    });

    // CAtch all promises in the array and use resulting data to set the state - stories [].
    Promise.all(promises).then(storiesArray => {
      this.setState({stories: storiesArray});
    })
  }

  // A helper method that allows us to specify a number of stories from the top we are looking for, as an argument, plus the endpoint url for story codes.
  loadStories(storyCodesUrl, numberOfStoriesFromTop) {
    // first fetch story codes
    fetch(storyCodesUrl)
    .then(res => res.json())
    .then(codesArray => this.setState({ storyCodes: codesArray }))
    .then(() => {
      this.fetchStories(numberOfStoriesFromTop);
    })
    .catch(err => console.error);
  }


  render() {
    return (
      <>
        <NewsList stories={this.state.stories} />
      </>
    )
  }

}


export default HackerContainer;
