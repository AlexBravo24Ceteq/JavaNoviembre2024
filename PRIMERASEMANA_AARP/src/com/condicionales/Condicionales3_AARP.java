package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AARP {

	public static void main(String[] args) {
		// Ejercicio 3, crear un programa que pida al usuario 2 números y muestre
		//el resultado de su división. Si el resultado es 0 debe mostrar un mensaje de error.
		
		System.out.println("Ingrese el primer numero");
		Scanner entrada=new Scanner(System.in);
		int numero1 = entrada.nextInt();
		System.out.println("Ingrese el segundo número");
		int numero2=entrada.nextInt();

		//se realiza la division del numero 1 entre el numero 2
		
		int resultado= numero1/numero2;
		System.out.println(resultado);
		if (resultado==0)
		{System.out.println("Error");
		}
		
	

	}//CIERRE MAIN

}//CIERRE CLASE
