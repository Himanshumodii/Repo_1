package com.springcore.auto.wired.Annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	  
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wired/Annotation/auto.config.xml");	
	// diffreant solustion of type casting.....
	Emp emp1 = context.getBean("emp1",Emp.class); 
    System.out.println(emp1);	
	}
}