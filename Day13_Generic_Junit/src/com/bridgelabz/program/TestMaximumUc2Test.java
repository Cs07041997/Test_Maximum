package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUc2Test {
	TestMaximumUc2 testmaximumuc2test = new TestMaximumUc2();

	@Test
	void test() {
		float result = testmaximumuc2test.maximum(8.6f,7.6f,6.6f);
		
	}

	@Test
	void test1() {
		float result = testmaximumuc2test.maximum(7.6f,8.6f,6.6f);
	}
	

	@Test
	void test2() {
		float result = testmaximumuc2test.maximum(6.6f,7.6f,8.6f);
	}
	
}
