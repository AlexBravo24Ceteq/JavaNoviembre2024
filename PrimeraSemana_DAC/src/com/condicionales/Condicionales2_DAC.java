package com.condicionales;

import java.util.Scanner;

public class Condicionales2_DAC {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int numero;
		
		Scanner X = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		numero = X.nextInt();
		
		System.out.println("el numero " + numero + " es");
				
		
		int sobrante = numero%2;
		
		
		if (sobrante == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
				
				
		
		
		
		

	}

}
