import React, { useState } from "react";
// useState is a hook and therefore its gonna be a function

export default function PiggyBank({title}) {

  const [total, setTotal] = useState(0); //returns an array with two values, index 0: the current state being tracked, index 1: function to update state value.
  // 0 initial value.

  // multipel state values
  // const [accounts, setAccounts] = useState([]);

  const deposit = (value) => {
    let newTotal = total + value
    setTotal(newTotal)
  }

  const withdraw = (value) => {
    if (total - value < 0) {
      setTotal(0);
    } else {
      let newTotal = total - value
      setTotal(newTotal)
    }
  }


  return(
    <>
      <h1>{title}</h1>
      <p>Total: £{total}</p>
      <button onClick={() => deposit(5)}>Deposit</button>
      <button onClick={() => withdraw(3)}>Withdraw</button>
    </>
  )
}
