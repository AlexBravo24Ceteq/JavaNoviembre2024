package com.condicionales;

import java.util.Scanner;

public class Condicionales6_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Realiza un programa que pida por teclado el resultado (dato entero) 
//		 obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
//		 letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		 caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//		 Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
//		 mostrará el mensaje: “ERROR: número incorrecto”
		
		System.out.println("Juego dado inverso");
		
		int cara;
		
		System.out.println("Introduce un numero de cara");
		Scanner entrada = new Scanner (System.in);
		cara = entrada.nextInt();
		
		String cadenauno = "uno";
		String cadenados = "dos";
		String cadenatres = "tres";
		String cadenacuatro = "cuatro";
		String cadenacinco = "cinco";
		String cadenaseis = "seis";
		
		//CONDICIONAL
		if (cara == 1) {
			System.out.println("La cara opuesta a la cara que se ingresó es:"+ cadenaseis );
		} else if (cara == 2) {
			System.out.println("La cara opuesta a la cara que se ingresó es:"+ cadenacinco );
		} else if (cara ==3) {
			System.out.println("La cara opuesta a la cara que se ingresó es:"+ cadenacuatro );
		} else if (cara ==4) {
			System.out.println("La cara opuesta a la cara que se ingresó es:"+ cadenatres );
		} else if (cara ==5) {
			System.out.println("La cara opuesta a la cara que se ingresó es:"+ cadenados );
		} else if (cara ==6) {
			System.out.println("La cara opuesta a la cara que se ingresó es:"+ cadenauno );
		} else {
			System.out.println("ERROR: NÚMERO INCORRECTO");
		}
				
		

	} //CIERRE MAIN

}//CIERRE CADENA
