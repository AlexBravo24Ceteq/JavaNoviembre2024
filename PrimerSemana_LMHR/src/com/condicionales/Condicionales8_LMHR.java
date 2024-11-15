package com.condicionales;

import java.util.Scanner;

public class Condicionales8_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// Realiza un programa que lea una cadena por teclado y compruebe si 
//		contiene letras mayúsculas.

		//DETECTOR LETRAS MAYUSCULAS
		String cadena;
		
		System.out.println("Introduce una palabra  para comprobar si contiene mayusculas ");
		Scanner entrada = new Scanner (System.in);
		 cadena=entrada.nextLine();
		 
		//CONDICIONALES 
		if (cadena.equals(cadena.toUpperCase())) {
			System.out.println("La palabra contiene mayusculas ");
//		} else {
//			System.out.println("La palabra contiene solo minusculas ");
		
		} else if (cadena.equals(cadena.toLowerCase())) {
			System.out.println("La palabra contiene minusculas ");
		}else {
			System.out.println("La palabra contiene mayusculas ");
		}
		 
	} //cierre main

} //ciere cadena
