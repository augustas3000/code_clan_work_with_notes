import React from 'react';
import './App.css';

// stateless functional component - rendering bog standard html

function App() {
  return (
    // old way - React.createElement('h1', null, 'Hello World!')

    // JSX new way -
    <h1 className="title">Hello World</h1>

  );
}

export default App;
