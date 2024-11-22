package com.arrays;

import java.util.Scanner;

public class Arrays1_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde
		
		Scanner entrada = new Scanner(System.in);
		
		int []  numeros = new int [10];
		
		for(int i=0; i<=10; i++) {
			System.out.println("Ingresa un numero: ");
			numeros[i]= entrada.nextInt();
		}
		for(int i=0; i<10; i++) {
			System.out.println("Array["+i+"]= "+numeros[i]);
			
		}
		
	}

}
