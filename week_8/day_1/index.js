const http = require('http');


// Server
const server = http.createServer((req,res) => {
  res.end('Hello from the server');
});

// listen to incom requests from the client:
server.listen(8000, '127.0.0.1', () => {
  console.log('Listening to requests on port t 8000');
});
