<%@ page import="java.sql.*"%>
<jsp:useBean id="u" class="com.project3.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
   String s1,s2;
  s1=u.getProduct();
  s2=u.getPrice();
  try{
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");
	  String query="delete from product where pro_name=?";
	  PreparedStatement pst=con.prepareStatement(query);
	  pst.setString(1,s1);
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
 