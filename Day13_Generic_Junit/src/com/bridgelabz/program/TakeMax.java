package com.bridgelabz.program;

public class TakeMax <E extends Comparable<E>> {
	E x;
	E y;
	E z;
    E[] extraParameters;
	
	public TakeMax(E x, E y, E z, E... extraParameters) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.extraParameters = extraParameters; 		
	}
	

		public static void main(String[] args) {
		
		System.out.println(new TakeMax(8.6f,7.6f,6.6f,5.6f).getMax());
		System.out.println(new TakeMax(7,8,9,5).getMax());
		System.out.println(new TakeMax("apple", "banana", "peach","mangoes").getMax());
	}

	public static <E extends Comparable<E>> E getMax(E x, E y, E z, E... extraParameters) {
		E max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		if (extraParameters.length != 0) {
			for (E extraParamater : extraParameters) {
				if (extraParamater.compareTo(max) > 0) {
					max = extraParamater;
				}
			}
		}
		return max;
	}

	public <E extends Comparable<E>> E getMax() {
		E max = (E) getMax(x, y, z, extraParameters);
		return max;
	}

	

}
