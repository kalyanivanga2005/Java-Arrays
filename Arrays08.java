package com.arrays;

import java.util.Arrays;

public class Arrays08 {

	public static void main(String[] args) {
		
		
		Arrays08.test(10,20); 
		Arrays08.test(10,20,30);
		Arrays08.test(10,20,30,40);
		 
	}
	
	//varargs--->Variable number of arguments
	
	public static void test(int... a)  // ellipses--->(...)
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println("SUM:"+ sum);
		
	}
	
	
}
