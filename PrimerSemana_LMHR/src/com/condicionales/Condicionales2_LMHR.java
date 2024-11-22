package com.condicionales;

import java.util.Scanner;

public class Condicionales2_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que pida un número por teclado y nos indique si es par  
		//o impar.
		int numero;
		
		System.out.println("introduce un número");
		Scanner entrada = new Scanner (System.in);
		numero= entrada.nextInt(); 
	
		
		int resultado = numero%2;
		
		//CONDICIONAL
		if (resultado == 0) {
			System.out.println("el numero es par");
		} else  {
			System.out.println("el numero es impar");
		}

	} //cierre main

} //cierre clase 
