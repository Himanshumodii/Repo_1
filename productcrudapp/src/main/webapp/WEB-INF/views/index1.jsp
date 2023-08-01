<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
   <%@include file="./base.jsp"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 </head>
<body>
  <div class="row">
    <div class="col-md-12">
    
      <h1 class="text-center mb-3">Welcome to product App</h1>
    <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${product}" var="p1">
    <tr>
      <th scope="row">${p1.id}</th>
      <td>${p1.name} </td>
      <td>${p1.description} </td>
      <td>${p1.price} </td>
      <td>
        <a href="delete/${p1.id}"><i class="fa-sharp fa-solid fa-trash text-danger" style="font-size: 25px;"></i></a>
        <a href="update/${p1.id}"><i class="fas fa-pen-nib text-primary" style="font-size: 25px;"></i></a>
      </td>
    </tr>
  </c:forEach> 
  </tbody>
</table>
      <div class="container text-center">
        <a href="add_product" class="btn btn-outline-success">Add Product</a>
      </div>     
    </div>
  </div>
</body>
</html>