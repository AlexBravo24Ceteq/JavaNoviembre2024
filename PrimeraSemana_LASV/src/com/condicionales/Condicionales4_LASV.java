package com.condicionales;

import java.util.Scanner;

public class Condicionales4_LASV {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
		
		String oracion;
		String oracionMin;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Revision de letras mayúsculas en una oracion");
		System.out.println("introduce tu oracion");
		oracion = entrada.next();
		oracionMin = oracion.toLowerCase();
		
		if(oracion.equals(oracionMin)) {
			System.out.println("la oracion o frase no tiene Mayusculas");
		}else {
			System.out.println("La oracion tiene alguna Mayuscula");
		}
				
		
	}

}
