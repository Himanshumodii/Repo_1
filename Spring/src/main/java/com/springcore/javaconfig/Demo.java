package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
	
	 Scanner s = new Scanner(System.in);
	 ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
	 Student student = context.getBean("getStudent",Student.class);
     System.out.println(student);
		/*
		 * System.out.println("Emter two number:"); int n,m; n = s.nextInt(); m =
		 * s.nextInt();
		 */
     student.study(); 
	}
}