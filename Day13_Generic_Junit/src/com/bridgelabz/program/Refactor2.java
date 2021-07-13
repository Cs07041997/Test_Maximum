package com.bridgelabz.program;

public class Refactor2 <E extends Comparable<E>> {
	E x;
	E y;
	E z;
	
	public Refactor2(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
				
	}
	

		public static void main(String[] args) {
		
		System.out.println(new  Refactor2(8.6f,7.6f,6.6f).getMax());
		System.out.println(new  Refactor2(7,8,9).getMax());
		System.out.println(new  Refactor2("apple", "banana", "peach").getMax());
	}

	public static <E extends Comparable<E>> E getMax(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public <E extends Comparable<E>> E getMax() {
		E max = (E) getMax(x, y, z);
		return max;
	}

}
