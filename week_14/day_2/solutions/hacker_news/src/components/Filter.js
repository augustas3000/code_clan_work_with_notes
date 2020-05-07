import React from 'react';

class Filter extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      searchTerm: ""
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    event.preventDefault();
    this.setState({ searchTerm: event.target.value });
  }

  // as soon as handleChange is actioned and the state of this component changes, it rerenders, componentDidUpdate runs

  // componentDidUpdate()is called after componentDidMount() and can be useful to perform some action when the state changes.

  // as part of it we can compare prev state with current, and call a function prop to handleChange() in StoryContainer.


  componentDidUpdate(prevProps, prevState) {
    if (prevState.searchTerm !== this.state.searchTerm) {
      this.props.handleChange(this.state.searchTerm);
    }
  }

  handleSubmit(event) {
    event.preventDefault();
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <input
          onChange={this.handleChange}
          type="text"
          name="searchTerm"
          placeholder="Filter Stories"
          value={this.state.searchTerm} />
      </form>
    );
  }
}

export default Filter;
