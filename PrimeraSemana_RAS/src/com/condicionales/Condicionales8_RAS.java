package com.condicionales;

import java.util.Scanner;

public class Condicionales8_RAS {

	public static void main(String[] args) {

		/*
		 * 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error
		 */

		Scanner entrada = new Scanner(System.in);

		int dia;
		
		System.out.println("Introduca un dia de la semana del 1 al 7: ");
		dia = entrada.nextInt();
		
switch (dia) {
		
		case 1: 
			System.out.println("La cara opuesta es: Lunes");
			break;
		case 2:
			System.out.println("La cara opuesta es: Martes");
			break;
		case 3:
			System.out.println("La cara opuesta es: Miercoles");
			break;
		case 4:
			System.out.println("La cara opuesta es: Jueves");
			break;
		case 5:
			System.out.println("La cara opuesta es: Viernes");
			break;
		case 6:
			System.out.println("La cara opuesta es: Sabado");
			break;
		case 7:
			System.out.println("La cara opuesta es: Domingo");
			break;
		default:
			System.out.println("ERROR numero incorrecto");
			break;
		}
	}

}
