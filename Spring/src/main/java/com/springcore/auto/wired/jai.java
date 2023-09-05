package com.springcore.auto.wired;

public class jai {
   
	private Emp emp;

	public Emp getEmp(){
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public jai(Emp emp) {
		super();
		this.emp = emp;
	}
	
	public jai() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "jai [emp=" + emp + "]";
	}

	
	
}
