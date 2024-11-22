package com.condicionales;

import java.util.Scanner;

public class Condicionales8_LASV {

	public static void main(String[] args) {
		// .Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número nos da un error.
		
		int dia;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dia de la semana");
		System.out.println("introduce el dia de la semana del 1 al 7 ");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El dia es Lunes");
			break;

		case 2:
			System.out.println("El dia es martes");
			break;

		case 3:
			System.out.println("El dia es Miercoles");
			break;
			
		case 4:
			System.out.println("El dia es Jueves");
			break;
			
		case 5:
			System.out.println("El dia es Viernes");
			break;
			
		case 6:
			System.out.println("El dia es Sabado");
			break;
			
		case 7:
			System.out.println("El dia es Domingo");
			break;

		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}
	}

}
