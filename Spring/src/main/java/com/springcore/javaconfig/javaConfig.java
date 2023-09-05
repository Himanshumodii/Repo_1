package com.springcore.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.springcore.javaconfig")
@Configuration
public class javaConfig{

	@Bean
	public Samosa getSamosa(){
		return new Samosa();
	}
	//@Bean(name = {"student","temp","con"})
	
	@Bean
	public Student getStudent(){
		Student student = new Student(getSamosa());
		return student;
	}
}