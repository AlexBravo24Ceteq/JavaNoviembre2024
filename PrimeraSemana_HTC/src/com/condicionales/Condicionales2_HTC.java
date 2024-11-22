package com.condicionales;

import java.util.Scanner;
public class Condicionales2_HTC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int number;
		int result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca un Número");
		number = input.nextInt();
	
		result = number%2;
		
		if(result==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		

	}

}
