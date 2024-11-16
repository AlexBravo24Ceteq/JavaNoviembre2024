package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AED {

	public static void main(String[] args) {
		
		// Ejercicio8
		// 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		// correspondiente. Si introducimos otro número nos da un error. 

		int diaSemana = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el numero del dia de la semana que quiera consultar");
	
		if (entrada.hasNextInt()) {
			diaSemana = entrada.nextInt();    // Se guarda el valor correspondiente a la cantidad de alumnos				
		} else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		

		// Se efectua un case para mostrar el cia que corresponde al numero digitado
		switch (diaSemana) {
		case 1:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Lunes");
			break;
		case 2:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Martes");
			break;
		case 3:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Miércoles");
			break;
		case 4:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Jueves");
			break;
		case 5:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Viernes");
			break;
		case 6:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Sábado");
			break;
		case 7:
			System.out.println("El numero: " + diaSemana + " corresponde al dia Domingo");
			break;

		default: System.out.println("ERROR: número incorrecto");
			break;
		}
	}

}
