<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.project.User"%>
<%@ page import="java.sql.*"%>
<jsp:useBean id="u" class="com.project.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<!DOCTYPE html>
<html>
 <head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Logout</h1>
</body>
</html>
<%
 String s1;
 s1=u.getPassword();
try{
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");
	  String query="delete from product where pro_name=?";
	  PreparedStatement pst=con.prepareStatement(query);
	  pst.setString(3,s1);
	  int i=pst.executeUpdate();
	  if(i>0)
	   out.print("Delete successfully...");
	  else
	   out.print("Delete unsuccess...");
   }
	 catch(Exception e){
	  	e.printStackTrace();
  }
%>
