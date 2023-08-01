<%@ page import="com.project2.*"%>
<%@ page import="com.project.User"%>
<jsp:useBean id="u" class="com.project.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
   Login d2 = new Login();
  String s1=d2.demo(u);
  if(s1.equals("login")==true){
%>
<style>
    body{
      background-image: url('home1.jpeg');
      background-size: cover;
      font-family:Arial;
    }
  </style>
<html>
 <body>
   <form action="product_save.jsp">
    <h1 align="center">Save Your Item</h1>
    <table align="center">
      <tr>
        <td>
          Product Name:
        </td>
        <td>
          <input type="text" placeholder="P.N" name="product" required="required">
        </td>
      </tr>
      <tr>
        <td>
          Quantity:
        </td>
        <td>
          <input type="text" placeholder="Quantity" name="quantity" required="required">
        </td>
      </tr>
      <tr>
        <td>
          price :
        </td>
        <td>
          <input type="text" placeholder="price" name="price">
        </td>
      </tr>
      <tr>
        <td>
          Shop Name :
        </td>
        <td>
          <input type="text" placeholder="shop name" name="sname" required="required">
        </td>
      </tr>
    </table>
     <input type="submit" value="Save">
   </form>
   <form action="new_page.jsp">
    <input type="submit" value="update">
   </form>
   <form action="delete1.jsp">
     <input type="submit" value="Delete">
   </form>
   <form action="logout.jsp">
     <input type="submit" value="logout">
   </form>
 </body>
</html>
<%
  }
  else
  {
%>
   <script>
     alert('Invalid login Id and password');
   </script>
 <%
  }
 %>  