package com.condicionales;

import java.util.Scanner;

public class Condicionales8_HTC {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
		int result;
		//String opposed;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número del 1 al 7 y te diré el día.");	
		result = input.nextInt();
	
		switch (result) {
		case 1:
			System.out.println("Lunes");	
			break;
		case 2:
			System.out.println("Martes");	
			break;
		case 3:
			System.out.println("Miércoles");	
			break;
		case 4:
			System.out.println("Jueves");	
			break;
		case 5:
			System.out.println("Viernes");	
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("¿No estás usando el calendario gregoriano? Error.");	
			break;
		}
	}

}
