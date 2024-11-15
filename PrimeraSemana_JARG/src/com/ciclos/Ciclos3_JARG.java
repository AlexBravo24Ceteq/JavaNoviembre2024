package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JARG {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		//Necesitamos un scanner para ingresar la palabra
		Scanner entrada = new Scanner(System.in); 
	//sig paso guardar la palabra a evaluar
		System.out.println("Introduce una palabra para verificar si es palíndromo");
		String original=entrada.nextLine();
		System.out.println(original);
		
		//Declaro un string que voy a armar con un ciclo en reversa
		String reversa ="";
		
		//Creamos el ciclo que nos ayudará a armar el string original en reversa
		
		for (int i=original.length()-1;i>=0;i--) {
			reversa=reversa+original.charAt(i);
		}
		
		System.out.println(reversa);
			
		//Reemplazamos ambas cadenas
		original=original.replace(" ", "");
		reversa=reversa.replace(" ","");
		
		if (original.equalsIgnoreCase(reversa)) {
			System.out.println("La palabra o frase es palíndromo");
		}else { 
			System.out.println("No es palindromo");
		}
		


	}

}
