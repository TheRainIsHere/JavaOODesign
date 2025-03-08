package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage vehicle objects
 */

public class Vehicle
{
	// Properties
	private String manufacturerName;
	int milesDriven;
	int vehiclePrice;
	int seatCount;
	Option[] vehicleOptions;
	
	// Primary constructor
	public Vehicle(String manufacturer, int miles, int price, int seats) {
		manufacturerName = manufacturer;
		milesDriven = miles;
		vehiclePrice = price;
		seatCount = seats;
	}
	// Overloaded constructor
	public Vehicle(String manufacturer, int miles, int price, int seats, Option[] options) {
//		Vehicle(manufacturer, miles, price, seats);
		
		manufacturerName = manufacturer;
		milesDriven = miles;
		vehiclePrice = price;
		seatCount = seats;
		vehicleOptions = options;
	}
	
	/**
	 * 
	 * @return name of the manufacturer
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}
	/**
	 * 
	 * @return miles on the vehicle
	 */
	public int getMilesOnVehicle() {
		return milesDriven;
	}
	/**
	 * 
	 * @return price of vehicle
	 */
	public int getPrice() {
		return vehiclePrice;
	}
	/**
	 * 
	 * @return number of seats
	 */
	public int getNumberOfSeats() {
		return seatCount;
	}
	/**
	 * 
	 * @return the array of options the vehicle has
	 */
	public Option[] getOptions() {
		return vehicleOptions;
	}
}
