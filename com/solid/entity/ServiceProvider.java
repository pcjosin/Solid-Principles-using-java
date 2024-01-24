package com.solid.entity;

import com.solid.service.ProviderEditable;

public class ServiceProvider extends User {
	private String serviceProviderID;
	private ProviderEditable transportation;
	public String getServiceProviderID() {
		return serviceProviderID;
	}
	public void setServiceProviderID(String serviceProviderID) {
		this.serviceProviderID = serviceProviderID;
	}
	public ProviderEditable getTransportation() {
		return transportation;
	}
	public void setTransportation(ProviderEditable transportation) {
		this.transportation = transportation;
	}
	public ServiceProvider(String username, String serviceProviderID, ProviderEditable transportation) {
		super(username);
		this.serviceProviderID = serviceProviderID;
		this.transportation = transportation;
	}
}
