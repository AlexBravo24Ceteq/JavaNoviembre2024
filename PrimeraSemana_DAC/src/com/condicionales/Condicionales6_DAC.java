package com.condicionales;

import java.util.Scanner;

public class Condicionales6_DAC {

	public static void main(String[] args) {
		// El director de una escuela está organizando un viaje de estudios y 
		//requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar 
		//a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
		//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
		//* De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. 
		//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

		
		
		int x;
		
		Scanner alm = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de alumnos");
		x = alm.nextInt();
		
		if (x > 100 || x==100) {
			
			System.out.println("65 euros por alumno");
			System.out.println(x*65 + " en total");
			
		} else if (x<100 && x>49) {
			
			System.out.println("70 euros por alumno");
			System.out.println(x*70 + " en total");
			
			
		} else if (x<50 && x>29) {
		
			System.out.println("95 euros por alumno");
			System.out.println(x*95 + " en total");
		
		} else {
			System.out.println(" 4,000 renta de autobus");
			System.out.println(4000/x + " por alumno");
			
			
		}
		
		
	
		
		
		
		
		
	}

}
