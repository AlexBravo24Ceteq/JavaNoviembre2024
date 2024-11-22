package com.condicionales;

import java.util.Scanner;

public class Condicionales6_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 6. El director de una escuela está organizando un viaje de estudios y requiere
			determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
			compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
			100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
			alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
			euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
			euros, sin importar el número de alumnos. Realiza un algoritmo que permita
			determinar el pago a la compañía de autobuses y lo que debe pagar cada
			alumno por el viaje.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int numAlumnos;
		double costoB;
		double costoAutobus = 4000;
		
		System.out.println("Ingresa el numero de alumnos que iran al viaje: ");
		numAlumnos = entrada.nextInt();
		
		if(numAlumnos >= 100) {
			System.out.println("Precio del boleto = $65");
			System.out.println("Total a pagar a la compañia de autobuses es: $" + (numAlumnos*65));
		}else if(numAlumnos>=50 && numAlumnos<=99) {
			System.out.println("Precio del boletos = $70");
			System.out.println("Total a pagar a la compañia de autobuses es: $" + (numAlumnos*70));
		}else if(numAlumnos>=30 && numAlumnos<=49) {
			System.out.println("Precio del boletos = $95");
			System.out.println("Total a pagar a la compañia de autobuses es: $"+ (numAlumnos*95));
		}else if(numAlumnos<30) {
			costoB = costoAutobus/numAlumnos;
			System.out.println("valor de costoB: "+costoB);
			System.out.println("Precio del boletos = $"+costoB);
			System.out.println("Total a pagar a la compañia de autobuses es: $" + (numAlumnos * costoB));
		}		
			

	}

}
