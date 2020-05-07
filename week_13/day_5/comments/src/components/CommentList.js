// The comment list won’t store application state, its sole responsibility will be to be passed the data and render a collection of Comment components.
// thus it is classed as component component (as opposed to container)

import React, { Component } from "react";
import Comment from "./Comment";



class CommentList extends Component {

  render() {
    // we can write normal js here
    const commentNodes = this.props.comments.map(comment => {
      return(
        <Comment author={comment.author} key={comment.id}>{comment.text}</Comment>
      )
    })



    return(
      <div className="comment-list">
          Hello, everybody! I am a CommentList.
          And these are the comments:

          {commentNodes}

      </div>
    );
  }
}

export default CommentList;
