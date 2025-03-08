package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for electric cars, a type of car
 */

public class ElectricCar extends Car implements Chargeable {
	// Properties
	int chargeLevel = minCharge;
	
	// Constructor
	public ElectricCar(String manufacturer, int miles, int price, int seats, Option[] options, int doors) {
		super (manufacturer, miles, price, seats, options, doors);
	}

	// Methods
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
