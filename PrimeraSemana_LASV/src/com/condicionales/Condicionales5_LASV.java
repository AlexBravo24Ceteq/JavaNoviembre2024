package com.condicionales;

import java.util.Scanner;

public class Condicionales5_LASV {

	public static void main(String[] args) {
		//  Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.  
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
		//* Otros casos -> NO ACEPTADA
		
		int nota;
		int edad;
		String sexo;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Aceptacion de solicitudes");
		System.out.println("introduce tu nota ");
		nota = entrada.nextInt();
		
		System.out.println("introduce edad ");
		edad = entrada.nextInt();

		System.out.println("introduce sexo F/M ");
		sexo = entrada.next();
		
		if(nota >= 5 && sexo.equals("M")) {
			System.out.println("Posible");
		}else if(nota >= 5 && sexo.equals("F")) {
			System.out.println("aceptada");
		}else {
			System.out.println("no aceptada");
		}

	}

}
