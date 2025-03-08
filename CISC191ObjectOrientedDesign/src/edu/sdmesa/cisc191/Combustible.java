package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To provide a framework for gas vehicles
 */

public interface Combustible {
	// Properties
	public int minFuel = 0;
	public int maxFuel = 50;
	
	// Methods
	/**
	 * 
	 * @return the current fuel level
	 */
	abstract int getFuelLevel();
	
	/**
	 * Fill fuel level to the max
	 */
	abstract void tankUp();
	
	/**
	 * Add the specified amount of fuel to a vehicle
	 * @param fuel to add
	 */
	abstract void addFuel(int fuel);
}
