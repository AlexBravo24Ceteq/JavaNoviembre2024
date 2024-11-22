package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JARG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar.
		
		int numero;
		System.out.println("Introduce un número");
		Scanner entrada = new Scanner(System.in); 
		numero = entrada.nextInt();
		
		
		
		//Utilizamos operador modulo % 
		
				
				int resultado = numero%2;
				
				System.out.println(resultado);
				
				if (resultado==0) {
					System.out.println("Par");
				
				}else {
					System.out.println("Impar");
				}	
				

	}

}
