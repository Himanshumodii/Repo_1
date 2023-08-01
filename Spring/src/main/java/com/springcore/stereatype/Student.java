package com.springcore.stereatype;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Student {
 
	@Value("Himanshu")
	private String studentName;
	
	@Value("Dewas")
	private String city;

	@Value("#{temp}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getCity() {
		return city;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}	
}