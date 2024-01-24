package com.solid.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.solid.entity.Admin;
import com.solid.entity.Cruise;
import com.solid.entity.Customer;
import com.solid.entity.Flight;
import com.solid.entity.ServiceProvider;
import com.solid.entity.Taxi;
import com.solid.entity.Train;
import com.solid.entity.Transportation;
import com.solid.service.AdminEditable;
import com.solid.service.DisplayBookings;
import com.solid.service.DisplayServiceProvider;
import com.solid.service.SearchService;

public class TransportationUtility {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int service=1;

		ArrayList<ServiceProvider> providerList = new ArrayList<ServiceProvider>();
		ArrayList<ServiceProvider> bookedList = new ArrayList<ServiceProvider>();
			
//		Customer customer = new Customer ("cusername","customer");
//		Admin admin = new Admin("ausername","admin");
		
		String providerString="provider";
		String userName="username";
		
		providerList.add(new ServiceProvider(userName+service,providerString+service,new Flight("flight","service"+service,"flight"+service,""+service)));
		service++;
		providerList.add(new ServiceProvider(userName+service,providerString+service, new Taxi("taxi","service"+service,"taxi"+service,""+service)));
		service++;
		providerList.add(new ServiceProvider(userName+service,providerString+service, new Train("train","service"+service,"train"+service,""+service)));
		service++;
		providerList.add(new ServiceProvider(userName+service,providerString+service,new Cruise("cruise","service"+service,"cruise"+service,""+service)));
		
		System.out.println("********* Transportation booking ************");
		int loginOption;
		do {
			
			System.out.println("log in : \n1. customer log in\n2. Service provider log in\n3. Admin log in \n4. Exit");
			loginOption = scanner.nextInt();
			
			switch ( loginOption) {
			case 1 : System.out.println("logging in as customer...\n");
				int customerOption;
				do {
					System.out.println("choose an option : 1.Search and book transportation \n2. Display booked \n3. log out");
					customerOption=scanner.nextInt();
					
					switch(customerOption) {
						
					case 1:	ServiceProvider chosenServiceProvider = SearchService.search(providerList);
						if (chosenServiceProvider!=null){
							bookedList.add(chosenServiceProvider);
						}
						break;
						
					case 2: DisplayBookings.display(bookedList);
						break;
						
					case 3 : break;
						default: System.out.println("Choose a valid option!");
						break;
									
					}
				} while(customerOption!=3);
				
				break;
					
			case 2 : System.out.println("Enter Service provider ID : \n");
				String serviceProviderID = scanner.next();
				ServiceProvider currentServiceProvider=null;
				
				for( ServiceProvider serviceProvider : providerList) {
					if(serviceProvider.getServiceProviderID().compareTo(serviceProviderID)==0) {
						 currentServiceProvider=serviceProvider;
						 break;
					}
				}
				
				if ( currentServiceProvider!=null) {
					System.out.println("logging in as Service provider...\n");
					
					DisplayServiceProvider.display(currentServiceProvider);
					
					int providerOption;
					
					do {
						System.out.println("choose an option : 1.Edit Service name \n2. display details \n3. log out\n");
						providerOption=scanner.nextInt();
						
						switch(providerOption) {
							
						case 1:	System.out.println("Enter new Service name : ");
							String newServiceName=scanner.next();
							currentServiceProvider.getTransportation().setServiceName(newServiceName);
						break;
							
						case 2: DisplayServiceProvider.display(currentServiceProvider);
							break;
						
						case 3 : break;
							
						default: System.out.println("Choose a valid option!");
						break;
						
						}
					} while(providerOption!=3);	
				}
				
				else {
					System.out.println("Unable to log in. User not found!\n");
				}
				
				break;	
				
			case 3 : System.out.println("logging in as Admin...\n");
			
				System.out.println("Enter Id of Service provider : \n");
				String serviceProviderIDtoEdit = scanner.next();
				AdminEditable transportation =null;
				
				for( ServiceProvider serviceProvider : providerList) {
					if(serviceProvider.getServiceProviderID().compareTo(serviceProviderIDtoEdit)==0) {
						transportation= (Transportation) serviceProvider.getTransportation();
						 break;
					}
				}
				
				if ( transportation!=null) {				
					
					int providerOption;
					
					do {
						System.out.println("choose an option : 1.Edit Service ID \n2. log out\n");
						providerOption=scanner.nextInt();
						
						switch(providerOption) {
							
						case 1:	System.out.println("Enter new Service ID : ");
							String newServiceid=scanner.next();
							transportation.setServiceID(newServiceid);
						break;
						
						case 2 : break;
							
						default: System.out.println("Choose a valid option!");
						break;
						}
					} while(providerOption!=2);
				}
				
				else {
					System.out.println("Unable to find user \n");
				}
	
			break;
			
			case 4: break;
					
			default: System.out.println("Choose a valid option!");
			break; 	
				
			}
		
		}while(loginOption!=4);
	}
}
