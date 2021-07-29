package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testadd() {
		int res= new Calculator().add(5, 4);
		assertEquals(9,res);
	}
	
	@Test
	public void testdiv() {
		int res= new Calculator().div(6, 3);
		assertEquals(2,res);
	}

}
