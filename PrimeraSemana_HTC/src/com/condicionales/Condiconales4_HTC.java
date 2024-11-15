package com.condicionales;

import java.util.Scanner;
public class Condiconales4_HTC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		
		String words;
		String checker;
		Scanner input = new Scanner(System.in);
		
		words = input.nextLine();
		checker = words.toLowerCase();
		if (!(checker.equals(words))) {
			System.out.println("Los datos introducidos contenían Mayúsculas.");			
		}else {
			System.out.println("Los datos introducidos no contenían Mayúsculas.");	
		}
	
		

	}

}
