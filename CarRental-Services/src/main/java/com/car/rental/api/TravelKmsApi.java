package com.car.rental.api;

import com.car.rental.constants.TravelCities;

/**
 * Api which provides kilometers to travel from one place to another
 * @author MuraliOffice
 *
 */
public interface TravelKmsApi {

	/**
	 * Returns number of Kilometers from source to destination
	 * @param travelFrom
	 * @param travelTo
	 * @return
	 */
	public double getTravelKilometers(TravelCities travelFrom, TravelCities travelTo);
}
