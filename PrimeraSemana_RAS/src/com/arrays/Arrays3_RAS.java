package com.arrays;

import java.util.Scanner;

public class Arrays3_RAS {

	public static void main(String[] args) {

		/*
		 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres.
		 * 
		 */
		
		
		
		String frase;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una frase o palanbra: ");
		frase = entrada.nextLine();
		char arrayChar[]; 
		arrayChar = new char[frase.length()];
		
//		for (int i = 0; i < frase.length(); i++) {
//			arrayChar[i]=frase.charAt(i);
//			//System.out.println(arrayChar[i]);
//			}
		
		arrayChar=frase.toCharArray();
		//System.out.println("Imprimiendo el array de caracteres: " + arrayChar);
		System.out.print("Imprimiendo el array de caracteres: ");
		System.out.println(arrayChar);
		

	}

}
