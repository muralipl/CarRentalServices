package com.car.rental.api.impl;

import com.car.rental.api.BookingApi;
import com.car.rental.api.TravelKmsApi;
import com.car.rental.api.VehicleApi;
import com.car.rental.api.VehicleChargesApi;
import com.car.rental.constants.TravelCities;

public class BookingApiImpl implements BookingApi {

	private VehicleApi vehicleType;
	private int numberOfPassengers;
	private TravelCities departureCity;
	private TravelCities arrivalCity;
	
	/**
	 * Instantiate a implementation of TravelKmsApi
	 */
	private final TravelKmsApi travelKms = new TravelKmsApiImpl();
	
	/**
	 * Instantiate implementation of VehicleChargesApi
	 */
	private final VehicleChargesApi vehicleCharges = new VehicleChargesApiImpl();

	/**
	 * 
	 * @param vehicle Type of vehicle
	 * @param passengers number of passengers travelling
	 * @param travelFrom travelling from city
	 * @param travelTo travelling to city.
	 */
	public BookingApiImpl(VehicleApi vehicle, int passengers, 
			TravelCities  travelFrom, TravelCities  travelTo) {
		vehicleType = vehicle;
		numberOfPassengers = passengers;	
		departureCity = travelFrom;
		arrivalCity = travelTo;
	}

	private BookingApiImpl() {

	}

	@Override
	public double getRatePerKilometer() {
		return vehicleType.getStandardRate();
	}

	@Override
	public double geTravelKilometers() {
		return travelKms.getTravelKilometers(departureCity, arrivalCity);
	}

	@Override
	public double getTravelCost() {
		double satandardRate = vehicleType.getStandardRate() * geTravelKilometers();
		double extraCharges = 0;
		int maxPassengers = vehicleType.getMaximumPassengers();
		if(numberOfPassengers > maxPassengers ) {
			int excessPersons = numberOfPassengers - maxPassengers;
		   extraCharges = geTravelKilometers() * excessPersons * vehicleCharges.getAdditionalChargesPerKmPerPerson();		
		}
		
	  return satandardRate + extraCharges;
	}

}
