import React from 'react';
import {Link} from 'react-router-dom';


// stateless functional component:


const NavBar = () => {
  // links to routes
  return(
    <ul>
      <li>
        <Link to="/">Home</Link>
      </li>

      <li>
        <Link to="/about">About</Link>
      </li>

      <li>
        <Link to="/pricing">Pricing</Link>
      </li>
    </ul>
  )
  
}


export default NavBar;
