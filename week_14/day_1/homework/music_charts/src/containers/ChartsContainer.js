import React from "react";

import SongList from "../components/SongList.js"



class ChartsContainer extends React.Component {

  constructor(params) {
    super(params);

    this.state = {
      songsTop20: []
    }
  }

  componentDidMount() {

  const url_songs = "https://itunes.apple.com/gb/rss/topsongs/limit=20/json";

  fetch(url_songs)
    .then(res => res.json())
    .then((songs) => {
      const allSongs = songs.feed.entry;
      this.setState({ songsTop20: allSongs });
    })
    .catch(err => console.error);
}

  render() {
    return(
      <div className='charts-container'>
        <h1>Welcome to the UK's pop top 20</h1>
        <SongList songsTop20={this.state.songsTop20} />
      </div>
    )
  }

}

export default ChartsContainer;
