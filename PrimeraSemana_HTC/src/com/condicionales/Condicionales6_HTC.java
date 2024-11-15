package com.condicionales;

import java.util.Scanner;

public class Condicionales6_HTC {

	public static void main(String[] args) {
		// Eurotrip.Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		
		int alumnos;
		int costo=0;
		int aPagar;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de alumnos que asistirán al viaje");
		alumnos = input.nextInt();

	
		//result = dividend/divisor;
		
		if(alumnos >= 100) {
			costo = alumnos*65;
			System.out.println("Costo: "+ costo + " Euros");
		}else if (alumnos >= 50){
			costo = alumnos*70;
			System.out.println("Costo: "+ costo + " Euros");
		}else if (alumnos >= 30){
			costo = alumnos*95;
			System.out.println("Costo: "+ costo + " Euros");
		}else {
			costo = 4000;
			System.out.println("Costo: 4000 Euros");
		}
		
		aPagar= costo/alumnos;
	
		System.out.println("Cada alumno debe pagar: "+ aPagar);
		
	}

}
