package com.condicionales;

import java.util.Scanner;

public class Condicionales4_RAS {

	public static void main(String[] args) {

		/*
		 * 4. Realiza un programa que lea una cadena por teclado y compruebe si contiene
		 * letras mayúsculas.
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		String cadena;
		boolean bandera = false ;

		System.out.println("Introduce un texto: ");
		cadena = entrada.nextLine();
		
		for(int i=0; i<cadena.length(); i++) {
			Character letra= cadena.charAt(i);
			
			if (Character.isUpperCase(letra))
				bandera= true;	
		}
		if(bandera == true)
			System.out.println("El texto contiene letras mayusculas");
		else 
			System.out.println("El texto no contiene letras mayusculas");
		
		
	}

}
