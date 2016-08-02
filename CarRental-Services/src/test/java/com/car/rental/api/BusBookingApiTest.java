package com.car.rental.api;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.car.rental.api.impl.VehicleChargesApiImpl;
import com.car.rental.api.impl.vehicles.Bus;
import com.car.rental.constants.FuelType;
import com.car.rental.constants.VehicleConditioning;

/**
 * Tests Bus API functions
 * 
 * @author MuraliOffice
 *
 */
public class BusBookingApiTest {

	private Bus nonAcDieselBus;
	private Bus acDieselBus;
	private Bus nonAcPetrolBus;
	private Bus acPetrolBus;

	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		nonAcDieselBus =  new Bus(FuelType.DIESEL, VehicleConditioning.NONAC);
		acDieselBus =  new Bus(FuelType.DIESEL, VehicleConditioning.AC);
		nonAcPetrolBus =  new Bus(FuelType.PETROL, VehicleConditioning.NONAC);
		acPetrolBus =  new Bus(FuelType.PETROL, VehicleConditioning.AC);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testBusDieselNonAcBooking() {	
		assertTrue(nonAcDieselBus.getDiscount() == 0.02);
		assertTrue(nonAcDieselBus.getMaximumPassengers()== 50);
		assertTrue(nonAcDieselBus.getStandardRate()== 14 *
				(1 + nonAcDieselBus.getDiscount()));		
	}


	@Test
	public void testBusDieselAcBooking() {	
		assertTrue(acDieselBus.getDiscount() == 0.02);
		assertTrue(acDieselBus.getMaximumPassengers()== 50);
		assertTrue(acDieselBus.getStandardRate()== (14 + 
				2) * (1 + nonAcDieselBus.getDiscount()) );		
	}
	
	
	@Test
	public void testBusPetrolNonAcBooking() {	
		assertTrue(nonAcPetrolBus.getDiscount() == 0.02);
		assertTrue(nonAcPetrolBus.getMaximumPassengers()== 50);
		assertTrue(nonAcPetrolBus.getStandardRate()== 15 *
				(1 + nonAcPetrolBus.getDiscount()));			
	}
	
	@Test
	public void testBusPetrolAcBooking() {	
		assertTrue(acPetrolBus.getDiscount() == 0.02);
		assertTrue(acPetrolBus.getMaximumPassengers()== 50);
		assertTrue(acPetrolBus.getStandardRate()== (15 + 
					2) * (1 + acPetrolBus.getDiscount()) );			
	}

	
}
