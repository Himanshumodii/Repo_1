package com.sp.ref;
public class A {

	private int x;
	private B ob;
	
	
	public int getX() {
		return x;
	}
	public B getOb() {
		return ob;
	}
	public void setX(int x) {
		this.x = x;
	}
    
	public void setOb(B ob) {
		this.ob = ob;
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
}