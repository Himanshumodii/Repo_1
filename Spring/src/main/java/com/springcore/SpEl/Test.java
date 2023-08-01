package com.springcore.SpEl;
import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

   public static void main(String[] args) throws Exception {
	   
     ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpEl/config_h.xml");
     Demo d1=context.getBean("obj",Demo.class); 
     System.out.println(d1);
   
   } 
}                     