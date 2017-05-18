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


var events = require('events');

var eventEmitter = new events.EventEmitter();

var connectHandler1 = function connected(data1) {
	console.log(data1);
	console.log('connection succesful1.');
	eventEmitter.emit('data_received');
}

var connectHandler2 = function connected(data1,data2) {
	console.log(data2);
	console.log('connection succesful2.');
	eventEmitter.emit('data_received');
}

var handler=function handle(){
	console.log("New Listener added");
};
eventEmitter.on('newListener',handler);

// Bind the connection event with the handler
eventEmitter.on('connection', connectHandler1);
 
// Bind the data_received event with the anonymous function
eventEmitter.on('data_received', function(){
   console.log('data received succesfully.');
});

var handler1=function handle(){
	console.log("Listener removed");
};
eventEmitter.on('removeListener',handler1);
// Fire the connection event 
//eventEmitter.emit('connection');
eventEmitter.removeListener('connection',connectHandler1);
//eventEmitter.emit('connection');
eventEmitter.on('connection', connectHandler2);

//eventEmitter.emit('connection');
var data="abcd";
eventEmitter.emit('connection',"abcd","efgh");

console.log(eventEmitter.listeners('connection'));
console.log(events.listenerCount(eventEmitter,'connection'));
console.log("Program Ended.");




var EE = require('events').EventEmitter;
var ee = new EE();

ee.on('test', function (first, second, third) {
  console.log(first, second, third); //Will output full phrase
});

ee.on('test', function (first) {
  console.log(first); //Will output just first word
});

ee.on('test', function () {
  console.log.apply(console, arguments); //Will output full phrase again
});

ee.emit('test', 'Hello', 'my', 'world!');
console.log("Program Ended.");
