<%@ page import="com.project3.*"%>
<%@ page import="java.sql.*"%>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from product");
 String userData="";
%>
   <html>
	 <body>
	  <table border="1" cellspacing="0" align="center">
	   <tr>
	    <th> pro_name </th>
      	<th> quantity </th>
     	<th> price </th>
     	<th> s_name </th>
	   </tr>
<%  while(rs.next())
    {
%>
   <tr>
   	<td> <% out.println(rs.getString(1)); %></td>
  	<td> <% out.println(rs.getString(2)); %></td>
  	<td> <% out.println(rs.getString(3)); %></td>
  	<td> <% out.println(rs.getString(4)); %></td>
  </tr>
<% }%>  
	  </table>
	 </body> 
   </html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
   table,tr,th,td{
    border:2px solid green;
    border-collapse:collapse;
    width:700px;
   }
</style>
</head>
<style>
    body{
      background-image: white;
      background-size: cover;
      font-family:Arial;
    }
</style>
<body>
   
 <h1 align="center">Update Value</h1>  
  <form action="delete.jsp" align="center">
   <table align="center">
      <tr>
        <td>
          pro_name :
        </td>
        <td>
          <input type="text" placeholder="Product" name="product" required="required">
        </td>
      </tr>
      <tr>
        <td>
          quantity :
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
          <input type="text" placeholder="Price" name="price" required="required">
        </td>
      </tr>
      <tr>
        <td>
          Shop Name :
        </td>
        <td>
          <input type="text" placeholder="Sname" name="sname" required="required">
        </td>
      </tr>
      <tr>
        <td>
         <input align="center" type="submit" value="update">
       </td>
      </tr>
   </table>
        
   </form>
</body>
</html>
