package com.car.rental.api;

/**
 * Api which vehicles car, suv should implement to indicate standard rate, maximum number of passengers
 * and discount rates.
 * 
 * @author MuraliOffice
 *
 */
public interface VehicleApi {

	/**
	 * Returns Standard rate of the vehicle
	 * @return
	 */
	double getStandardRate();

	/**
	 * Returns maximum number of passengers allowed.
	 * @return
	 */
	int getMaximumPassengers();
	
	/**
	 * Returns discount rate if any.
	 * @return
	 */
	double getDiscount();
	
}
