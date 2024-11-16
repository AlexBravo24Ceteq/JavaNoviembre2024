package com.arrays;

import java.util.Scanner;

public class Arrays1_AED {

	public static void main(String[] args) {
		
		// Ejercicio 1
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		// Muestra por consola el índice y el valor al que corresponde.
		
		int[] numeros = new int[10];
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("ingrese 10 números a su eleccion");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número en la posición " + i + ": ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("orden de los valores");
		for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

	}

}
