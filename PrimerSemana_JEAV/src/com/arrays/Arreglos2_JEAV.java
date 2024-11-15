package com.arrays;

public class Arreglos2_JEAV {

	public static void main(String[] args) {

		int [] arreglo = new int [100];
		
		int suma = 0;
		
		for(int i=1; i <= arreglo.length; i++) {
			
			arreglo[i-1] = i;
			
			suma = suma + i;
		}
		
		System.out.println("La suma es " + suma);
		System.out.println("La media es " + suma/arreglo.length);

	}

}
