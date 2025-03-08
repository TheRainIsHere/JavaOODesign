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
 * To provide a framework for chargeable vehicles
 */

/**
 * 
 */
public interface Chargeable
{
	public int minCharge = 0;
	public int maxCharge = 100;
	
	/**
	 * 
	 * @return the current charge of the battery
	 */
	abstract int getBatteryCharge();
	
	/**
	 * Set charge level to max
	 */
	abstract void chargeUp();
	/**
	 * 
	 * @param charge - the amount to charge the vehicle
	 */
	abstract void chargeUp(int charge);
}
