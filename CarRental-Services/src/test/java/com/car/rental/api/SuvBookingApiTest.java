package com.car.rental.api;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.car.rental.api.impl.vehicles.Suv;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;

/**
 * Tests Suv API functions
 * 
 * @author MuraliOffice
 *
 */
public class SuvBookingApiTest {

	private Suv nonAcDieselSuv;
	private Suv acDieselSuv;
	private Suv nonAcPetrolSuv;
	private Suv acPetrolSuv;

	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		nonAcDieselSuv =  new Suv(FuelType.DIESEL, VehicleConditioning.NONAC);
		acDieselSuv =  new Suv(FuelType.DIESEL, VehicleConditioning.AC);
		nonAcPetrolSuv =  new Suv(FuelType.PETROL, VehicleConditioning.NONAC);
		acPetrolSuv =  new Suv(FuelType.PETROL, VehicleConditioning.AC);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSuvDieselNonAcBooking() {	
		assertTrue(nonAcDieselSuv.getDiscount() == 0);
		assertTrue(nonAcDieselSuv.getMaximumPassengers()== 10);
		assertTrue(nonAcDieselSuv.getStandardRate()== 14);		
	}

	@Test
	public void testSuvDieselAcBooking() {	
		assertTrue(acDieselSuv.getDiscount() == 0);
		assertTrue(acDieselSuv.getMaximumPassengers()== 10);
		assertTrue(acDieselSuv.getStandardRate()== 14 + 
				2);		
	}
	
	@Test
	public void testSuvPetrolNonAcBooking() {	
		assertTrue(nonAcPetrolSuv.getDiscount() == 0);
		assertTrue(nonAcPetrolSuv.getMaximumPassengers()== 10);
		assertTrue(nonAcPetrolSuv.getStandardRate()== 15);		
	}
	
	@Test
	public void testSuvPetrolAcBooking() {	
		assertTrue(acPetrolSuv.getDiscount() == 0);
		assertTrue(acPetrolSuv.getMaximumPassengers()== 10);
		assertTrue(acPetrolSuv.getStandardRate()== 15 + 
				2);		
	}
	
	
}
