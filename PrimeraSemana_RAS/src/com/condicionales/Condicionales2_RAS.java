package com.condicionales;

import java.util.Scanner;

public class Condicionales2_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2.Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el un numero: ");
		num= entrada.nextInt();
		
	
		
		if((num%2)==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El nuemro es impar");
		}

	}

}
