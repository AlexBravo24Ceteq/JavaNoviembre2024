package com.condicionales;

import java.util.Scanner;

public class Condicionales5_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// El director de una escuela está organizando un viaje de estudios y requiere 
//		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
//		compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//		alumno por el viaje
		
		System.out.println("Renta del autobus");
		double alumnos;
		int precio1= 65; 
		int precio2= 70;
		int precio3 = 95;
		int precioRenta=4000;
		//int precioAlumnoRenta=alumnos/precioRenta;
		
		System.out.println("Introduzca el numero de alumnos");
		Scanner entrada =new Scanner (System.in);
		
		alumnos=entrada.nextInt ();
		
		//CONDICIONAL
		if (alumnos>=100) {
			System.out.println("El precio por alumno para la renta del autobus es: " + precio1);
		}else if (alumnos >=50 && alumnos<= 99) {
			System.out.println("El precio por alumno para la renta del autobus es:" + precio2);
		}else  if (alumnos>=30 && alumnos<=49) {
			System.out.println("El precio por alumno para la renta del autobus es:" + precio3);
		}else {
			System.out.println("El precio por alumno para la renta del autobus es:" + precioRenta/alumnos);
		}

	} 

}

