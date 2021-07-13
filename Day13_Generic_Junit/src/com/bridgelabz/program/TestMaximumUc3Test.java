package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUc3Test {
	TestMaximumUc3 testmaximumuc3 = new TestMaximumUc3();

	@Test
	void test() {

		String result = testmaximumuc3.maximum("Apple","Peach","Banana");
		assertEquals("Apple",result);
	}
	
	@Test
	public void test1() {
		
		String result = testmaximumuc3.maximum("Peach","Apple","Banana");
		assertEquals("Apple",result);
	}
	
	@Test
	public void test2() {
		
		String result = testmaximumuc3.maximum("Banana","Peach","Apple");
		assertEquals("Apple",result);
	
	}

}
