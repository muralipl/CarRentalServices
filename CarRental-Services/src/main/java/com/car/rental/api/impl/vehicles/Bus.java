package com.car.rental.api.impl.vehicles;

import com.car.rental.api.VehicleApi;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;

public class Bus extends AbstractVehicle implements VehicleApi {

	private FuelType fueltype;
	private VehicleConditioning vehicleConditioning;

	public Bus(FuelType fueltype, VehicleConditioning vehicleConditioning) {
		this.fueltype = fueltype;
		this.vehicleConditioning = vehicleConditioning;
	}

	private Bus() {

	}

	@Override
	public double getStandardRate() {

		double standardRate = getStandardRate(fueltype, vehicleConditioning);
		
		return standardRate * (1 + getDiscount());
	}

	@Override
	public int getMaximumPassengers() {
		return 50;
	}

	@Override
	public double getDiscount() {
		return 0.02;
	}

}
