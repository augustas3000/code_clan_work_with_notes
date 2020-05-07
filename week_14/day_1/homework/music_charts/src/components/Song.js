import React from "react";

const Song = (props) => {
  return(

    <React.Fragment>
      <div className='song-info Rtable-cell'>{props.positionInCharts}</div>
      <div className='song-info Rtable-cell'>{props.artist}</div>
      <div className='song-info Rtable-cell'>{props.songTitle}</div>
    </React.Fragment>

  )
}

export default Song;
