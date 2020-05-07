// CommentBox will hold our application state and thus is classed as a container.

import React, {Component} from "react";
import CommentList from "../components/CommentList.js"

// Our CommentBox is going to be the master of the state of our application, the array of comments. For now we’ll just make some mock data. If we were creating a proper app we could get this from an API or database. The state will be stored in the constructor.
import CommentForm from "./CommentForm.js"



class CommentBox extends Component {

  constructor(props) {
    super(props);

    this.state = {
      comments: [
        {
          id: 1,
          author: "Beth Fraser",
          text: "I love JS more each day."
        },
        {
          id: 2,
          author: "Allan Russell",
          text: "Just wait until we add the form. Its gonna be good"
        }
      ]
    }

    this.handleCommentSubmit = this.handleCommentSubmit.bind(this);
  }


  handleCommentSubmit(commentObject) {
    // add an id on the fly
    commentObject.id = Date.now();
    debugger;
    // dont wanna modify the state directly!
    const updatedComments1 = this.state.comments.concat(commentObject);
    // anotehr way:
    const updatedComments = [...this.state.comments, commentObject];


    this.setState({
      comments: updatedComments1
    });

  }






  render() {
    return(
      <div className="comment-box">
        <h2>Add a new comment</h2>
        <CommentForm onCommentSubmit={this.handleCommentSubmit}/>

        <h2>Comments</h2>
        <CommentList comments={this.state.comments}/>
      </div>
    );
  }
}

export default CommentBox;
