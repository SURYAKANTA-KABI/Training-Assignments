package com.cg.projects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Carjunittest {
	Car c1=new Car("Chevy","Corvette","red",2020,"23050.99");

	@Test
	public void testGetYear() {
		assertEquals(c1.getYear(),2020);
	}
	@Test
	public void testGetMake() {
		assertTrue(c1.getMake().equals("Chevy"));
	}

}
