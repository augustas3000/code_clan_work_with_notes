import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import PirateList from '../components/pirates/PirateList';
import Request from '../helpers/request';
import PirateForm from '../components/pirates/PirateForm';
import PirateDetail from '../components/pirates/PirateDetail';


class PirateContainer extends Component {
  constructor(props){
    super(props);

    this.state = {
      pirates: [],
      ships: [],
      raids: []
    }


    this.handlePost = this.handlePost.bind(this);
    this.findPirateById = this.findPirateById.bind(this);
  }

  componentDidMount() {

    const request = new Request();
    const piratePromise = request.get('/api/pirates')
    const shipPromise = request.get('/api/ships')
    const raidPromise = request.get('/api/raids')

    Promise.all([piratePromise, shipPromise, raidPromise])
    .then((data) => {
      this.setState({
        pirates: data[0],
        ships: data[1],
        raids: data[2]
      })
    })
  }

  findPirateById(id){
    return this.state.pirates.find((pirate) => {
      return pirate.id === parseInt(id);
    });
  }


  handleDelete(id){
    const request = new Request();
    const url = "/api/pirates/" + id
    request.delete(url)
    .then(() => window.location = "/pirates")
  }

  handlePost(pirate) {
    const request = new Request();
    request.post('/api/pirates', pirate)
    .then(() => {
      window.location = '/pirates'
    })
  }

  handleUpdate(pirate){
    const request = new Request();
    request.patch('/api/pirates/' + pirate.id, pirate).then(() => {
      window.location = '/pirates/' + pirate.id
    })
  }

  render(){

    if(!this.state.pirates) {
      return null
    }


    return(
      <Router>
        <Fragment>
          <Switch>
          <Route exact path = '/pirates/new' render={() => {
            return <PirateForm ships={this.state.ships} onCreate={this.handlePost} />
          }} />

          <Route exact path="/pirates/:id/edit" render={(props) =>{
            const id = props.match.params.id
            const pirate = this.findPirateById(id);
            return <PirateForm pirate={pirate}
            ships={this.state.ships} raids={this.state.raids} onUpdate={this.handleUpdate}/>
          }}/>

          <Route exact path="/pirates/:id" render={(props) =>{
            const id = props.match.params.id;
            const pirate = this.findPirateById(id);
            return <PirateDetail pirate={pirate}
            onDelete={this.handleDelete}
            onUpdate={this.handleUpdate}
            raids={this.state.raids}/>
          }}/>

          <Route render={(props) => {
            return <PirateList pirates={this.state.pirates}  />
        }} />




          </Switch>
        </Fragment>
      </Router>
    )
  }

}

export default PirateContainer;
