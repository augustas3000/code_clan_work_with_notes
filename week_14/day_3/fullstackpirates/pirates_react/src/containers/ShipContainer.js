import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Request from '../helpers/request';

import ShipList from '../components/ships/ShipList';

class ShipContainer extends React.Component {

  constructor(props) {
    super(props);


    this.state = {
      ships: []
    }

  }

  componentDidMount() {
    const request = new Request;
    request.get('/api/ships')
    .then(shipsData => {
      this.setState({ships: shipsData})
    })
  }

  render(){
    return(
      <Router>
        <Fragment>
          <Switch>
          <Route render={(props) => {
            return(
              <ShipList ships={this.state.ships}  />
            )
        }} />
          </Switch>
        </Fragment>
      </Router>
    )
  }
}


export default ShipContainer;
