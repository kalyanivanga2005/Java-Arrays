package com.arrays;

import java.util.Scanner;

public class Secondpro {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int array[] = new int[] {1,2,3};
		
		for(int i=0; i<array.length;i++) {
			
			System.out.println("Enter Value:" +(i+1));
			
			array[i] = scan.nextInt();
			
		}
		
		scan.close();
		
	}
	
	

}
