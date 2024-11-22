package com.ciclos;

import java.util.Scanner;

public class Ciclos2_RAS {

	public static void main(String[] args) {

		// Ejercicio 2
		/*
		 * Programa un algoritmo que realice la tabla de multiplicar de un numero
		 * introducido desde teclado, hasta la iteración deseada por el usuario.
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */
		int tabla, tope;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el numero de la tlaba a realizar: ");
		tabla = entrada.nextInt();

		System.out.println("Hasta que numero quieres hacer la tabla? ");
		tope = entrada.nextInt();

		for (int i = 1; i < tope+1; i++) {

			System.out.println(tabla+ "x" + i + "= " + i * tabla);

		}

	}

}
