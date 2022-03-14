package com.cg.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Employee1junittest {
	Employee1 e1=new Employee1(101,"Jane smith","012-34-5678",120_345.27);

	@Test
	public void testGetName() {
		assertTrue(e1.getName().equals("Jane smith"));
	}

}
