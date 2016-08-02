package com.car.rental.api.impl.vehicles;

import com.car.rental.api.VehicleApi;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;

public class Van extends AbstractVehicle implements VehicleApi {

	private FuelType fueltype;
	private VehicleConditioning vehicleConditioning;

	public Van(FuelType fueltype, VehicleConditioning vehicleConditioning) {
		this.fueltype = fueltype;
		this.vehicleConditioning = vehicleConditioning;
	}

	private Van() {

	}

	@Override
	public double getStandardRate() {

		double standardRate = getStandardRate(fueltype, vehicleConditioning);
		
		return standardRate * (1 + getDiscount());
	}

	@Override
	public int getMaximumPassengers() {
		return 15;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
