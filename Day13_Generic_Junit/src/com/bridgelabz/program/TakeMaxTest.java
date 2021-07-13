package com.bridgelabz.program;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TakeMaxTest {

	@Test
	void test() {
		Integer expected = 9 ;
        assertEquals(expected,new TakeMax(9,8,7).getMax());
    }

    @Test
    public void test1() {
        Integer expected = 9 ;
        assertEquals(expected,new TakeMax(8,9,7).getMax());
    }

    @Test
    public void test2() {
        Integer expected = 9 ;
        assertEquals(expected,new TakeMax(7,8,9).getMax());
    }
    @Test
    public void test3() {
        Float expected = 8.6f ;
        assertEquals(expected,new TakeMax(8.6f,7.6f, 6.6f).getMax());
    }

    @Test
    public void test4() {
        Float expected = 8.6f ;
        assertEquals(expected,new TakeMax(6.6f, 7.6f, 8.6f).getMax());
    }

    @Test
    public void test5() {
        Float expected = 8.6f ;
        assertEquals(expected,new TakeMax(7.6f, 6.6f, 8.6f).getMax());
    }
    
    @Test
    public void tes5() {
        assertEquals("Peach", new TakeMax("Apple", "Peach", "Banana").getMax());
    }

    @Test
    public void test6() {
        assertEquals("Peach", new TakeMax("Peach", "Apple", "Banana").getMax());
    }

    @Test
    public void test7() {
        assertEquals("Peach", new TakeMax("Banana", "Apple", "Peach").getMax());
    }
    
    @Test
	void test8() {
		Integer expected = 9 ;
        assertEquals(expected,new TakeMax(9, 8, 7, 6).getMax());
    }
    
    
    @Test
    public void test9() {
        Float expected = 8.6f ;
        assertEquals(expected,new TakeMax(8.6f, 7.6f, 6.6f, 5.6f).getMax());
    }
    
    @Test
    public void tes10() {
        assertEquals("Peach", new TakeMax("Apple", "Peach", "Banana", "mangoes").getMax());
    }
	

}
