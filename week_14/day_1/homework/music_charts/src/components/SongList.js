import React from "react";

import Song from "./Song.js";

const SongList = (props) => {


  const songNodes = props.songsTop20.map((song, index) => {

  if (props.songsTop20 == null || props.songsTop20.length === 0) {
    return <p>Loading...</p>;
  }

    return <Song key={song.id}
                 artist={song['im:artist'].label}
                 songTitle={song['im:name'].label}
                 positionInCharts={index + 1}/>
  });

// stateless component hence return does render as well
  return(
    <div className='song-list Rtable Rtable--3cols'>

      <div  class="Rtable-cell Rtable-cell-header ">Place in charts</div>
      <div  class="Rtable-cell Rtable-cell-header">Artist name</div>
      <div  class="Rtable-cell Rtable-cell-header">Song title</div>

      {songNodes}
    </div>
  )



}


export default SongList;
