package com.solid.entity;

import com.solid.service.AdminEditable;
import com.solid.service.ProviderEditable;

public class Transportation implements ProviderEditable,AdminEditable {
	private String transportationType;
	private String serviceID;
	private String serviceName;
	public String getTransportationType() {
		return transportationType;
	}
	public void setTransportationType(String transportationType) {
		this.transportationType = transportationType;
	}
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Transportation(String transportationType, String serviceID, String serviceName) {
		super();
		this.transportationType = transportationType;
		this.serviceID = serviceID;
		this.serviceName = serviceName;
	}
}
