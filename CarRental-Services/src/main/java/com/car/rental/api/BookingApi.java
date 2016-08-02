package com.car.rental.api;

/**
 * 
 * Utilities to be implemented for booking travel.
 * 
 * @author MuraliOffice
 *
 */
public interface BookingApi {

	/**
	 * Returns Rate per kilometer
	 * @return
	 */
	public double getRatePerKilometer();
	
	/**
	 * Returns number of Travel Kilometers
	 * @return
	 */
	public double geTravelKilometers();
	
	
	/**
	 * Returns Total travel cost.
	 * 
	 * @return
	 */
	public double getTravelCost();
	
}
