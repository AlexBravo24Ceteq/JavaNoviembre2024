package com.condicionales;

import java.util.Scanner;

public class Condicionales5_IDP {

	public static void main(String[] args) {
		//  Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//* Otros casos -> NO ACEPTADA

		Scanner datoEntrada = new Scanner(System.in);
		int nota;
		int edad;
		String sexo;
		
		System.out.println("introduce la Nota en numero: ");
		nota = datoEntrada.nextInt();
		System.out.println("introduce la edad en numero: ");
		edad = datoEntrada.nextInt();
		System.out.println("introduce tu sexo M o F: ");
		datoEntrada.nextLine();
		sexo = datoEntrada.nextLine().toUpperCase();
		
		//System.out.println(sexo);
		
		if (edad == 18 && nota<5 && sexo.equals("F")){
			System.out.println("ACEPTADA");
			}else if(sexo.equals("M")) 
			{
			System.out.println("POSIBLE");
			}else {
			System.out.println("No Aceptada");
			}
		
	}

}
