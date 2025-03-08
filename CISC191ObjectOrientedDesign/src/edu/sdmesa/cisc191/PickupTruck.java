package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for pickup trucks, a type of vehicle
 */

public class PickupTruck extends Vehicle {
	// Properties
	private int cargoCapacity;
	
	// Constructor
	public PickupTruck(String manufacturer, int miles, int price, int seats, Option[] options, int capacity) {
		super (manufacturer, miles, price, seats, options);
		cargoCapacity = capacity;
	}
	
	// Methods
	/**
	 * 
	 * @return capacity of truck
	 */
	public int getCargoCapacity() {
		return cargoCapacity;
	}
}
