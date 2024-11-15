package com.condicionales;

import java.util.Scanner;

public class Condicionales1_DAC {

	public static void main(String[] args) {
		// Ejercicio 1 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
	// variables
		int numero1;
		
		int numero2;
		
		// entrada de valores
		Scanner x = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		numero1 = x.nextInt();
		
		System.out.println("Primer numero es:"+numero1);
		
		
		Scanner y = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		numero2 = y.nextInt();
		
		System.out.println("Segundo numero es:"+numero2);
		
		// evaluacion de valores simple
		System.out.println(numero1+" es mayor que "+numero2);
		
		System.out.println(numero1 > numero2 ? "Cierto" : "Falso");
		
		System.out.println(numero1 + " es igual que " + numero2);
		
		System.out.println(numero1 == numero2 ? "Cierto" : "Falso");
		
		
		System.out.println("Metodo IF");
		
		System.out.println(numero1 + " es igual o mayor que " +numero2);
		
		
			if(numero1 == numero2) {
				System.out.println("Iguales");
			}else if (numero1 < numero2){
				System.out.println("Menor");
			}else {
				System.out.println("Mayor");
			}
		
		
		
		
		
		
		
	}

}
