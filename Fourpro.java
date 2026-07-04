package com.arrays;

public class Fourpro {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5};
		
		int b[] = new int[a.length];
		
		/*
		b[0] = a[0]; 
		b[1] = a[1]; 
		b[2] = a[2]; 
		b[3] = a[3];
		b[4] = a[4]; 
		
		b =Arrays.copyOf(a, a.length); ------> deep copy	
        */
		
		 // b=a; ------> shallow copy(direct copy)
		
		for(int i=0; i<a.length;i++)
		{
			b[i] = a[i];
		} 
		
	}

}
