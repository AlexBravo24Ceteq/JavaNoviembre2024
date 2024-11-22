package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JARG {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		//introducido desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

			
		
		int numero;
		System.out.println("Introduce un número a multiplicar");
		Scanner entrada = new Scanner(System.in); 
		numero=entrada.nextInt();
		
		int numero2;
		System.out.println("Introduce el número hasta donde quieres multiplicar");
		numero2=entrada.nextInt();
		
		
		for (int i = 1; i <= numero2; i++) {
			System.out.println(i+".- "+numero*i);
		
		}
		
		
	}

}
