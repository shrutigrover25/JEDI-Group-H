package com.flipkart.bean;

public class GymCustomer extends User {
	
	int regphoneNumber;
	
	String Name;
	int userId;
	String password;
	String email;
	String userType;
	
	
	
	public int getRegphoneNumber() {
		return regphoneNumber;
	}

	public void setRegphoneNumber(int regphoneNumber) {
		this.regphoneNumber = regphoneNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	

}
