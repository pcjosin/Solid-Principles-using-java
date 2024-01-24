package com.solid.entity;

public class Cruise extends Transportation {
	private String cruiseNumber;

	public String getCruiseNumber() {
		return cruiseNumber;
	}

	public void setCruiseNumber(String cruiseNumber) {
		this.cruiseNumber = cruiseNumber;
	}

	public Cruise(String transportationType, String serviceID, String serviceName, String cruiseNumber) {
		super(transportationType, serviceID, serviceName);
		this.cruiseNumber = cruiseNumber;
	}
}
