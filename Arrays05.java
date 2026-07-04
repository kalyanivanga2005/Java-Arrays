package com.arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		
		
		
		int marks[] = Arrays05.test(new int[] {1,2,3,4,5}); // anonymous array
		
		 System.out.println(Arrays.toString(marks));
	}
	
	
	public static int[] test(int n[])
	{
		for(int i=0; i<n.length; i++)
		{
			n[i] = n[i]*2;
		}
		return n;
		// System.out.println(Arrays.toString(n));
		
	}

}
