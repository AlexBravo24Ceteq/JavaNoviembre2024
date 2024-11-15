package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JARG {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int primerNumero;
		int segundoNumero;
		
		System.out.println("Introduce un número");
		Scanner entrada = new Scanner(System.in); 
		primerNumero = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");

		segundoNumero = entrada.nextInt();
		
		//Utilizamos condicional con igualdad ==
	
		
		if (segundoNumero==0) {
			System.out.println("Error");
		} else {
			// Realizar la división solo si el segundo número no es cero
			int resultado = primerNumero / segundoNumero;
			System.out.println("El resultado de la división es: " + resultado);
		
		}
		
		
		
	}

}
