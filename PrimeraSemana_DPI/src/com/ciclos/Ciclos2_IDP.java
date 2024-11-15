package com.ciclos;

import java.util.Scanner;

public class Ciclos2_IDP {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner datoEntrada = new Scanner(System.in);
		int numTabla;
		int iteracion;
		int resultado;
		
		
		System.out.println("Introduce elnumero de la tabla de multiplicar: ");
		numTabla = datoEntrada.nextInt();
		System.out.println("Introduce introduce hasta que numero se multiplocara ");
		iteracion = datoEntrada.nextInt();
		
		for (int i = 1; i <= iteracion ; i++) {
			resultado= (i * numTabla);
			System.out.println( numTabla +" X "+ i+ " = " + resultado);
		}
		

	}

}
