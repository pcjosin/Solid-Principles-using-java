package com.solid.entity;

public class Admin extends User {
	private String adminID;

	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public Admin(String username, String adminID) {
		super(username);
		this.adminID = adminID;
	}
}
