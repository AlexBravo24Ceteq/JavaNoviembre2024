package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JEAV {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Multiplicador");
		System.out.print("Introdusca el numero por el que se multiplicará: ");
		a = entrada.nextInt();
		
		System.out.print("Introdusca el numero de iteraciones: ");
		b = entrada.nextInt();
		
		System.out.println("Tabla del " + a + ":");

		
		for(int i = 0; i<=b; i++) {
			System.out.println(a + " X " + (i) + " = " + (a*i));
		}
		

	}

}
