package com.ciclos;

import java.util.Scanner;

public class Ciclos8_HTC {

	public static void main(String[] args) {

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
				System.out.println(firstN + "," + secondN);
			}else {
				System.out.println(secondN + "," + firstN);
			}
		} catch (Exception e) { // si falla haz esto.
			System.out.println("Muy chistoso. Intenta de nuevo.");
		}
	}
}
