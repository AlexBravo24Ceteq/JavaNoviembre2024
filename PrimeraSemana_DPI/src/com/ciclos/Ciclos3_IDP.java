package com.ciclos;

import java.util.Scanner;

public class Ciclos3_IDP {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		Scanner entradaCadena = new Scanner(System.in);
		
		String frase;
		String fraseReverse ="";
		
		System.out.println("Escribe una frae para determinar i es palindromo");
		frase = entradaCadena.nextLine();
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		
		for (int i =  frase.length()-1; i>=0 ; i--) {
			
			fraseReverse = fraseReverse + frase.charAt(i);
		}
		//System.out.println(fraseReverse);
		if(frase.equals(fraseReverse)) {
			System.out.println("la frase es palindromo");
	}else {
		System.out.println("la frase no es palindromo");
		}
	}

}
