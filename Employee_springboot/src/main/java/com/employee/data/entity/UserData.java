package com.employee.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserData {
	
	@Id
	private int id;
	private String userName;
	private String password;
	private String email;
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserData(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
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

}
