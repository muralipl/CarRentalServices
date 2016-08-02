package com.car.rental.api.impl.vehicles;

import com.car.rental.api.VehicleApi;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;

public class Suv extends AbstractVehicle implements VehicleApi {

	private FuelType fueltype;
	private VehicleConditioning vehicleConditioning;

	public Suv(FuelType fueltype, VehicleConditioning vehicleConditioning) {
		this.fueltype = fueltype;
		this.vehicleConditioning = vehicleConditioning;
	}

	private Suv() {

	}

	@Override
	public double getStandardRate() {

		double standardRate = getStandardRate(fueltype, vehicleConditioning);
		
		return standardRate * (1 + getDiscount());
	}

	@Override
	public int getMaximumPassengers() {
		return 10;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
