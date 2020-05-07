import React, { Component } from "react";
import About from "./About";
import Home from "./Home";
import Pricing from "./Pricing";

import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from "./NavBar";
import ErrorPage from "./ErrorPage"

class Main extends Component {
  constructor() {
    super();
    this.state = {
      pricing: [
        {level: "Hobby", cost: 0},
        {level: "Startup", cost: 10},
        {level: "Enterprise", cost: 100}
      ]
     };
  }

  render() {
    return (
      <Router>
        <React.Fragment>
          <NavBar />
          <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/about" component={About} />

          <Route path="/pricing" render={() => {
            return <Pricing prices={this.state.pricing} />
          }} />
          
          <Route component={ErrorPage} />
          </Switch>

        </React.Fragment>
      </Router>
    );
  }

  pageComponent() {
    switch (this.state.page) {
      case "/about":
        return <About />;
      case "/pricing":
        return <Pricing />;
      default:
        return <Home />;
    }
  }

  gotoHome(event) {
    event.preventDefault();
    this.setState({ page: "/home" });
  }

  gotoAbout(event) {
    event.preventDefault();
    this.setState({ page: "/about" });
  }

  gotoPricing(event) {
    event.preventDefault();
    this.setState({ page: "/pricing" });
  }
}

export default Main;
