package com.bridgelabz.program;


import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestMaximumTest {
	TestMaximum testmaximumtest = new TestMaximum();
	

	@Test
	public void test() {
		
		int result = testmaximumtest.maximum(9,8,7);
		assertEquals(9,result);
	}
	
	@Test
	public void test1() {
		
		int result = testmaximumtest.maximum(8,9,7);
		assertEquals(9,result);
	}
	
	@Test
	public void test2() {
		
		int result = testmaximumtest.maximum(7,8,9);
		assertEquals(9,result);
	}


	

}
