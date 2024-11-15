package com.condicionales;

import java.util.Scanner;

public class Condicionales5_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a
			los siguientes parámetros: edad, nota y sexo.
			
			* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
			* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
			* Otros casos -> NO ACEPTADA
		 */
		
		Scanner entrada = new Scanner(System.in);

		float nota;
		int edad;
		char sexo;

		System.out.println("Ingresa tu nota: ");
		nota = entrada.nextFloat();
		
		System.out.println("Ingresa tu edad: ");
		edad = entrada.nextInt();
		
		System.out.println("Ingresa tu sexo M/F: ");
		sexo = entrada.next().charAt(0);
		
		if(nota>=5 && edad>=18 && sexo=='M') {
			System.out.println("Pusiblemente seas aceptado");
			
		}else if(nota>=5 && edad>=18 && sexo=='F') {
			System.out.println("Fuiste aceptado");
		}else {
			System.out.println("No aceptado :(");
		}
		

	}

}
