package com.solid.entity;

public class Taxi extends Transportation {
	private String taxiNumber;

	public String getTaxiNumber() {
		return taxiNumber;
	}

	public void setTaxiNumber(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public Taxi(String transportationType, String serviceID, String serviceName, String taxiNumber) {
		super(transportationType, serviceID, serviceName);
		this.taxiNumber = taxiNumber;
	}
}
