<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>best </title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="stylesheet" media="screen and (max-width:1170px)" href="/CSS/phone.css">
    <link href="https://fonts.googleapis.com/css2?family=Bree+Serif&display=swap" rel="stylesheet">
     <style>
        #navbar{
    display: flex;
    align-items: center;
    position: sticky;
    top: 0px;
}
#navbar::before{
    content: "";
    background-color: black;
    position: absolute;
    top: 0px;
    left: 0px;
    height: 100%;
    width: 100%;
    z-index: -1;
    opacity: 0.4
}

/* navigation Bar :logo and images */
 #logo{
     margin: 10px 34px;
 }

 #logo img{
     height: 59px;
    margin: 3px 6px;
 }
/*  navigation Bar :list styling */


#navbar ul{
    display: flex;
    font-family: 'Baloo Bhai 2', cursive;
}

#navbar ul li{
    list-style: none;
    font-size: 1.3rem;
}

#navbar ul li a{
    color: white;
   display: block;
   padding: 3px 22px;
   border-radius: 20px;
   text-decoration: none;
}

#navbar ul li a:hover{
    color: black;
    background-color: white;
}
    </style>
</head>

<body>
    <nav id="navbar">
        <div id="logo">
            <img src="logo.jpg" alt="MyOnlineMeals.com">
        </div>
        <ul>
            <li class="item"><a href="#home">Home</a></li>
            <li class="item"><a href="#services-container">Services</a></li>
            <li class="item"><a href="#client-section">Our clients</a></li>
            <li class="item"><a href="#contact">Contact Us</a></li>

        </ul>
    </nav>
  </body>