// import React, { Component } from "react";
import React from "react";
// a stateless component, we can rewrite it so
//
// class Comment extends Component {
//
//   render() {
//     return (
//       <li className="comment">
//         <h4>{this.props.children}</h4>
//         <p>{this.props.author}</p>
//       </li>
//     );
//   }
// }

const Comment = ((props) => {

  // can still have variables and functions, but NOT STATE
  
  return(
    <li className="comment">
      <h4>{props.children}</h4>
      <p>{props.author}</p>
    </li>
   )
})

export default Comment;













// // statelless component rrwriten:
// // parent of MyComponent:
// // <MyComponent name="Niall" />
//
// const MyComponent = ({ name }) => {
//   // whatever we return, will be rendered
//   return(
//     <h1>Hi {name}!</h1>
//   )
// }
//
//
// // or
//
//
//
//
//
// // old version for statelless component:
// class MyComponent extends Component {
//   render() {
//     return(
//       <h1>Some data here</h1>
//     )
//   }
// }
