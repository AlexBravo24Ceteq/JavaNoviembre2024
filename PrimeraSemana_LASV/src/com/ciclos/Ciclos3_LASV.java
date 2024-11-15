package com.ciclos;

import java.util.Scanner;

public class Ciclos3_LASV {

	public static void main(String[] args) {
		//  Realiza un programa para determinar si un String es palíndromo.
		// necesitamos un scanner para ingresar la plabra
		Scanner entrada = new Scanner(System.in);
		//sig paso guardar la palabra a evaluar
		//solicitar la frase a evaluar
		System.out.println("introduce la palabra o frase para evaluar sii es palindromo");
		String original = entrada.nextLine();
		System.out.println(original);
		
		//declaro un stream que voy a armar con un cilco en reversa
		String reversa = "";
		
		//creamos el ciclo que nos ayudara a armar el string original en reversa
		
		for (int i = original.length()-1; i >= 0; i--) {
			reversa = reversa + original.charAt(i);
			
		}
		System.out.println(reversa);
		
		//remplazamos ambas cadenas los espacios
		original = original.replace(" ", "");
		reversa = reversa.replace(" ", "");
		
		if (original.equalsIgnoreCase(reversa)) {
			System.out.println("la palabra o frase es Palindromo");
		}else {
			System.out.println("no es Palindromo");
		}

	}

}
