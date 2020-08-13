package model;

//Type your code here
public class User{
	public String name;
	public String email;
	public String dob;
	public String gender;
	
	
	public String getDob() {
		return dob;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public User(String name, String email, String dob) {
		
		this.name = name;
		//this.gender = gender;
		this.dob = dob;
	}
}