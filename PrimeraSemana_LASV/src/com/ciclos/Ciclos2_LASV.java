package com.ciclos;

import java.util.Scanner;

public class Ciclos2_LASV {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido desde teclado, hasta la iteración deseada por el usuario.
		// Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		int num1;
		int num2;
		int mult;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Resultado de una multiplicacion");
		System.out.println("introduce el primer numero ");
		num1 = entrada.nextInt();
		
		System.out.println("introduce el segundo numero ");
		num2 = entrada.nextInt();

		for (int i= 1; i <= num2; i++){

			mult = i* num1;

			System.out.println(mult + ".- Hola mundo");

		}

	}

}
