package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Refactor1Test {
	Refactor1 refactor1test = new Refactor1();

	@Test
	void test() {
		int result = refactor1test.maximum(9,8,7);
		assertEquals(9,result);
	}
	
	@Test
	void test1() {
		float result = refactor1test.maximum(8.6f,7.6f,6.6f);
		assertEquals(8.6f,result);
	}
	
	@Test
	void test2() {

		String result = refactor1test.maximum("Apple","Peach","Banana");
		assertEquals("Apple",result);
	}

}
