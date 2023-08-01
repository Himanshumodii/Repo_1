package com.project3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class save {
	public static Connection getConnection(){  
	    Connection con=null;  
	 try{  
	     Class.forName("com.mysql.jdbc.Driver");  
	     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	 }  	
	
public int demo1(User u){  
	
    int status=0;  
    try{  
        Connection con = getConnection();  
        PreparedStatement ps = con.prepareStatement("insert into product (pro_name,quantity,price,s_name) values(?,?,?,?)");  
        ps.setNString(1, u.getProduct());
        ps.setNString(2, u.getQuantity());
        ps.setString(3, u.getPrice());
        ps.setNString(4, u.getSname());
        status = ps.executeUpdate();  
       }catch(Exception e){
    	System.out.println(e);
    	}  
    return status;  
 } 
}
