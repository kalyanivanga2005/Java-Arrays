package com.arrays;

import java.util.Arrays;

public class Arrays07 {

	public static void main(String[] args) {
		
		
		Arrays07.test(10,20); 
		Arrays07.test(10,20,30);
		Arrays07.test(10,20,30,40);
		 
	}
	
	
	public static void test(int a, int b)
	{
		System.out.println("Sum Of Two values:" + (a+b));
		
	}
	
	public static void test(int a, int b, int c)
	{
		System.out.println("Sum Of Two values:" + (a+b+c));
		
	}

	public static void test(int a, int b, int c, int d)
	{
		System.out.println("Sum Of Two values:" + (a+b+c+d));
		
	}
}
