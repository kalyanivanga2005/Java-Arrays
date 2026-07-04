package com.arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println("Before calling the test method:"+ n);
		
		Arrays01.test(n);
		
		System.out.println("After calling the test method:"+ n);
		
		
		//test(n);
		
	}
	public static void test(int n)
	{
		n = 30;
		System.out.println("Inthe test method:"+ n);
	}

}
