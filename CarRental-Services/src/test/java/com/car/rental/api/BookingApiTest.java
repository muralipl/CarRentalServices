package com.car.rental.api;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.car.rental.api.impl.BookingApiImpl;
import com.car.rental.api.impl.VehicleChargesApiImpl;
import com.car.rental.api.impl.vehicles.Suv;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.TravelCities;
import com.car.rental.constants.VehicleConditioning;

/**
 * Tests Booking  API functions
 * 
 * @author MuraliOffice
 *
 */
public class BookingApiTest {

	private Suv nonAcDieselSuv;

	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		nonAcDieselSuv =  new Suv(FuelType.DIESEL, VehicleConditioning.NONAC);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test with passengers less than maximum capacity i.e 10
	 */
	@Test
	public void testSuvDieselNonAcBookingWithLessPassengers() {	
		BookingApi suvBooking = new BookingApiImpl(nonAcDieselSuv, 5, TravelCities.PUNE, TravelCities.MUMBAI ); 			
		assertTrue(suvBooking.getRatePerKilometer() == 14);
		assertTrue(suvBooking.geTravelKilometers() == 200);
		assertTrue(suvBooking.getTravelCost() == 200 * 14);		
	}
	
	/**
	 * Test with passengers greater than maximum capacity i.e 10
	 */
	@Test
	public void testSuvDieselNonAcBookingWithMorePassengers() {	
		BookingApi suvBooking = new BookingApiImpl(nonAcDieselSuv, 12, TravelCities.PUNE, TravelCities.MUMBAI ); 			
		assertTrue(suvBooking.getRatePerKilometer() == 14);
		assertTrue(suvBooking.geTravelKilometers() == 200);
		assertTrue(suvBooking.getTravelCost() == 200 * 14
				+ 2 * 1 *  suvBooking.geTravelKilometers());	
		
	}
		
}
