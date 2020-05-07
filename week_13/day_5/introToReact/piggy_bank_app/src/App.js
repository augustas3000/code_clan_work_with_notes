import React from 'react';
// import logo from './logo.svg';
import './App.css';
import PiggyBank from './piggybank.js';

// stateless functional component
// As our App component is an SFC the function itself
// takes the place of the render method.
function App() {

  return (

    <div>
      <PiggyBank title="Savings Pig" depositAmount={5} />
    </div>

  );

}

export default App;
