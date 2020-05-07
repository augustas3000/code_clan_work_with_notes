import React, {Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js';


import PirateContainer from './PirateContainer';
import ShipContainer from './ShipContainer';
import RaidContainer from './RaidContainer';

const MainContainer = () => {

  return (
    // browser router
    // router
    <Router>

    <React.Fragment>
    <NavBar/>

    <Switch>


    <Route path="/ships" component={ShipContainer}/>
    <Route path="/raids" component={RaidContainer}/>

    // set up a route with component to render
    <Route path="/" component={PirateContainer}/>

    </Switch>


    </React.Fragment>
    </Router>
  )
}

export default MainContainer;
