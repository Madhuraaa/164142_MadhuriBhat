package com.madhuri.pojo;

public class User {
	
	public User(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	String username;
	String password;
	String UserType;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", UserType=" + UserType + "]";
	}

}
