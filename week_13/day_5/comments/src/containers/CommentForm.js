import React, {Component} from 'react';


class CommentForm extends Component {
  // state to keep track of input data

  constructor(params) {
    super(params);

    this.state = {
      author: '',
      text: ''
    }


    this.handleAuthorChange = this.handleAuthorChange.bind(this);
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleAuthorChange(event) {
    // event will be the change event, its property taerget, includes actual users input value
    this.setState({
      author: event.target.value
    })
  }

  handleTextChange(event) {
    this.setState({
      text: event.target.value
    })
  }


  handleSubmit(event) {
    // do not send post request to same url we are on by default:
    event.preventDefault();
    // rem white space at start and end
    const author = this.state.author.trim();
    const text = this.state.text.trim();
    // error handling: not submit if either field is empty:
    if (!text || !author) {
      return
    }

    // update the list of comments in CommentBox:
    // need a function-prop

    const newComment = {
      author: author,
      text: text
    }

    this.props.onCommentSubmit(newComment)

    this.setState({
      author: '',
      text: ''
    })
    // reset form to empty values:
  }


  render() {
    return(
      <form
      className='comment-form'
      onSubmit={this.handleSubmit}>
          <input
          type="text"
          placeholder="Your name"
          value={this.state.author}
          onChange={this.handleAuthorChange}/>

          <input
          type="text"
          placeholder="Say something..."
          value={this.state.text}
          onChange={this.handleTextChange}/>

          <input type="submit"
                 value="Post Comment"
                 />
      </form>
    );
  }

}

export default CommentForm;
