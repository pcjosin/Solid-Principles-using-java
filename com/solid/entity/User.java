package com.solid.entity;

public class User {
	private String username;

	public User(String username) {
		super();
		this.setUsername(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
