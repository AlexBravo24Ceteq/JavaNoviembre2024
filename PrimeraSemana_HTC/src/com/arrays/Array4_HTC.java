package com.arrays;

public class Array4_HTC {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5};
		int [] inverted = new int [5];
		int count=0;
		
		for (int i=numbers.length-1; i>-1; i--) {
			inverted[count]=numbers[i];
			count++;
		}
		
		//int fill = 1;
		//int sum = 0;
		//System.out.println(numbers.length);
		for (int i:numbers) { 
			System.out.println(i); 
		}
	
		System.out.println("De reversa");
		for (int i:inverted) { 
			System.out.println(i); 
		}

	}
}