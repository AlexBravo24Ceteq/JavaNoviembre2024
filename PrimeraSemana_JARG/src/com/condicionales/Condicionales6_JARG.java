package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JARG {

	public static void main(String[] args) {
		/*
		 * 6. El director de una escuela está organizando un viaje de estudios y
		 * requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		 * compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si
		 * son 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
		 * alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
		 * euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		 * euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		 * determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno
		 * por el viaje.
		 * 
		 */

		double niños;
		System.out.println("Escribe la cantidad de niños que van al viaje (en número)");
		Scanner entrada = new Scanner(System.in); 
		
		niños = entrada.nextInt();
		
		// Usamos condicional para determinar el precio que se pagaría
		//en caso de n número de niños
		
		if (niños>=100) {
			System.out.println("El costo por alumno es 65 euros");
		}  else if (niños>=50 && niños <= 99 ) {
			System.out.println("El costo por alumno es 70 euros");
		} else if (niños>=30 && niños <= 49 ) {
			System.out.println("El costo por alumno es 95");
		}  else if (niños<30) {
			System.out.println("El costo del autobús es de " + 4000/niños + " euros");
		}

		}
	}

