package com.solid.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.solid.entity.ServiceProvider;

public class BookingService {

	public static ServiceProvider book(ArrayList<ServiceProvider> searchResult) {
		
		Scanner scanner = new Scanner(System.in);
		ServiceProvider chosenServiceProvider=null;

		System.out.println("Choose an option : ");
		int optionChosen = scanner.nextInt();
		
		chosenServiceProvider=searchResult.get(optionChosen-1);
		
		return chosenServiceProvider;		
	}
}
