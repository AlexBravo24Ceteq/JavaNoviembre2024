package com.ciclos;

import java.util.Scanner;

public class Ciclos3_AED {

	public static void main(String[] args) {
		
		// Ejercicio3
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la palabra o frase para evaluar si es palindromo");
		String original = entrada.nextLine();
		System.out.println(original);
		
		//Declaro un String que voy a armar con un ciclo en reversa
		String reversa = "";
		
		//Creamos el ciclo que nos ayudara a armar el String original en reversa
		for (int i = original.length()-1; i >=0; i--) {
			reversa = reversa + original.charAt(i);
		}
		System.out.println(reversa);
		//Reemplazamos en ambas cadenas los espacios
		original = original.replace(" ", "");
		reversa = reversa.replace(" ", "");
		
		if (original.equalsIgnoreCase(reversa)) {
			System.out.println("La palabra o frase es PALINDROMO");
		}else {
			System.out.println("NO ES PALINDROMO");
		}
		
	}

}
