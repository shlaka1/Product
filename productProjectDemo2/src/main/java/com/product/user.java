package com.product;

import javax.persistence.*;

@Entity
public class user {
	@Id
	private String username;
	private String password;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

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
	
	

}
