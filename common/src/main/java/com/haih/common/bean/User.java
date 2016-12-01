package com.haih.common.bean;


public class User {
    private String id;
    private String userName;
    private String age;
    private String password;
    
	public User(String id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
    
	public User() {
		super();
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
    public String getAge() {
		return age;
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
