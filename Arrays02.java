package com.arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		int marks[] = new int[] {90,85,89,92,75};
		
       System.out.println("Before calling the test method:"+ Arrays.toString(marks));
		
		Arrays02.test(marks);
		
		System.out.println("After calling the test method:"+ Arrays.toString(marks));
		

	}
	
	public static void test(int[] marks)
	{
		//marks[0] = 67;
		System.out.println("In the test method:"+ Arrays.toString(marks));
		
		
	}

}
