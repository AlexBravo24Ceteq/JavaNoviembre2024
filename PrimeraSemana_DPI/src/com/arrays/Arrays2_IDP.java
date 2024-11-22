package com.arrays;

public class Arrays2_IDP {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, 
		//que contendrá los números del 1 al 100. 
		//Obtén la suma de todos ellos y la media.
		
		int [] array = new int[100];
		int num =0;
		int suma = 0;
		
		//llenado del array
		for (int i = 0; i < array.length; i++) {
			array[i] = num +1;
			num ++;
			}
		//suma del array
		for (int i = 0; i < array.length; i++) {
			 suma = suma + array[i];
			 
			//System.out.println(suma);
			}
		System.out.println("La uma de los 100 numeros es: " + suma);
		System.out.println("La media de los 100 numeros es: "+ suma/array.length);
		
		
		
	}

}
