package com.solid.entity;

public class Customer extends User {

	private String  customerID;
	
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Customer(String username, String customerID) {
		super(username);
		this.customerID = customerID;
	}	
}
