
// creating serevr obj
const express = require('express');
const app = express();

// To access the request’s body we have to use some middleware called bodyParser. The role of body-parser is to extract the body from the POST request and make it accessible on req.body.
const parser = require('body-parser');
// import mongodb client
const MongoClient = require('mongodb').MongoClient;
const createRouter = require('./helpers/create_router');
const cors = require('cors');

app.use(cors())
app.use(parser.json())

// connecting to db, client obj has to be for db control
MongoClient.connect('mongodb://localhost:27017', (err, client) => {
  if(err){
    console.log(err);
  }

  // specify database
  const db = client.db('games_hub');
  // take collection from db and assign it to var
  const gamesCollection = db.collection('games');
  // use this var as an argument in create router
  const gamesRouter = createRouter(gamesCollection)
  // prefix to specify home route in routing
  app.use('/api/games', gamesRouter);

  // make server object listen to requests using port 3000, and log to console(terminal as this is node.js server) req, response.
  app.listen(3000, function(){
    console.log(`app listening on port ${this.address().port}`);
  })
});
