package com.condicionales;

import java.util.Scanner;

public class Condicionales1_ADSC {

	public static void main(String[] args) {

		// Ejercicio 1
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es
		// mayor o si son iguales.

		Scanner captura = new Scanner(System.in);

		System.out.println("Ingresa el primer número: ");
		int numero1 = captura.nextInt();

		System.out.println("Ingresa el segundo número: ");
		int numero2 = captura.nextInt();

		if (numero1 > numero2) {
			System.out.println(("El valor: " + numero1) + (" es mayor que: " + numero2 ));
		} else if (numero1 < numero2) {
			System.out.println(("El valor: " + numero2) + (" es mayor que: " + numero1 ));
		} else {
			System.out.println("Ambos valores son iguales.");
		}
		
		System.out.println("Vuelve a correr el programa para una nueva evaluación");
	}

}
