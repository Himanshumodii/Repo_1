<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
 <head>
    <title> Sign up</title>
    <link rel ="stylesheet" href ="mystyle.css">
  
  </head>
 <body>
   <div class="wrap">
     <h2> Sign up Here</h2>
     <form action=text.jsp method="post">
       <input type="text" placeholder="Name" name="name" required="required">
       <input type="Password" placeholder="Password" name="password" required="required"><br>
       <input type="radio" name="gender" required="required">Male
       <input type="radio" name="gender" required="required">Female<br>
       <input type="email" placeholder="Email" name="email" required="required">
       <input type="text" placeholder="Adress" name="adress" required="required">
       <input type="text" placeholder="Mobile_no" name="mobile_no" required="required">
       <input type="text" placeholder="Id" name="id" required="required">
       <input type="submit" name="submit" value="submit">
     </form> 
  </div>
    
 </body>
</html>	
<style>
    body{
      background-image: url('hm.jpg');
      background-size: cover;
      font-family:Arial;
    }
 .wrap{
   max-width:350px;
   border-radius:20px;
   margin:auto;
   background:rgba(0,0,0,0.8);
   box-sizing:border-box;
   padding:40px;
   color:#fff;
   margin-top:100px;
 }
 h2{
  text-align:center;
 }
 input[type=text],input[type=password],input[type=email]{
    width:100%;
    box-sizing:border-box;
    padding:12px 5px;
    background:rgba(0,0,0,0.10);
    outline:none;
    border:none;
    border-bottom:1px dotted #fff;
    color:#fff;
    border-radius:5px;
    margin:5px;
    font-weight:bold;
 }
 input[type=submit]{
  width:100%;
  box-sizing:border-box;
  padding:10px 0;
  margin-top:30px;
  outline:none;
  border:none;
  background:#60adde;
  opacity:0.7;
  border-radius:20px;
  font-size:20px;
  color:#fff;
 }
 input[type=submit]:hover{
   background:#003366;
   opacity:0.7;
 }
</style>















