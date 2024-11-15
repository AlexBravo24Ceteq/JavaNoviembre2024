package com.condicionales;

import java.util.Scanner;

public class Condicionales5__DAC {

	public static void main(String[] args) {
		//
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTAD
		*/
		
		int nota;
		int edad;
		String sexo;
		String sexo1;
		
		
		
		
		Scanner nta = new Scanner(System.in);
		System.out.println("Introduzca la NOTA");
		nota = nta.nextInt();
//		System.out.println(nota);
		
		Scanner age =new Scanner(System.in);
		System.out.println("Introduzca la edad");
		
		edad = age.nextInt();
		
		Scanner sex =new Scanner(System.in);
		System.out.println("introduzca sexo M o F");
		
		sexo = sex.next();
		
		sexo1 = sexo.toLowerCase();
		
		
		if (nota < 5) {
			
			System.out.println("NO ACEPTADA");
			
			
		} else if (edad != 18) {
			
			System.out.println("NO ACEPTADA");
			
		} else if (sexo1.equals("f")) {
		
			System.out.println("ACEPTADA");
		
		} else {
			System.out.println("POSIBLE");
		}
		
	
		

	}

}
