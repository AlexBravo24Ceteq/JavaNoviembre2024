package com.condicionales;

import java.util.Scanner;

public class Condicionales5_VMTM {
	//5. Realiza un programa que calcule la aceptación de una solicitud con base 
	//a los siguientes parámetros: edad, nota y sexo.
	//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
	//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	//* Otros casos -> NO ACEPTADA
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad=entrada.nextInt();
		System.out.println("Introduce tu nota: ");
		float nota=entrada.nextFloat();
		System.out.println("Introduce tu género: M-Masculino, F-Femenino: ");
		char genero=entrada.next().charAt(0);
		//caso1
		if(nota>=5 && edad>=18 && genero=='M') {
			System.out.println("POSIBLE");
		}else if(nota>=5 && edad>=18 && genero=='F') {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
	}

}
