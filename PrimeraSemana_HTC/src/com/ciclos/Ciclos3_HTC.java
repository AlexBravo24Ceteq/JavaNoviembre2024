package com.ciclos;

import java.util.Scanner;

public class Ciclos3_HTC {
	

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		String words;
		char wordsChar;
		char checker;
		int start = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca una oración");
		words = input.nextLine();
		
		for (int i = words.length()-1; i < words.length() && i != -1; i--) {
			wordsChar = words.charAt(i);
			checker = words.charAt(start);
			if (wordsChar==checker) {
				System.out.println("Todo bien " + wordsChar + " vs " + checker);
				start++;
				
			}else {
				System.out.println("No es palíndromo " + wordsChar + " vs " + checker );
				//System.out.println("No es palíndromo" );
				start++;
				break;
			}
		}
		//System.out.println("Es un palíndromo, eres grande.");
////		do {
////			
////		}while()
////		
//		
//		if(words.charAt(0)== words.charAt(words.length()-1))){
//			
//		}
//		
		//System.out.println(checker.length());		
		}
}