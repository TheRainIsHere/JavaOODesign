package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for cars, a type of vehicle
 */

public class Car extends Vehicle {
	// Properties
	private int doorCount;
	
	// Constructor
	public Car(String manufacturer, int miles, int price, int seats, Option[] options, int doors) {
		super (manufacturer, miles, price, seats, options);
		doorCount = doors;
	}
	
	// Methods
	public int getNumberOfDoors() {
		return doorCount;
	}
}
