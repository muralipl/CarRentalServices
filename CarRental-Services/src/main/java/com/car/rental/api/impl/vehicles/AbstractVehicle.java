package com.car.rental.api.impl.vehicles;

import com.car.rental.api.VehicleChargesApi;
import com.car.rental.api.impl.VehicleChargesApiImpl;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;
/**
 * Charges to be determined based on vehicle details.
 * 
 * @author MuraliOffice
 *
 */
public abstract class AbstractVehicle {
	
	private final VehicleChargesApi vehiclecharges = new VehicleChargesApiImpl();
	
	public final double getStandardRate(FuelType fueltype, VehicleConditioning vehicleConditioning) {
		
		double standardRate = 0;

		if (fueltype == FuelType.PETROL) {
			if (vehicleConditioning == VehicleConditioning.AC) {
				standardRate = vehiclecharges.getStandardPetrolVehicleRatePerKm()  + vehiclecharges.getAcChargePerKm();
			} else {
				standardRate = vehiclecharges.getStandardPetrolVehicleRatePerKm();
			}
		}

		if (fueltype == FuelType.DIESEL) {
			if (vehicleConditioning == VehicleConditioning.AC) {
				standardRate = vehiclecharges.getStandardDieselVehicleRatePerKm() + vehiclecharges.getAcChargePerKm();
			} else {
				standardRate = vehiclecharges.getStandardDieselVehicleRatePerKm();
			}
		}
		
		return standardRate;
	}

}
