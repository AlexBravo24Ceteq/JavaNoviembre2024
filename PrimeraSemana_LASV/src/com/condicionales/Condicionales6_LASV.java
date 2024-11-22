package com.condicionales;

import java.util.Scanner;

public class Condicionales6_LASV {

	public static void main(String[] args) {
		//  El director de una escuela está organizando un viaje de estudios y requiere 
		//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
		//compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//		alumno por el viaje.
		
		int numAlum;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Costo de viaje por la cantidad de alumnos que asistiran");
		System.out.println("introduce la cantidad de alumnos ");
		numAlum = entrada.nextInt();
	
		
		if(numAlum >= 100) {
			System.out.println("el costo por cada alumno es de 65 euros.");
		}else if( numAlum < 100 && numAlum > 49) {
			System.out.println("el costo es de 70 euros");
		}else if( numAlum < 50  && numAlum > 29) {
			System.out.println("el costo es de 95");
		}else if( numAlum < 30) {
			System.out.println("el costo de la renta del autobús es de 4000 euros");
		}else {
			System.out.println("Error");
		}

	}

}
