package com.condicionales;

import java.util.Scanner;

public class Condicionales6_VMTM {
	//6. El director de una escuela está organizando un viaje de estudios y 
	//requiere determinar cuánto debe cobrar a cada alumno y cuánto debe
	//pagar a la compañía de viajes por el servicio. La forma de cobrar es 
	//la siguiente: * Si son 100 alumnos o más, el costo por cada alumno es 
	//de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. 
	//* De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos, 
	//el costo de la renta del autobús es de 4000 euros, sin importar el número 
	//de alumnos. Realiza un algoritmo que permita determinar el pago a la 
	//compañía de autobuses y lo que debe pagar cada alumno por el viaje.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la cantidad de alumnos: ");
		int alumnos=entrada.nextInt();
		if(alumnos>=100) {
			System.out.println("El costo por cada laumno es de 65 EUR.");
		}else if(alumnos>=50 && alumnos<=99) {
			System.out.println("El costo por alumno es de 70 EUR.");
		}else if(alumnos>=30 && alumnos <=49) {
			System.out.println("El costo por alumno es de 95 EUR.");
		}else if(alumnos<30) {
			float costo=4000/alumnos;
			System.out.println("El costo es de "+ costo +" EUR.");
		}
	}

}
