package com.ciclos;

import java.util.Scanner;

public class Ciclos3_RAS {

	public static void main(String[] args) {
		
		
		// Ejercicio 3
		// Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		boolean bandera=true;

		System.out.println("Ingresa una palabra: ");
		cadena = entrada.nextLine();
		cadena = cadena.replace(" ", "");
		cadena = cadena.toLowerCase();
		
		for(int i=0; i<cadena.length(); i++) {
			Character letraI= cadena.charAt(i);
			int charF= cadena.length()-1;
			Character letraF= cadena.charAt(charF-i);
			
			if(letraI!=letraF) 
				bandera =false;
		}
		
		if(bandera == true) {
			System.out.println("La palabra es palindromo ");
		}else {
			System.out.println("La palabra no es palindromo ");
		}
	}
}
