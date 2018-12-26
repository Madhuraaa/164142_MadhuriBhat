var express = require('express')
var app = express()

app.get('/year', function(req, res){
  var age=req.query.age;

  var date=new Date();
  var year=date.getFullYear();
  var diff=year-age;
  res.send('you were born  is '+diff);
  res.send();
})
app.listen(3006)