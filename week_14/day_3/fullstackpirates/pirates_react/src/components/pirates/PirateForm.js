import React, {Component} from 'react';
import Request from '../../helpers/request';


class PirateForm extends Component {
  constructor(props) {
    super(props);

    this.state = {
      pirateFormInput: {
        firstName: "",
        lastName: "",
        age: 0,
        ship: null
      }
    }

    this.handleChange = this.handleChange.bind(this);
    this.handleShipChange = this.handleShipChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.findShipIndex = this.findShipIndex.bind(this);
  }

  componentDidMount() {
    if(this.props.pirate){
      this.setState({pirate: {... this.props.pirate}})
    }
  }

  findShipIndex(){
  if(this.props.pirate){
    return this.props.ships.findIndex(ship => this.props.pirate.ship.id === ship.id)
  } else {
    return null;
  }
}

  handleChange(event) {
    let properTyName = event.target.name;
    let pirate = this.state.pirateFormInput;
    pirate[properTyName] = event.target.value
    this.setState({pirateFormInput: pirate})
  }

  handleShipChange(event) {
    const index = parseInt(event.target.value)
    const selectedShip = this.props.ships[index]
    let pirate = this.state.pirateFormInput
    pirate['ship'] = selectedShip
    this.setState({pirateFormInput: pirate})
  }

  handleSubmit(event) {
    event.preventDefault();
    this.props.onCreate(this.state.pirateFormInput);
  }

  render() {


    if(this.props.ships.length === 0 ){
      return <p>Loading...</p>
    }

    const shipOptions = this.props.ships.map((ship,index) => {
        return(
           <option key={index} value={index}>{ship.name}</option>
        )
    })


    let heading = ""; // ADDED

    if (!this.props.pirate){
      heading = "Create Pirate"
    } else {
      heading = "Edit " + this.props.pirate.firstName;
    }

    return(
      <div>
        <h3>{heading}</h3>
        <form onSubmit={this.handleSubmit}>
          <input type="text" placeholder="First Name" name="firstName" onChange={this.handleChange} value={this.state.pirateFormInput.firstName} />

          <input type="text" placeholder="Last Name" name="lastName" onChange={this.handleChange} value={this.state.pirateFormInput.lastName} />

          <input type="number" placeholder="Age" name="age" onChange={this.handleChange} value={this.state.pirateFormInput.age} />

          <select name="ship" onChange={this.handleShipChange} defaultValue="select-ship">
            <option disabled value="select-ship">Select a ship</option>
            {shipOptions}
          </select>

          <button type="submit">Save</button>
        </form>
      </div>
    )
  }

}

export default PirateForm;
