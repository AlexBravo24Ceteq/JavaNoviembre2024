package com.condicionales;

import java.util.Scanner;

public class Condicionales6_IDP {

	public static void main(String[] args) {
//		//El director de una escuela está organizando un viaje de estudios y requiere 
//		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
//		compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//		alumno por el viaje.
		
		Scanner leerCantidad = new Scanner(System.in);
		int cantidad;
		double costoBoleto;
		double costoTotal;
		
		System.out.println("introduce el numero de alumnos que viajaran");
		cantidad = leerCantidad.nextInt();
		
		
		
		if (cantidad > 99){
			
			costoBoleto = 65;
			costoTotal = cantidad*costoBoleto;
			System.out.println("El Costo por Alumno es de: "+costoBoleto +" Euros");	
			System.out.println("El Costo Total del viaje es de: "+costoTotal+ " Euros");
			
		}else if(cantidad < 100 && cantidad > 49){
			
			costoBoleto = 70;
			costoTotal = cantidad*costoBoleto;
			System.out.println("El Costo por Alumno es de: "+costoBoleto +" Euros");	
			System.out.println("El Costo Total del viaje es de: "+costoTotal+ " Euros");
			
		}else if(cantidad < 50 && cantidad > 29) {
			
			costoBoleto = 95;
			costoTotal = cantidad*costoBoleto;
			System.out.println("El Costo por Alumno es de: "+costoBoleto +" Euros");	
			System.out.println("El Costo Total del viaje es de: "+costoTotal+ " Euros");
			
		}else {
			
			costoTotal = 4000;
			costoBoleto = costoTotal/cantidad;
			System.out.println("El Costo por Alumno es de: "+costoBoleto +" Euros");	
			System.out.println("El Costo de la renta del autobús es de: "+costoTotal+ " Euros");
		}

	}

}
