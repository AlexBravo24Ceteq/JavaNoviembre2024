package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AED {

	public static void main(String[] args) {
		
		// Ejercicio 6
		/* 6. El director de una escuela está organizando un viaje de estudios y requiere 
		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
		compañía de viajes por el servicio. La forma de cobrar es la siguiente:
		 * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		 * De 50 a 99 alumnos, el costo es de 70 euros. 
		 * De 30 a 49 alumnos, el costo es de 95 euros. 
		 * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada 
		alumno por el viaje. */		
		
		int numAlumnos = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingresa el número total de alumnos que asistirán al viaje ");
		
		if (entrada.hasNextInt()) {
			numAlumnos = entrada.nextInt();    // Se guarda el valor correspondiente a la cantidad de alumnos				
		} else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		
		if (numAlumnos >= 100) {
			System.out.println("El costo por cada alumno es de 65 euros.");
		}
		else if ((numAlumnos >= 50) && (numAlumnos <= 99)) {
			System.out.println("El costo por cada alumno es de 70 euros.");
		}
		else if ((numAlumnos >= 30) && (numAlumnos <= 49)) {
			System.out.println("El costo por cada alumno es de 95 euros.");
		}
		else if (numAlumnos <= 30) {
			System.out.println("cada alumno debera pagar: "+ 4000/numAlumnos + " euros.");
		}		
	}

}
