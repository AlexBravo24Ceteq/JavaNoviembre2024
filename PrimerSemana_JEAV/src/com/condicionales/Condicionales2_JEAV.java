package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JEAV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		
		System.out.println("Validando numero");
		System.out.print("Introdusca un numero: ");
		a = entrada.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("El numero es par"); 
		} else {
			System.out.println("El numero es impar"); 
		}

	}

}
