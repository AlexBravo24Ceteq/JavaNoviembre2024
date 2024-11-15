package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JARG {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		// los siguientes parámetros: edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//* Otros casos -> NO ACEPTADA
		
		int edad;
		int nota;
		
		System.out.println("Introduce tu edad");
		Scanner entrada = new Scanner(System.in); 
		
		String sexo;
		
	
		edad = entrada.nextInt();
		
		System.out.println("Introduce tu nota");
		entrada.nextLine();
		nota = entrada.nextInt();
		
		System.out.println("Introduce tu sexo M o F (en mayúsculas)");
		entrada.nextLine();
		sexo = entrada.nextLine();
		
	
		if (edad >= 18 && nota >=5 && sexo.equals("M")){
			System.out.println("POSIBLE");
		}  else if (edad >= 18 && nota >=5 && sexo.equals("F")) 
			System.out.println("Aceptada");
		else 
			System.out.println("NO ACEPTADA");
		
	
	}
	}

