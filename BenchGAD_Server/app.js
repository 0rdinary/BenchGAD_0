//GET '127.0.0.1:3000/users/1' -v    0w0

const express = require('express');
const app = express();
const router=express.Router();
const bodyParser=require('body-parser');
const ip='155.230.34.150';
const port='3000';
//const mongo=require('mongoose');


app.listen(port,ip, () => {
  console.log('ip :'+ip+'port number'+port);
  console.log('BTS LAB BenchGAD Project Server'); 
});

//app.user
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.use('/users',require('./api/user'));

module.exports = app;


