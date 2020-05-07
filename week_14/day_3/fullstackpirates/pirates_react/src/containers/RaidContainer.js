import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Request from '../helpers/request';

import RaidList from '../components/raids/RaidList';

class RaidContainer extends React.Component {

  constructor(props) {
    super(props);


    this.state = {
      raids: []
    }

  }

  componentDidMount() {
    const request = new Request;
    request.get('/api/raids')
    .then(raidsData => {
      this.setState({raids: raidsData})
    })
  }

  render(){
    return(
      <Router>
        <Fragment>
          <Switch>
          <Route render={(props) => {
            return(
              <RaidList raids={this.state.raids}  />
            )
        }} />
          </Switch>
        </Fragment>
      </Router>
    )
  }
}


export default RaidContainer;
