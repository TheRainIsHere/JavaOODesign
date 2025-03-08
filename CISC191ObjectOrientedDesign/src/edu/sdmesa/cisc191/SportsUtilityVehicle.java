package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for SUVs, a type of vehicle
 */

public class SportsUtilityVehicle extends Vehicle {
	// Variables
	private int maxTowingWeight;
	
	// Constructor
	public SportsUtilityVehicle(String manufacturer, int miles, int price, int seats, Option[] options, int towingMax) {
		super (manufacturer, miles, price, seats, options);
		maxTowingWeight = towingMax;
	}
	
	// Methods
	/**
	 * 
	 * @return max towing weight
	 */
	public int getMaxTowingWeight() {
		return maxTowingWeight;
	}
}
