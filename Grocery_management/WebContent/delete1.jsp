<%@ page import="com.project3.*"%>
<%@ page import="java.sql.*"%>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from product");
String userData="";
%>
<style>
table,tr,th,td{
    border:2px solid green;
    border-collapse:collapse;
    width:700px;
   }
 </style>
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
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
   
   <h1 align="center">Delete Product</h1>
  <form action="update.jsp" >
   <table border="1" cellspacing="0" align="center">
      <tr>
        <td align="center">
          pro_name :
        </td>
        <td>
          <input type="text" placeholder="Product" name="product" required="required">
        </td>
        <td>
         <input type="submit" value="Delete">
        </td>
      </tr>
   </table>
   </form>
</body>
</html>