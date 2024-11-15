package com.condicionales;

import java.util.Scanner;

public class Condicionales2_VMTM {
	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce un numero y te diré si es par o impar. ");
		float numero=entrada.nextFloat();
		if(numero%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar.");
		}
		
	}

}
