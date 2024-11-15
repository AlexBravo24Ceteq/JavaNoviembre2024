package com.arrays;

import java.util.Scanner;

public class Arreglos1_JEAV {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int [] arreglo  = new int[10];
		
		System.out.println("Introduzca 10 numeros");
		
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = entrada.nextInt();
		}
		
		System.out.println("Los numeros que introdujo son:");
		
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println((i+1) + ".- " + arreglo[i]);
		}

	}	

}
