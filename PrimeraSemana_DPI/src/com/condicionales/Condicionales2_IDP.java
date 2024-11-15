package com.condicionales;

import java.util.Scanner;

public class Condicionales2_IDP {

	public static void main(String[] args) {
		// realiza un programa que pida un numero por teclado y nos indique si es par o impar
 
		Scanner datoEntrada = new Scanner(System.in);
		int num;
				
		System.out.println("introduce un numero para saber si es par o impar");
		num = datoEntrada.nextInt();
		int resultado =num%2;
		
		if(resultado == 1) {
			System.out.println("el numero e impar");
		}else {
			System.out.println("el numero es par");
		}
		
		
		
	}

}
