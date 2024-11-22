package com.condicionales;

import java.util.Scanner;

public class Condicionales8_DAC {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
		//Si introducimos otro número nos da un error.

		
int x;
		
		Scanner dia = new Scanner(System.in);
		System.out.println("Introduzca el numero del día");
		x = dia.nextInt();
		
		if (x<1 || x>7) {
			System.out.println("Error introduzca números de 1 al 7");
			
		} else {
			switch (x){
			case 1:
			System.out.println("LUNES");
			break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MIERCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("SABADO");
				break;
			case 7:
				System.out.println("DOMINGO");
				break;
				
				
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
