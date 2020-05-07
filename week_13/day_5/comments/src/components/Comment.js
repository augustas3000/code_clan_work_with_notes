// The last component in the hierarchy is the Comment component.
// It is only responsible for receiving data(as props) and rendering it to the screen, it will thus go in the "components" directory.


import React, {Component} from "react";

class Comment extends Component {
  render() {
    return(
      <div className="comment">
        <h4>{this.props.children}</h4>
        <p>{this.props.author}</p>
      </div>
    );
  }
}

export default Comment;
