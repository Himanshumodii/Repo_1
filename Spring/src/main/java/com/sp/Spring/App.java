package com.sp.Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
      
      System.out.println( "Hello World!" );
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      Student stud = (Student) context.getBean("jai");
      Student stud1 = (Student) context.getBean("jai1");
      System.out.println(stud); 
      System.out.println(stud1);
    }
}