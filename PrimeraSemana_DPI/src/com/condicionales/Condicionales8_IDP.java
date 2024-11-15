package com.condicionales;

import java.util.Scanner;

public class Condicionales8_IDP {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		// día
		// correspondiente. Si introducimos otro número nos da un error

		Scanner leerDia = new Scanner(System.in);
		int dia;
		String diaLetras;

		System.out.println("Ingresa el día de la semana (del 1 al 7)");
		dia = leerDia.nextInt();

		if (dia == 1) {
			diaLetras = "LUNES";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		} else if (dia == 2) {
			diaLetras = "MARTES";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		} else if (dia == 3) {
			diaLetras = "MIERCOLES";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		} else if (dia == 4) {
			diaLetras = "JUEVES";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		} else if (dia == 5) {
			diaLetras = "VIERNES";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		} else if (dia == 6) {
			diaLetras = "SABADO";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		} else if (dia == 7) {
			diaLetras = "DOMINGO";
			System.out.println("el numero corresponde al dia: " + diaLetras);
		}else {
			System.out.println("Error el numero debe estar entre 1 y 7");
		}

	}

}
