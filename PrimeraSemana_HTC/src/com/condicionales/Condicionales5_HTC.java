package com.condicionales;

import java.util.Scanner;

public class Condicionales5_HTC {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		int nota;
		int edad;
		String genero;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca sus notas.");		
		nota = input.nextInt();
		System.out.println("Introduzca su edad.");		
		edad = input.nextInt();
		input.nextLine();
		System.out.println("Introduzca su género (M/F)");
		genero = input.nextLine();

		if (nota>=5 && edad>=18 && genero.equals("F")) {
			System.out.println("ACEPTADA");			
		}else if (nota>=5 && edad>=18 && genero.equals("M")) {
			System.out.println("POSIBLE");	
		}else {
			System.out.println("NO ACEPTADA");
		}
	
		
	}

}
