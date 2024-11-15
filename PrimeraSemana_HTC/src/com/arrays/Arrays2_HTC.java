package com.arrays;

public class Arrays2_HTC {

	public static void main(String[] args) {
		
		int [] numbers = new int [100];
		int fill = 1;
		int sum = 0;
		
		for(int i=0; numbers.length > i; i++ ) {
			numbers[i] = fill;
			//System.out.println(numbers[i]);
			fill++;
		}

		for(int i:numbers) {
			sum+=i;
		}
		
		int median = sum/100;
		System.out.printf("%s%d%n%s%d","Sumatoria: ",sum,"Media: ",median);
	}

}
