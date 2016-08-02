package com.car.rental.exceptions;

public class TravelCitiesNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TravelCitiesNotFoundException(String travelStr) {
		super(travelStr);
	}

}
