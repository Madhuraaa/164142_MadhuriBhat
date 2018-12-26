var http=require('http');
var fs=require('fs');
var express=require('express');
var app=express()
var item=[{name:"Apple",price:10},{name:"mango",price:20},{name:"Chiku",price:40}];

app.get('/items',function(req,res){
    res.send(item);
})


app.post('/items',function(req,res){
    var itemname=req.query.name;
    var itemprice=req.query.price;
    item[item.size]={name:itemname,price:itemprice};
    item.push({name:itemname,price:itemprice});
   res.send(item);
})

app.get('/items/:id',function(req,res){
    res.send(item[req.params.id]);

})
app.patch('/items/:id',function(req,res){
    var itemname=req.query.name;
    var itemprice=req.query.price;
   res.send(item[req.params.id]={name:itemname,price:itemprice});
   res.send(item);
})

app.delete('/items/:id',function(req,res){
    res.send(item[req.params.id]=null);
   res.send(item);
})
app.listen(3001)