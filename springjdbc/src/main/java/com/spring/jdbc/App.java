package com.spring.jdbc;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entites.Student;
import com.spring.jdbc.dao.*;

public class App
{
    public static void main( String[] args )
    {
    	
    System.out.println( "Hello World!" );
    ApplicationContext context = new AnnotationConfigApplicationContext(Jdbcconfig.class);
    
    //StudentDaoImp studentDao = (StudentDaoImp) context.getBean("studentDao");
    StudentDao studentDao = (StudentDao) context.getBean("studentDao");
    
    // insert..............
    /*
	   Student student = new Student();
	   student.setId(125);
	   student.setName("Gaurav Ji");
	   student.setCity("Balghar");
	   int result = studentDao.insert(student);
	   System.out.println("Student Added:"+result);
    */	 
    // update..............
	/*
	 * Student student = new Student();
	 * student.setId(123);
	 * student.setName("Raju Ji");
	 * student.setCity("Agar");
	 * int result = studentDao.change(student);
	 * System.out.println("Change Data :"+result);
	 */
    
     // Delete...........
    
    /*
     Student student = new Student();
     student.setId(20);
     int result = studentDao.delete(student);
	 System.out.println("Delete Data :"+result);
    */
    // for single object Or Value
	/*
	 * Student student = studentDao.getStudent(45); System.out.println(student);
	 */
    // for multiple values
    
    List<Student> students = studentDao.getAllStudents();
    for(Student s:students) {
    	System.out.println(s);
     }
    
   }
}