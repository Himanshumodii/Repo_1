package com.project3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class update {
  try{
	String url="jdbc:mysql://localhost:3306/sys";
    String uname="root";
    String pass="root";
    String query="select * from student";
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con=DriverManager.getConnection(url,uname,pass);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    String userData="";
    while(rs.next())
     {
      userData=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3);
      System.out.println(userData);
    	//textbox1.setText(Integer.toString(rs.getInt(1)));
     }
    }
    catch(Exception e)
    {}
}
