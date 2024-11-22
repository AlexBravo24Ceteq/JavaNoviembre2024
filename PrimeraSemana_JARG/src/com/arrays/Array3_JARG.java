package com.arrays;

import java.util.Scanner;

public class Array3_JARG {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.
		
		
		String cadena;
		System.out.println("Introduce una frase");
		Scanner entrada = new Scanner(System.in);
	
		
		cadena=entrada.nextLine();
		int longitud= cadena.length();
	
		
		for (int i=0; i<cadena.length();i++) {
			
			System.out.println(i+".- "+cadena.charAt(i));
		
		}	
		
		
		
		
		
		
	}

}
