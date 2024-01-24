package com.solid.service;

import com.solid.entity.ServiceProvider;

public class DisplayServiceProvider {

	public static void display(ServiceProvider currentServiceProvider) {
		System.out.println("Service provider ID : "+currentServiceProvider.getServiceProviderID());
		System.out.println("Service ID : "+currentServiceProvider.getTransportation().getServiceID());
		System.out.println("Service ID : "+currentServiceProvider.getTransportation().getServiceName());
	}

}
