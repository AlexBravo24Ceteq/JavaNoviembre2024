package com.ciclos;

import java.util.Scanner;

public class Ciclos8_JEAV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int a, b;
		
		System.out.print("Introduzca el inicio del rango numerico: ");
		a = entrada.nextInt();
		
		System.out.print("Introduzca el fin del rango numerico: ");
		b = entrada.nextInt();
		
		for(int i = a;i<=b;i++) {
			System.out.print(i + " ,");
		}
		
	}

}
