package com.springcore.ci;

import java.util.List;

public class Person {
           
	private String name;
	private int persionId;
	private Certi certi;
	private List<String> list;
	
	public Person(String name, int personId, Certi certi, List<String> list) {
		this.name = name;
		this.persionId = personId;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", persionId=" + persionId + ", certi=" + certi + ", list=" + list + "]";
	}
    
/*	@Override
	public String toString() {
		return this.name+" : "+this.persionId+"{ "+this.certi.name+" }";
	}	*/
	
}