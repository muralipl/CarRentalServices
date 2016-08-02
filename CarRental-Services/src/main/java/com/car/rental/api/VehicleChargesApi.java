package com.car.rental.api;

/**
 * Charges of vehicle charges which has to be implemented to indicate charges.
 * 
 * @author MuraliOffice
 *
 */
public interface VehicleChargesApi {

	/**
	 * Returns Standard petrol vehicle rate
	 * @return
	 */
	public  double getStandardPetrolVehicleRatePerKm();
	
	
	/**
	 * Returns Ac charge per kilometer.
	 * @return
	 */
	public  double getAcChargePerKm();
	
	/**
	 * Returns Standard Diesel vehicle rate
	 * @return
	 */
	public  double getStandardDieselVehicleRatePerKm();
	
	/**
	 * Returns additional charge per km per person when the travel exceeds maximum capacity.
	 * @return
	 */
	public  double getAdditionalChargesPerKmPerPerson();

}
