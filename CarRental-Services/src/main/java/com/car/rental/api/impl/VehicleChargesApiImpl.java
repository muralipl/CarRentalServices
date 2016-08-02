package com.car.rental.api.impl;

import com.car.rental.api.VehicleChargesApi;

/**
 * Data is retrieved from database, file or http service.
 * 
 * Default implementation will return hard coded values.
 * 
 * @author MuraliOffice
 *
 */
public final class VehicleChargesApiImpl implements VehicleChargesApi {
	/**
	 * Returns Standard petrol vehicle rate
	 * @return
	 */
	@Override
	public double getStandardPetrolVehicleRatePerKm() {
		return 15;
	}
	
	/**
	 * Returns Ac charge per kilometer.
	 * @return
	 */
	@Override
	public double getAcChargePerKm() {
		return 2;
	}
	
	/**
	 * Returns Standard Diesel vehicle rate
	 * @return
	 */
	@Override
	public  double getStandardDieselVehicleRatePerKm() {
		return 14;
	}
	
	/**
	 * Returns additional charge per km per person when the travel exceeds maximum capacity.
	 * @return
	 */
	@Override
	public double getAdditionalChargesPerKmPerPerson()
	{
		return 1;
	}
	
	
}
