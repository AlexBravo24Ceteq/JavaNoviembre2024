package com.arrays;

import java.util.Scanner;

public class Arrays3_IDP {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. 

		Scanner entrada = new Scanner(System.in);
		String cadena = "";
		int longitud ;
		

		
		System.out.println("Ingresa un frase para convertirla a array");
		cadena = entrada.nextLine();
		longitud = cadena.length();
		char[] array = new char[longitud];
		//conversion de frae a caracteres en el arreglo
		for (int i = 0; i < longitud; i++) {
			array[i] = cadena.charAt(i);	
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + array[i] + "]");
		}
		
		
	}

}
