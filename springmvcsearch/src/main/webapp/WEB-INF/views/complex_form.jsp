<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Bootstraps meta tags -->
<meta charset="utf-8">
<meta name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no">
      
<!-- Bootstrap CSS -->
<link rel="stylesheet"
   href="https://stackpath.bootstrapcdn.com/bootsrap/4.5.0/css/bootstrap.min.css"
   integrity="sho384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8wgZl5MYYxFfc+NcPb1dkGj7Sk"
   crossorigin="anonymous">
   
<title>Hello, World!</title>
</head>
<body class="" style="background: #e2e2e2;">
  
   <div class="row">
     <div class="col-md-8 offset-md-2">
       <div class="card">
         <div class ="card-body">
           <h3 class="text-center">Complex Form</h3>
           <div class="alert alert-danger" role="alert">
                <form:errors path="student.*" />
           </div>
           <form action="handleform" method="post">
               <div class="form-group">
                  <label for="exampleInputEmail1">Your name</label>
                  <input name="name" type="text" class="form-control"
                   id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Enter Name"> <small id="emailHelp"
                   class="form-text text-muted">We will never share your name with anyone else.</small>
                  
               </div> 
               
               <div class="form-group">
                   <label for="exampleInputEmail1"> Your id</label>
                   <input name="id" type="text" class="form-control" id="exampleInputEmail1"
                   aria-describedby="emailHelp" placeholder="Enter ID">
               </div>
               
               <div class="form-group">
                   <label for="exampleInputEmail1">Your DOB</label> 
                   <input name="dob" type="text" class="form-control"
                   id="exampleInputEmail1" placeholder="dd/mm/yyyy" aria-describedby="emailHelp"> 
               </div>
               
               <div class="form-group">
                 <label for="exampleFormControlSelect1">Select Course</label>
                  <select name="Courses" class="form-control"
                     id = "exampleFormControlSelect1" multiple>
                     <option>Java</option>
                     <option>Python</option>
                     <option>C++</option>
                     <option>Django</option>
                     <option>Spring Framework</option>
                  </select>
               </div>
                <div class="form-group">
                   <span class="mr-3"> Select Gender </span>
                   <div class="form-check form-check-inline">
                      <input class="form-check-input" type="radio" name="gender"
                        id="inlineRadio1" value="male"><label
                        class="form-check-label" for="inlineRadio1">Male</label>
                   </div>
                   <div class="form-check form-check-inline">
                      <input class=form-check-input type="radio" name="gender"
                      id="inlineRadio2" value="female">
                      <label class="form-check-label" for="inlineRadio2">Female</label>
                   </div>
               </div>
               <div class="form-group">
                  <label for="">Select Type</label>
                  <select class="form-control" name="type">
                    <option value="oldstudent">Old Student</option>
                    <option value="normalstudent">Normal Student</option>
                  </select>
               </div>
               
               <div class="card">
                <div class="card-body">
                  <p>Your address</p>
                  
                  <div class="form-group">
                   <input name="address.street" type="text" class="form-control" placeholder="Enter street">
                  </div>
                  
                  <div class="form-group">
                   <input name="address.city" type="text" class="form-control" placeholder="Enter City">
                  </div>
                  
                </div>
               </div>
  
               <div class="container text-center">
                 <button type="submit" class="btn btn-primary">Submit</button>
               </div>
             </form>
           </div>
         </div>
      </div>
   </div>
  <!-- Optional JavaScript
  jQuery first, then Popper.js, then Bootstrap JS -->
 </body>
</html>          