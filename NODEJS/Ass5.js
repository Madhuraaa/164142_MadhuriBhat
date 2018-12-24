var fs=require("fs");
var writeStream=fs.createWriteStream("write.txt");
writeStream.write("i am working");
writeStream.end();
