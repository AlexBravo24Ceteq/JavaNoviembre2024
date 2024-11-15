package com.condicionales;

import java.util.Scanner;

public class Condicionales1_HTC {

	public static void main(String[] args) {
		// TRealiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.

		int firstN;
		int secondN;
		
		Scanner input = new Scanner(System.in);
		
		try { // Intenta ejecutar esto
		
			System.out.println("Introduzca Primer Número");
			firstN = input.nextInt();
			System.out.println("Introduzca Segundo Número");
			secondN = input.nextInt();
			
			
			if(firstN==secondN) {
				System.out.println("Ambos números son iguales");
			}else if(firstN>secondN) {
				System.out.println("Primer número es mayor.");
			}else {
				System.out.println("Segundo número es mayor.");
			}
		} catch (Exception e) { // si falla haz esto.
			System.out.println("Muy chistoso. Intenta de nuevo.");
		}
		
		
	}

}
