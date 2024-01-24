package com.solid.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.solid.entity.ServiceProvider;

public class SearchService {

	public static ServiceProvider search(ArrayList<ServiceProvider> providerList) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------------ Search-------------");
		System.out.println("Enter string to search : ");
		
		String searchString = scanner.next();
		
		ServiceProvider chosenServiceProvider=null;
		
		ArrayList<ServiceProvider> searchResult = new ArrayList<ServiceProvider>();

		int option=1;
		for ( ServiceProvider serviceProvider : providerList) {
			if (serviceProvider.getTransportation().getServiceName().contains(searchString)||
					serviceProvider.getTransportation().getTransportationType().contains(searchString)) {
				searchResult.add(serviceProvider);
				System.out.println(option+" : ");
				DisplayServiceProvider.display(serviceProvider);
				option++;
			}
		}
		
		if (searchResult.size()==0) {
			return null;
		}
			
		chosenServiceProvider=BookingService.book(searchResult);
		
		return chosenServiceProvider;	
	}
}
