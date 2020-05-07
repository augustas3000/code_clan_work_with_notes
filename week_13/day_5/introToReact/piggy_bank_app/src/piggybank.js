import React, { Component } from 'react';

// We create components using the Class syntax. We will create a PiggyBank class which inherits from React’s Component using the extend keyword, and calling super in the constructor. This gives us access to all of the React Components properties and methods, while rewriting our own custom components



class PiggyBank extends Component {

    constructor(props) {
        super(props);
        this.state = {
            total: 0
        };

        // function as a property of the class bound to the context of this class

        this.deposit = this.deposit.bind(this);
        this.withdraw = this.withdraw.bind(this);
    }


// When a user clicks on this button, we want an amount to be added to the total, and for this change to be reflected on the page. We can trigger this rerendering of the page by updating the state with React’s method, setState

    deposit() {
        this.setState(prevState => {
            return {total: prevState.total + this.props.depositAmount}
        });
    }
    withdraw() {
        this.setState(prevStatee => {
            let newAmount = prevStatee.total- this.props.depositAmount;
            if (newAmount < 0) {
                newAmount = 0;
            }
            return {total: newAmount};
        })
    }


// As mentioned before, the Component’s function must return either a DOM element,
// an array of DOM elements or null.


    render() {
        return (

            // It looks like HTML, but we know that it’s not because it is inside a JavaScript file. This syntax is called JSX and is what we can use in React to describe what we want to be rendered to the page.

            // 👇 N.B.this is shorthand for Fragment!
            <>
                <h1> { this.props.title } </h1>
                <p> Total: £ {this.state.total} </p>
                // If we now try and click the button on the page, we get an error. This is because we have a context problem. The deposit method is being passed as a callback to the button, therefore inside deposit, <this> isn’t the PiggyBank class. We want it to be the PiggyBank class, so that it can access the state.
                // The way React suggest to solve this problem is to the bind method. bind is a function method (in JavaScript, functions are first class objects and therefore can have methods stored on them). It allows us to call it on a function and pass in whatever context we want it to have. It returns a new function with the specified context. React suggests to create this new version of the function as a property of the class.
                // Now we call set this on the button’s click event in the JSX using the onClick attribute
                <button onClick={this.deposit}>Deposit</button>
                <button onClick={this.withdraw}>Withdraw</button>
            </>
        )
    }
}
export default PiggyBank;
