package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JARG {

	public static void main(String[] args) {
		//Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		//mostrará el mensaje: “ERROR: número incorrecto”
		
		int numeroDado;
		System.out.println("Introduce el dígito de la cara del dado");
		Scanner entrada = new Scanner(System.in); 
		
		numeroDado=entrada.nextInt();
		
		String cadena1=" uno";
		String cadena2=" dos";
		String cadena3=" tres";
		String cadena4=" cuatro";
		String cadena5=" cinco";
		String cadena6=" seis";

		//Uso de condicional
		if (numeroDado == 1) {
			System.out.println("el lado contrario es" + cadena6);
		}  else if (numeroDado == 2) {
			System.out.println("El lado contrario es" + cadena5);
		} else if (numeroDado == 3) {
			System.out.println("El lado contrario es" + cadena4);
		}  else if (numeroDado == 4) {
			System.out.println("El lado contrario es" + cadena3);
		} else if (numeroDado == 5) {
			System.out.println("El lado contrario es" + cadena2);
		} else if (numeroDado == 6) {
			System.out.println("El lado contrario es" + cadena1);
		} else if (numeroDado < 1) {
			System.out.println("ERROR: número incorrecto");
		} else if (numeroDado > 6) {
			System.out.println("ERROR: número incorrecto");
		}
	}

}
