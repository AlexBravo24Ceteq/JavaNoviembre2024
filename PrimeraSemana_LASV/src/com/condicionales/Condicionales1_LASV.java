package com.condicionales;

import java.util.Scanner;

public class Condicionales1_LASV {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.

		
		int num1;
		int num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("El numero mayor entre 2 numeros ");

		System.out.println("introduce tu primer numero");
		num1 = entrada.nextInt();
		
		System.out.println("introduce tu segundo numero");
		num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
		}else if (num2 > num1 ) {
			System.out.println("el numero mayor es: " + num2);
		}else {
			System.out.println("los numeros son iguales");
		}
		
	}

}
