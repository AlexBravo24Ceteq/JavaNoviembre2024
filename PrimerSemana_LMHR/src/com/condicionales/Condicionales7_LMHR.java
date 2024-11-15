package com.condicionales;

import java.util.Scanner;

public class Condicionales7_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
//		correspondiente. Si introducimos otro número nos da un error.
		
		System.out.println("Dia de la semana");
		
		int dia;
		
		System.out.println("Introduce el dia de la semana del 1 al 7");
		Scanner entrada = new Scanner (System.in);
		dia=entrada.nextInt();
		
		String cadenauno = "Lunes";
		String cadenados = "Martes";
		String cadenatres = "Miercoles";
		String cadenacuatro = "Jueves";
		String cadenacinco = "Viernes";
		String cadenaseis = "Sábado";
		String cadenasiete = "Domingo";
		
		//CONDICIONAL
		if(dia ==1) {
			System.out.println("El dia que seleccionaste es: "+ cadenauno);	
		} else if (dia ==2) {
			System.out.println("El dia que seleccionaste es: "+ cadenados);
		} else if (dia ==3) {
			System.out.println("El dia que seleccionaste es: "+ cadenatres);
		} else if (dia ==4) {
			System.out.println("El dia que seleccionaste es: "+ cadenacuatro);
		} else if (dia ==5) {
			System.out.println("El dia que seleccionaste es: "+ cadenacinco);
		} else if (dia ==6) {
			System.out.println("El dia que seleccionaste es: "+ cadenaseis);
		} else if (dia ==7) {	
			System.out.println("El dia que seleccionaste es: "+ cadenasiete);
		} else {
			System.out.println("ERROR: NÚMERO NO VALIDO");

	}

} 
}