package com.haih.model;


public class User {
    private String id;
    private String userName;
    private String password;
    
	public User(String id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
    
	public User() {
		super();
	}

	public String getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + "]";
	}
    
}
