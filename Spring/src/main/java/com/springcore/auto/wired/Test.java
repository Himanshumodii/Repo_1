package com.springcore.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	  
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wired/auto.config.xml");	
	// diffreant solustion of type casting.....
	jai jai2 = context.getBean("jai1",jai.class); 
    System.out.println(jai2);	
	}
}




