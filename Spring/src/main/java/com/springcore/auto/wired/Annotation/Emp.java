package com.springcore.auto.wired.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("temp")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Set Himanshu:");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Constructer Himanshu:");
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}