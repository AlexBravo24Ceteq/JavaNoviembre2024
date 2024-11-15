package com.condicionales;

import java.util.Scanner;

public class Condicionales4_DAC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		
		
		String  palabra;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una oración");
		
		palabra = entrada.nextLine();
		
		System.out.println(" su oracion es: "+ palabra);
				
		String minus;
		
		minus = (palabra.toLowerCase());
				
//				System.out.println(minus);
		
		
		if (palabra == minus) {
			System.out.println("Esta oración esta en minúsculas");
			} else {
				System.out.println("Esta oración contiene MAYUSCULAS");
			
		}
		
		

	}

}
