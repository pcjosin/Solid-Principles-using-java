package com.solid.service;

import java.util.ArrayList;

import com.solid.entity.Cruise;
import com.solid.entity.Flight;
import com.solid.entity.ServiceProvider;
import com.solid.entity.Taxi;
import com.solid.entity.Train;
import com.solid.entity.Transportation;

public class DisplayBookings {

	public static void display(ArrayList<ServiceProvider> bookedList) {
		for (ServiceProvider serviceProvider : bookedList) {
			
			Transportation transportation = (Transportation) serviceProvider.getTransportation();
			if (transportation instanceof Flight)
			{
				Flight flight = (Flight)transportation;
				System.out.println("Type : "+ flight.getTransportationType());
				System.out.println("Flight Number : "+ flight.getFlightNumber());

			}
			else if (transportation instanceof Taxi)
			{
				Taxi taxi = (Taxi)transportation;
				System.out.println("Type : "+ taxi.getTransportationType());
				System.out.println("taxi Number : "+ taxi.getTaxiNumber());

			}
			else if (transportation instanceof Cruise)
			{
				Cruise cruise = (Cruise)transportation;
				System.out.println("Type : "+ cruise.getTransportationType());
				System.out.println("Cruise Number : "+ cruise.getCruiseNumber());
			}
			else if (transportation instanceof Train)
			{
				Train train = (Train)transportation;
				System.out.println("Type : "+ train.getTransportationType());
				System.out.println("Train Number : "+ train.getTrainNumber());

			}
			
			System.out.println("\n");
			
		}
	}


}
