package com.car.rental.api.impl.vehicles;

import com.car.rental.api.VehicleApi;
import com.car.rental.api.impl.VehicleChargesApiImpl;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;

public class Car extends AbstractVehicle implements VehicleApi {

	private FuelType fueltype;
	private VehicleConditioning vehicleConditioning;

	public Car(FuelType fueltype, VehicleConditioning vehicleConditioning) {
		this.fueltype = fueltype;
		this.vehicleConditioning = vehicleConditioning;
	}

	private Car() {

	}

	@Override
	public double getStandardRate() {

		double standardRate = getStandardRate(fueltype, vehicleConditioning);
		
		return standardRate * (1 + getDiscount());
	}

	@Override
	public int getMaximumPassengers() {
		return 5;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
