package com.project2;
import com.project.User;
import java.sql.*;
public class Login {
public static Connection getConnection() {  
     Connection con=null;  
 try {  
     Class.forName("com.mysql.jdbc.Driver");  
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
 }  	
  public String demo(User u) {
	  String userData="",s1,s2,s3,s4;
   try {
	    Connection con = getConnection();
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from data");
	    while(rs.next())
	    {
	     //userData=rs.getString(1)+":"+rs.getString(3);
	      s1=rs.getString(1);
	      s2=rs.getString(3);	        
	      s3=u.getName();
	      s4=u.getPassword();
	      if((s1.equals(s3)==true)&&(s2.equals(s4)==true))
	    	{
	    	  userData="login";
	    	  break;
	    	}
	        else
	        {  	
	        	userData="Invalid login Id and password";
	        }
	    }
   }
    catch(Exception e){System.out.println(e); }
	return userData;
  }
}



