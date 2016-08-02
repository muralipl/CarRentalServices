package com.car.rental.api.impl;

import com.car.rental.api.TravelKmsApi;
import com.car.rental.constants.TravelCities;
import com.car.rental.exceptions.TravelCitiesNotFoundException;

/**
 * HardCoded implementation which returns hardcoded kms from one place to another.
 * Actual implementation will pull from from database, file or http service. 
 * 
 * @author MuraliOffice
 *
 */
public class TravelKmsApiImpl implements TravelKmsApi {
	
	@Override
	public  double getTravelKilometers(TravelCities travelFrom, TravelCities travelTo) {
		
		double distance = 0;
		
		if(travelFrom.compareTo(TravelCities.PUNE) == 0  && 
				travelTo.compareTo(TravelCities.MUMBAI) == 0)
			distance = 200;
		
		
		if(travelFrom.compareTo(TravelCities.PUNE) == 0  && 
				travelTo.compareTo(TravelCities.BANGALORE) == 0)
			distance = 1000;

		
		if(travelFrom.compareTo(TravelCities.MUMBAI) == 0  && 
				travelTo.compareTo(TravelCities.DELHI) == 0)
			distance = 2050;
		
		if(travelFrom.compareTo(TravelCities.MUMBAI) == 0  && 
				travelTo.compareTo(TravelCities.CHENNAI) == 0)
			distance = 1234.5;
		
		//Travel Cities not found
		if(distance == 0 ) {
			throw new TravelCitiesNotFoundException("Details of Travel from(" + travelFrom.toString() + ") to ("
					+ travelTo.toString() + ") not found");
		}
		
		return distance;		
	}

}
