package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JARG {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		//correspondiente. Si introducimos otro número nos da un error. 
		
		int numeroSemana;
		
		System.out.println("Introduce un número del 1 al 7");
		Scanner entrada = new Scanner(System.in); 
		
		numeroSemana = entrada.nextInt();
		
		if (numeroSemana==1) {
			System.out.println("Lunes");
		}  else if (numeroSemana==2) {
			System.out.println("Martes");
		}  else if (numeroSemana==3) {
			System.out.println("Miércoles");
		}  else if (numeroSemana==4) {
			System.out.println("Jueves");
		}  else if (numeroSemana==5) {
			System.out.println("Viernes");	
		}  else if (numeroSemana==6) {
			System.out.println("Sábado");
		}  else if (numeroSemana==7) {
			System.out.println("Domingo");
		}
		else 
			System.out.println("Error");
	}

}
