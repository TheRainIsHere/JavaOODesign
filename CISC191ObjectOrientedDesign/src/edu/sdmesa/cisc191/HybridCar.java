package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for hybrid cars, a type of car
 */

public class HybridCar extends Car implements Chargeable, Combustible {
	// Properties
	int fuelLevel = minFuel;
	int chargeLevel = minCharge;
	
	// Constructor
	public HybridCar(String manufacturer, int miles, int price, int seats, Option[] options, int doors) {
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

	@Override
	public int getBatteryCharge() {
		return chargeLevel;
	}

	@Override
	public void chargeUp() {
		chargeLevel = maxCharge;
	}

	@Override
	public void chargeUp(int charge) {
		chargeLevel += charge;
		if (chargeLevel > maxCharge) {
			chargeUp();
		}
	}
	
}
