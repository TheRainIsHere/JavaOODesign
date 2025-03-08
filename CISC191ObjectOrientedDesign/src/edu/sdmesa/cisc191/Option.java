package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * Version/date: @version 03.08.25
 * 
 * Responsibilities of class:
 * To be able to create and manage options for vehicles
 */

public class Option {
	// Variables
	private String name;
	
	// Constructor
	public Option(String option) {
		name = option;
	}
	
	// Methods
	public String getDetails() {
		return name;
	}
}
