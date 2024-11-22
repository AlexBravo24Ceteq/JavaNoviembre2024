package com.arrays;

import java.util.Scanner;

public class Arrays1_LASV {

	public static void main(String[] args) {
		//Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde. 
				
		
		int []numeros = new int [10];

		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("introduce hasta 10 numeros");
			numeros[i] = entrada.nextInt();
			
		}

		for (int i = 0; i < 11; i++) {
			System.out.println("El indice de cada numero es: " + numeros[i]);
			
		}
		
	}

}
