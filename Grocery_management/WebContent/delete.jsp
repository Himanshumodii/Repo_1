<%@ page import="java.sql.*"%>
<jsp:useBean id="u" class="com.project3.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
   String s1,s2,s3,s4;
  s1=u.getProduct();
  s2=u.getQuantity();
  s3=u.getPrice();
  s4=u.getSname();
  try{
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");
	  String query="update product set quantity=?,price=?,s_name=? where pro_name=?";
	  PreparedStatement pst=con.prepareStatement(query);
	  pst.setString(1,s2);
	  pst.setString(2,s3);
	  pst.setString(3,s4);
	  pst.setString(4,s1);
	  int i=pst.executeUpdate();
	  if(i>0)
	    out.print("Data Update Successfully....");  
	  else
	    out.println("update Unsuccessfull");
     }
	 catch(Exception e){
	  	e.printStackTrace();
    }
%>