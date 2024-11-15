package com.arrays;

public class Array2_JARG {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		
		int [] numeros = new int [100]; 
		float suma=0;
		float promedio;
		
		for (int i=0; i<numeros.length;i++) {
			numeros[i]= i+1;
			
			suma = numeros[i]+suma;
		
			
		
		}	
		
		promedio=suma/numeros.length;
			
		System.out.println("La suma de todos los números es "+suma);
		System.out.println("La media es "+promedio);
		}
	}


