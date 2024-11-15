package com.condicionales;

import java.util.Scanner;

public class Condicionales7_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 	7. Realiza un programa que pida por teclado el resultado (dato entero)
				obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
				letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
				caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
				Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
				mostrará el mensaje: “ERROR: número incorrecto”.

		 */
		
		Scanner entrada = new Scanner(System.in);
		
		
		int aleatorio;
		
		aleatorio = (int)(Math.random() *6);
		
		System.out.println("Numero generado: "+aleatorio);
		
		switch (aleatorio) {
		
		case 1: 
			System.out.println("La cara opuesta es: Seis");
			break;
		case 2:
			System.out.println("La cara opuesta es: Cinco");
			break;
		case 3:
			System.out.println("La cara opuesta es: Cuatro");
			break;
		case 4:
			System.out.println("La cara opuesta es: Tres");
			break;
		case 5:
			System.out.println("La cara opuesta es: Dos");
			break;
		case 6:
			System.out.println("La cara opuesta es: Uno");
			break;
		default:
			System.out.println("ERROR numero incorrecto");
			break;
		}
		
		

	}

}
