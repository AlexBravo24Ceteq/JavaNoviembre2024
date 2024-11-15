package com.ciclos;

import java.util.Scanner;

public class Ciclos2_HTC {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración deseada por el usuario.
		int number;
		int target;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca el número base");
		number = input.nextInt();
		System.out.println("Introduzca las iteraciones");
		target = input.nextInt();
		
		System.out.println("Aquí está tu tabla animal");
		
		for (int i = 1; i <= target ; i++) {
			System.out.println(number*i);
			
 		}
		
	}

}
