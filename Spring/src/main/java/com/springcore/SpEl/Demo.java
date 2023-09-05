package com.springcore.SpEl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
public class Demo{
 
  @Value("#{22+11}")
  private int x;
  
  @Value("#{2+4+6+7}")
  private int y;
  
  // we can pass static method
  @Value("#{ T(java.lang.Math).sqrt(144) }")
  private double z;

  // we can pass variable
  @Value("#{ T(java.lang.Math).E}")
  private double e;
  
  @Value("#{ T(java.lang.Math).PI}")
  private double PI;
  
  @Value("# { new Student('Himanshu Modi')}")
  private String name;
  
  // boolean
  @Value("#{8>3}")
  private boolean isActive;
  
    public double getPI(){
		return PI;
	}

	public void setPI(double e1) {
		this.PI = PI;
	  }

	public double getE() {
		return e;
	  }

   	public void setE(double e) {
		this.e = e;
	  }

	  public double getZ() {
		return z;
	  }
	  
	  public void setZ(double z) {
		System.out.println("YES Set z");
		this.z = z;
	  }
	  
	  public int getX() {
		return x;
	  }
	  
	  public int getY(){
		return y;
	  }
	  
	  public void setX(int x) {
		System.out.println("YES Set x");
		this.x = x;
	   }
	  
	  public void setY(int y){
		System.out.println("yes Set y");
		this.y = y;
	   }

@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", PI=" + PI + ", name=" + name + ", isActive="
			+ isActive + "]";
  }
}