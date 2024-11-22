package com.condicionales;

import java.util.Scanner;

public class Condicionales3_IDP {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner datoEntrada = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("introduce el primer numero");
		num1 = datoEntrada.nextInt();
		System.out.println("introduce el segundo numero");
		num2 = datoEntrada.nextInt();
		
		if(num2 == 0) {
			System.out.println("Error el segundo numero no puede er 0 ");
		}else {
		int division = (num1/num2);
		System.out.println("El resultado de la division es:"+ division);
		}

	}

}
