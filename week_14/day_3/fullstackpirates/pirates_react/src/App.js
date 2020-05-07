import React, { Component } from 'react';


import MainContainer from './containers/MainContainer';

console.log(process.env.REACT_APP_hello);



class App extends Component {

  render() {
    return (
      <div>
      <MainContainer />
      </div>
    );
  }
}

export default App;
