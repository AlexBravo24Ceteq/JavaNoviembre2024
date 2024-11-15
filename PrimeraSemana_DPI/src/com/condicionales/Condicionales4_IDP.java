package com.condicionales;

import java.util.Scanner;

public class Condicionales4_IDP {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas

		String texto;
		String textLowercase;
		Scanner entradaCadena = new Scanner(System.in);
		
		System.out.println("introduce una cadena para comprobar si tiene myusculas");
		
		texto = entradaCadena.nextLine();
		textLowercase = texto.toLowerCase();
		
		if (texto.equals(textLowercase)) {
			System.out.println("la cadena No contiene MAYUSCULAS");	
		}else {
			System.out.println("la cadena contiene MAYUSCULAS");
		}
		
		
	}

}
