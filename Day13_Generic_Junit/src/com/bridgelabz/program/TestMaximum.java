package com.bridgelabz.program;

public class TestMaximum {
	public static <E extends Comparable<E>> E maximum(E x , E y ,  E z){
		E max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
		
	}

	public static void main(String[] args) {
		System.out.println("maximum is" +maximum(9,8,7));

	}

}
