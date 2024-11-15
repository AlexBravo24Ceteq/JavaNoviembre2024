package com.arrays;

import java.util.Scanner;

public class Arrays1_JARG {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		int [] numeros=new int [10];
		
		Scanner entrada = new Scanner(System.in); 
		
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Introduce un número");
		
		
		numeros[i]= entrada.nextInt();
				
	
		}
			
		for (int i=0; i<numeros.length; i++) {
			System.out.println("El índice "+i+" es "+numeros[i]);
		}
		
	}

	}


