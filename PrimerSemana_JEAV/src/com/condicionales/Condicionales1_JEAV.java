package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JEAV {

	public static void main(String[] args) {

		//Ejercicio 1
		
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Comparando 2 numeros");
		System.out.print("Introdusca el primer numero: ");
		a = entrada.nextInt();
		
		System.out.print("Introdusca el segundo numero: ");
		b = entrada.nextInt();
		
		if (a > b) { 
			System.out.println("El numero mas grande es el primero: " + a); 
		} else if (a < b) { 
			System.out.println("El numero mas grande es el segundo: " + b); 
		} else { 
			System.out.println("Los numeros son iguales"); 
		}

		
	}

}
