package com.condicionales;

import java.util.Scanner;

public class Condicional4_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Realiza un programa que calcule la aceptación de una solicitud en base a 
//		los siguientes parámetros: edad, nota y sexo.  
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
//		* Otros casos -> NO ACEPTADA
		  
		int edad;
		int nota;
		String sexo;
		
		System.out.println("Carta de solicitud");
		//solicitar datos
		System.out.println("Introduce edad");
		Scanner entrada = new Scanner (System.in);
		
		edad= entrada.nextInt();
	
		System.out.println("Introduce nota");
		entrada.nextLine();
		
		nota=entrada.nextInt();
		
		System.out.println("Introduce sexo M o F");
		entrada.nextLine();
		sexo=entrada.nextLine();
		
		//CONDICIONAL		 
		if (edad >=18 && nota >= 5 && sexo.equals("M")) {
			System.out.println("ACEPTACIÓN POSIBLE");
		}else if (edad >=18 && nota >=5 && sexo.equals("F")) {
			System.out.println(" SOLICITUD ACPETADA");
		}else {
			System.out.println("SOLICITUD NO ACEPTADA");
		}

	} //cierre main

} // cierre clase 
