var buf1=new Buffer([10,20,30,40,50]);
console.log(buf1[1].toString());
var len=buf1[0].write("changed");
console.log(len);
console.log(buf1[0]);


var buf2 = new Buffer("Simply Easy Learning", "utf-8");
console.log(buf2.toString('ascii',0,5));