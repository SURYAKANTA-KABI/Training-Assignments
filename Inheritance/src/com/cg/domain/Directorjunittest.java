package com.cg.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Directorjunittest {
	Director d1=new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);

	@Test
	public void testGetBudget() {
		assertEquals(d1.getBudget(),1_000_000.00);
	}

}
