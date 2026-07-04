package com.arrays;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		
		
		
		int marks[] = Arrays06.test(); // anonymous array
		
		 System.out.println(Arrays.toString(marks));
	}
	
	
	public static int[] test()
	{
		
		return new int[] {1,2,3,4,5};
		
		// Returning anonymous array
		
	}

}
