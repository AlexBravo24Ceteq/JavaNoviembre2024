package com.arrays;

import java.util.Scanner;

public class Arreglos3_JEAV {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Por favor, ingresa una frase:"); 
		
		String frase = entrada.nextLine(); 
		
		char[] arreglo = new char[frase.length()]; 
		
		for (int i = 0; i < frase.length(); i++) { 
			arreglo[i] = frase.charAt(i); 	
		} 
		
		System.out.println("Los caracteres de la frase son:"); 
		
		for (char c : arreglo) { 
			System.out.println(c); 
		}

	}

}
