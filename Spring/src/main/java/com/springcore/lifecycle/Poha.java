package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Poha {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Poha() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Poha [subject=" + subject + "]";
	}
    
	@PostConstruct
	public void start() {
		System.out.println("starting1 method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending1 method");
	}
}