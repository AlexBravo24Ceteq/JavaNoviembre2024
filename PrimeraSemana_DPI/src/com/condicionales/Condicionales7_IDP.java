package com.condicionales;

import java.util.Scanner;

public class Condicionales7_IDP {

	public static void main(String[] args) {
//		// Realiza un programa que pida por teclado el resultado (dato entero) 
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
//		mostrará el mensaje: “ERROR: número incorrecto”
		
		
		
		Scanner leerCaraDado = new Scanner(System.in);
		int cara;
		String contraCara;
		String numLetras;
		
		
		System.out.println("introduce el numero de cara del dado");
		cara = leerCaraDado.nextInt();
		
		/*
		 * if(cara == 6) { contraCara = "uno";
		 * System.out.println("La contra cara del dado es:"+ contraCara); }else if(cara
		 * == 5) { contraCara = "dos"; System.out.println("La contra cara del dado es:"+
		 * contraCara); }else if(cara == 4) { contraCara = "tres";
		 * System.out.println("La contra cara del dado es:"+ contraCara); }else if(cara
		 * == 3) { contraCara = "cuatro";
		 * System.out.println("La contra cara del dado es:"+ contraCara); }else if(cara
		 * == 2) { contraCara = "cinco";
		 * System.out.println("La contra cara del dado es:"+ contraCara); }else if(cara
		 * == 1) { contraCara = "seis";
		 * System.out.println("La contra cara del dado es:"+ contraCara); }else {
		 * System.out.println("Error el numero debe estar entre 1 y 6"); }
		 */
		
		switch(cara) {
		case 1:
			contraCara = "seis";
			System.out.println("La contra cara del dado es:"+ contraCara);
			break;
		case 2:
			contraCara = "cinco";
			System.out.println("La contra cara del dado es:"+ contraCara);
			break;
		case 3:
			contraCara = "cuatro";
			System.out.println("La contra cara del dado es:"+ contraCara);
			break;
		case 4:
			contraCara = "tres";
			System.out.println("La contra cara del dado es:"+ contraCara);
			break;
		case 5:
			contraCara = "dos";
			System.out.println("La contra cara del dado es:"+ contraCara);
			break;
		case 6:
			contraCara = "uno";
			System.out.println("La contra cara del dado es:"+ contraCara);
			break;
		default:
			System.out.println(" “ERROR: número incorrecto”");
			break;
		}
		

	}

}
