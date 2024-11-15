package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JEAV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
		Scanner entrada = new Scanner(System.in);
		
		String a;
		
		System.out.println("Encontrando una mayuscula");
		System.out.print("Escriba algo, cualquier cosa: ");
		a = entrada.next();
		
		if (a.matches(".*[A-Z].*")) {
			System.out.println("El poema que escribio contiene almenos una mayuscula"); 
		} else {
			System.out.println("El poema que escribio no contiene mayusculas"); 
		}
		
	}

}
