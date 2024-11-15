package com.condicionales;

import java.util.Scanner;

public class Condicionales2_LASV {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par
		// o impar.

		int num;
		int resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Identificacion de numero par o impar");
		System.out.println("introduce tu numero");
		num = entrada.nextInt();

		resultado = num % 2;

		if (resultado == 0) {
			System.out.println("tu numero "  + num + " es par: ");
		}else {
			System.out.println("tu numero "  + num + " es impar: ");
		}

//		switch (resultado) {
//		case 0:
//			System.out.println("tu numero es par: " + num);
//			break;
//
//		default:
//			System.out.println("tu numero es impar: " + num);
//			break;
//		}

	}

}
