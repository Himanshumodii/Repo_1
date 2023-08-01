package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone_config.xml");
	    Person person1 = context.getBean("person1",Person.class);
	 //   Person person2 = context.getBean("person2",Person.class);
	    System.out.println(person1);
	 //   System.out.println(person2);
	    System.out.println(person1.getFriend().getClass().getName());
	    System.out.println("______________________________________");
	    System.out.println(person1.getFeesstructure());
	    System.out.println(person1.getFeesstructure().getClass().getName());
	    System.out.println("+++++++++++++++++++++++++");
	    System.out.println(person1.getProperties());
	}
}


