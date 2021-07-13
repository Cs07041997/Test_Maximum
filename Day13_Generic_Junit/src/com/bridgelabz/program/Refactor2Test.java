package com.bridgelabz.program;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Refactor2Test {
	
	@Test
	void test() {
		Integer expected = 9 ;
        assertEquals(expected,new Refactor2(9,8,7).getMax());
    }

    @Test
    public void test1() {
        Integer expected = 9 ;
        assertEquals(expected,new Refactor2(8,9,7).getMax());
    }

    @Test
    public void test2() {
        Integer expected = 9 ;
        assertEquals(expected,new Refactor2(7, 8, 9).getMax());
    }
    @Test
    public void test3() {
        Float expected = 8.6f ;
        assertEquals(expected,new Refactor2(8.6f, 7.6f, 6.6f).getMax());
    }

    @Test
    public void test4() {
        Float expected = 8.6f ;
        assertEquals(expected,new Refactor2(7.6f, 8.6f, 6.6f).getMax());
    }

    @Test
    public void test5() {
        Float expected = 8.6f ;
        assertEquals(expected,new Refactor2(6.6f, 7.6f, 8.6f).getMax());
    }
    
    @Test
    public void tes5() {
        assertEquals("Peach", new Refactor2("Apple", "Peach", "Banana").getMax());
    }

    @Test
    public void test6() {
        assertEquals("Peach", new Refactor2("Peach", "Apple", "Banana").getMax());
    }

    @Test
    public void test7() {
        assertEquals("Peach", new Refactor2("Banana", "Apple", "Peach").getMax());
    }
}
