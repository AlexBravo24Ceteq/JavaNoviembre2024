package com.ciclos;

import java.util.Iterator;
import java.util.Scanner;

public class Ciclos3_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realiza un programa para determinar si un String es palíndromo.
		
		String palabra;
		
		
		System.out.println("Introduce una palabra  para comprobar si es un palíndromo ");
		Scanner entrada = new Scanner (System.in);
		palabra = entrada.nextLine();
		System.out.println("la palabra original es " + palabra);
		
		//String con un ciclo en reversa
		String palabrainvertida="";
		
		//CICLO
		//ciclo string original en reversa
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			palabrainvertida=palabrainvertida + palabra.charAt(i);
			
		}
		 System.out.println("La palabra invertida es "+palabrainvertida);
		
		//remplazamos ambas cadenas los espacios
		 palabra= palabra.replace(" ", "");
		 palabrainvertida= palabrainvertida.replace(" ", "");
		 
		 if(palabra.equalsIgnoreCase(palabrainvertida)) {
			 System.out.println("La palabra o frase ES un palindromo");
		 } else  {
			 System.out.println("La palabra o frase NO es un palindromo");
		 }
		

	}

}
