package springmvc.user;

import java.util.List;

public class Student {

	private String name;
	private Long id;
	private String dob;
	private List<String> Courses;
	private String gender;
	private String type;
	private Address address;
	
	public String getName() {
		return name;
	}
	public Long getId() {
		return id;
	}
	public String getDob() {
		return dob;
	}
	public List<String> getCourses() {
		return Courses;
	}
	public String getGender() {
		return gender;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setCourses(List<String> courses) {
		Courses = courses;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", Courses=" + Courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}
   	
}