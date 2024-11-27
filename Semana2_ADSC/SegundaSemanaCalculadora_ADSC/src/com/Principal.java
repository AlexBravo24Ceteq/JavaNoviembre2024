package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Cientifica calculadora1 = new Cientifica("Barrilito", "Gris", "7639", 45, "Papelería");

		Cientifica calculadora2 = new Cientifica();
		calculadora2.setMarca("Casio");
		calculadora2.setProveedor("Grupo Papelero");
		calculadora2.setModelo("FX-991ES");

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Qué quieres hacer?. Digita una opción:");
		System.out.println("1 - Ver la información de la calculadora1");
		System.out.println("2 - Ver la información de la calculadora2");
		System.out.println("3 - Realizar una operación");

		int opcion = scanner.nextInt();

		if (opcion == 1) {

			System.out.println("Información de la calculadora1:");
			System.out.println(calculadora1.toString());
		} else if (opcion == 2) {

			System.out.println("Información de la calculadora2:");
			System.out.println(calculadora2.toString());
		} else if (opcion == 3) {

			System.out.println("Elige una operación (1-4):");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");

			int operacion = scanner.nextInt();

			System.out.print("Ingresa el primer número: ");
			int a = scanner.nextInt();

			System.out.print("Ingresa el segundo número: ");
			int b = scanner.nextInt();

			if (operacion == 1) {
				calculadora1.sumar(a, b);
			} else if (operacion == 2) {
				calculadora1.restar(a, b);
			} else if (operacion == 3) {
				calculadora1.multiplicar(a, b);
			} else if (operacion == 4) {
				if (b != 0) {
					calculadora1.dividir(a, b);
				} else {
					System.out.println("Error: No se puede dividir entre cero.");
				}
			} else {
				System.out.println("Operación no válida.");
			}
		}
        scanner.close();
	}
}
