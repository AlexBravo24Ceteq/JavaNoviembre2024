package com.condicionales;

import java.util.Scanner;

public class Condicionales7_HTC {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla
		//el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		int result;
		//String opposed;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el número de tu dado.");	
		result = input.nextInt();
	
		switch (result) {
		case 1:
			System.out.println("La cara opuesta es seis.");	
			break;
		case 2:
			System.out.println("La cara opuesta es cinco.");	
			break;
		case 3:
			System.out.println("La cara opuesta es cuatro.");	
			break;
		case 4:
			System.out.println("La cara opuesta es tres.");	
			break;
		case 5:
			System.out.println("La cara opuesta es dos.");	
			break;
		case 6:
			System.out.println("La cara opuesta es uno.");
			break;

		default:
			System.out.println("Tu dado es de más de 6 caras. Revisar el dado.");	
			break;
		}
		
	
	}

}
