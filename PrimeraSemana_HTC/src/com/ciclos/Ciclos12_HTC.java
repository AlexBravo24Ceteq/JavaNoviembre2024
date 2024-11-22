package com.ciclos;

import java.util.Scanner;

public class Ciclos12_HTC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int suma = 0;
		int promedio = 0;
		int count = 0;
		int edad = 0;
		
		while(promedio<25) {
			
			System.out.println("Introduce la edad");
			edad = input.nextInt();
			count++;
			suma+=edad;
			promedio = suma/count;
			
			System.out.println(promedio);
			
		} 
		
	}
	
}


