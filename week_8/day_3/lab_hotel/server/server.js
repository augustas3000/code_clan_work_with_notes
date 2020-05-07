const express = require('express');
const app = express();
// environment variab;es checks
// console.log('Environment type 🌲:' + app.get('env'));
// console.log(process.env);

const cors = require('cors');
const parser = require('body-parser');

const morgan = require('morgan');

const MongoClient = require('mongodb').MongoClient;
const createRouter = require('./helpers/create_router.js');
const port = 3000;

// Middlewares
// these middleware functions apply to every single route, got to be on top
app.use(morgan('dev'));
app.use(cors());
app.use(parser.json()); //or use the built in one app.use(express.json())


MongoClient.connect('mongodb://localhost:27017')
.then((client) => {
  const db = client.db('hotel');
  const bookingsCollection = db.collection('bookings');
  // route handlers
  const bookingsRouter = createRouter(bookingsCollection);
  app.use('/api/bookings', bookingsRouter)

  // add a different router? ask team. first declare, then app.use - use middleware for specific route
})
.catch(console.error);

// start server
app.listen(port, function() {
  console.log(`Listening on port: ${this.address().port}`);
});
