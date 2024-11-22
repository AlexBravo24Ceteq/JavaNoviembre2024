package com.ciclos;

import java.util.Iterator;
import java.util.Scanner;

public class Ciclos3_DAC {

	public static void main(String[] args) {
		
		//SOLUCION PRFE
		
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		/*
		
		//Necesitamos un Scanner para ingresar la palabra
				Scanner entrada = new Scanner(System.in);
				//Sig. paso, guardar la palabra a evaluar
				//y solicito la frase a evaluar
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
		
				*/
		
		Scanner palabra =new Scanner(System.in);
		System.out.println("coloca una frase");
		
		String original = palabra.nextLine();
		
		System.out.println("------------------------------------");
	//	System.out.println(original);
		
		String inversa = "";
		
	for (int i = original.length()-1;i>=0;i--) {
		
		inversa = inversa + original.charAt(i);
		
		
	}
				
	original = original.replace(" ", "");
	inversa = inversa.replace(" ","");
	
	if (original.equalsIgnoreCase(inversa)) {
		System.out.println("Es palindromo");
		
	}else {
		System.out.println("NO es palindromo");
		
	}
				//System.out.println(inversa);
		
		
			
		
		
		
		
		
		
	}

}
