package com.project1;
import com.project.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class User1 {
     
public static Connection getConnection(){  
	    Connection con=null;  
	 try{  
	     Class.forName("com.mysql.jdbc.Driver");  
	     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","root");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	 }  	
	
 public int save(User u){  
	
    int status=0;  
    try{  
        Connection con = getConnection();  
        PreparedStatement ps = con.prepareStatement("insert into data (name,id,password,email,adress,mobile_no,gender) values(?,?,?,?,?,?,?)");  
        ps.setNString(1, u.getName());
        ps.setLong(2, u.getId());
        ps.setNString(3, u.getPassword());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getAdress());
        ps.setString(6, u.getMobile_no());
        ps.setString(7, u.getGender());
        status = ps.executeUpdate();  
       }catch(Exception e){
    	System.out.println(e);
    	}  
    return status;  
 } 
}