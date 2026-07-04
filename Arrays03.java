package com.arrays;

import java.util.Arrays;

public class Arrays03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]=new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(marks));
		
		int marks2[] = Arrays03.test(marks);

		System.out.println(Arrays.toString(marks2));

	}

	public static int[] test(int[] n)
	{
		
		
		for(int i=0; i<n.length; i++)
		{
			n[i] =n[i]*2;
		}
		
		System.out.println(Arrays.toString(n));
		
		return n;
		
		
		
	}
}
