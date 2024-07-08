package springmvcsearch.model;

import java.util.Date;
import java.util.List;

public class User {
	
	private String name;
	private String email;
	private Date dob;
	private List<String> courses;
	private String gender;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", dob=" + dob + ", courses=" + courses + ", gender="
				+ gender + ", address=" + address + "]";
	}

}
