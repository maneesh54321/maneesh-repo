/*var http=require("http");

http.createServer(function(request,response){
	response.writeHead(200,{'Content-Type':'text/plain'});
	response.end("Hello World\n");
}).listen(8081);
<<<<<<< Updated upstream

console.log("Server running at http://localhost:8081");
=======
console.log("Server running at http://localhost:8081");*/

/*var fs=require("fs");
var data=fs.readFileSync('input.txt');
console.log(data.toString());
console.log('Program Ended');*/

/*var fs = require("fs");
fs.readFile('input.txt', function (err, data) {
   if (err) return console.error(err);
   console.log(data.toString());
});
console.log("Program Ended");*/



// Import events module
var events = require('events');


// Create an eventEmitter object
var eventEmitter = new events.EventEmitter();

// Create an event handler as follows
var connectHandler = function connected() {
   console.log('connection succesful.');
  
   // Fire the data_received event 
   eventEmitter.emit('data_received');
}

// Bind the connection event with the handler
eventEmitter.on('connection', connectHandler);
 
// Bind the data_received event with the anonymous function
eventEmitter.on('data_received', function(){
   console.log('data received succesfully.');
});

// Fire the connection event 
eventEmitter.emit('connection');

console.log("Program Ended.");
>>>>>>> Stashed changes
