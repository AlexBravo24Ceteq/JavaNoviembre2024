package com.arrays;

import java.util.Scanner;

public class Arrays1_IDP {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde. 
		
		int[] array= new int[10];
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("inroduce 10 numeros");
		
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = entrada.nextInt();
			System.out.println(":::");
		}
		
		System.out.println("imprimiendo el arreglo");
		
		for (int i = 0; i < array.length ; i++) {
			System.out.println("El valor del indice "+ i + "  es: " + array[i]);
			
		}
		
		

	}

}
