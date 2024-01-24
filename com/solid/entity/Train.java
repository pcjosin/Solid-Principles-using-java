package com.solid.entity;

public class Train extends Transportation {
	private String trainNumber;

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Train(String transportationType, String serviceID, String serviceName, String trainNumber) {
		super(transportationType, serviceID, serviceName);
		this.trainNumber = trainNumber;
	}
}
