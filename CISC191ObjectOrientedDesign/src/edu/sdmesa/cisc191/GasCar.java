package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for gas cars, a type of car
 */

public class GasCar extends Car implements Combustible {
	// Properties
	int fuelLevel = minFuel;
	
	// Constructor
	public GasCar(String manufacturer, int miles, int price, int seats, Option[] options, int doors) {
		super (manufacturer, miles, price, seats, options, doors);
	}

	// Methods
	@Override
	public int getFuelLevel() {
		return fuelLevel;
	}

	@Override
	public void tankUp() {
		fuelLevel = maxFuel;
	}

	@Override
	public void addFuel(int fuel) {
		fuelLevel += fuel;
		if (fuelLevel > maxFuel) {
			tankUp();
		}
	}
}
