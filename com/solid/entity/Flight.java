package com.solid.entity;

public class Flight extends Transportation {
	private String flightNumber;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Flight(String transportationType, String serviceID, String serviceName, String flightNumber) {
		super(transportationType, serviceID, serviceName);
		this.flightNumber = flightNumber;
	}
}
