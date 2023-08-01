<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>     
    <meta charset="utf-8">
    <title>Responsive Navbar</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
  </head>
  <body>
   <nav>`
    <input type="checkbox" id="check"j>
    <label for="check" class="checkbtn">
      <i class="fas fa-bars"></i>
    </label>
    <label class="logo">Grocery Store Management</label>
    <ul>
     <li><a class="active" href="#">Home</a></li>
     <li><a href="#">About</a></li>
     <li><a href="#">Help</a></li>
     <li><a href="#">Feedback</a></li>
    </ul>
   </nav>
   <section>
    
     <div class="center">
    <h1>Welcome</h1>
    <div class="buttons">
     <form action="login.html" method="get">
       <button class="btn1" type="submit" name="subject" value="Submit"> Login </button>
     </form>
     <form action="sign1.jsp" method="get">
     <button class="btn" type="submit" value="Submit"> Sign Up </button>
     </form>
    </div>
   </div>
   </section>
  </body>
</html>
<style>
*{
 padding: 0;
 margin: 0;
 text-decoration: none;
 list-style: none;
 box-sizing: border-box;
}
body{
 font-family: montserrat;
}
nav{
 background: #0080ff;
 height: 80px;
 width: 100%;
}
label.logo{
 color:white;
 font-size: 35px;
 line-height:80px;
 padding: 0 100px;
 font-weight: bold;
}
 nav ul{
   float: right;
   margin-right: 20px;
 }
nav ul li{
  display: inline-block;
  line-height: 80px;
  margin: 0 5px;
}
nav ul li a{
  color: white;
  font-size:17px;
  padding: 7px 13px;
  border-radius: 3px;
  text-transform: uppercase;
}
 a.active,a:hover{
  background: #1b9bff;
  transition: .5s;
 }
 .checkbtn{
   font-size: 30px;
   color: white;
   float: right;
   line-height: 80px;
   margin-right: 40px;
   cursor: pointer;
   display: none;
 }
 #check{
   display: none;
 }
 @media (max-width: 952px){
   label.logo{
    font-size: 30px;
    padding-left: 50px;
   }
   nav ul li a{
     font-size: 16px;
   }
 }
 @media (max-width: 858px){
   .checkbtn{
     display: block;
   }
 ul{
  position: fixed;
  width: 100%;
  height: 100vh;
  background: #2c3e50;
  top: 80px;
  left: -100%;
  text-align: center;
  transition: all .5s;
 }
 nav ul li{
   display: block;
   margin: 50px 0;
   line-height: 30px;
 }
 nav ul li a{
   font-size: 20px;
 }
 a:hover,a.active{
      background: none;
      color: #0082e6;
  }
  #check:checked ~ ul{
    left: 0;
  }
 }
 section{
    background: url('home.jpg') no-repeat;
    background-size: cover;
    height: calc(100vh - 80px);
 }
  .center{
   position: absolute;
   top: 50%;
   left: 55%;
   transform: translate(-50%, -50%);
   font-family: sans-serif;
   user-select: none;
 }
 .center h1{
   color: #ff8000;
   font-size: 90px;
   font-weight: bold;
   width: 900px;
   text-align: center;
  }
  .center h2{
   color: white;
   font-size: 70px;
   font-weight: bold;
   width: 885px;
   margin-top: 10px;
   text-align: center;
  }
  .center .buttons{
   margin: 35px 280px;
  }
  .buttons button{
     height: 50px;
     width: 150px;
     font-size: 18px;
     font-weight: bold;
     color: white;
     background: red;
     border: 1px solid #cc0000;
     outline: none;
     cursor: pointer;
     border-radius: 25px;
  }
  .buttons .btn{
    margin-left: 180px;
  }
  
</style>










