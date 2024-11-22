package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JARG {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.

		String cadena;
		
	System.out.println("Introduce una palabra");
	Scanner entrada = new Scanner(System.in); 
	cadena = entrada.nextLine();
	
	//Condicional usando .equal, upperCase y lowerCase según sea el caso
	if (cadena.equals(cadena.toUpperCase())) {
		System.out.println("Contiene mayúsculas");
	}  else if (cadena.equals(cadena.toLowerCase())) {
		System.out.println("Contiene minúsculas");
	} else {
		System.out.println("Contiene Mayúsculas");
	}
	
	
	}

}
