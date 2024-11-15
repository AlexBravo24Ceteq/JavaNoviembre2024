package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JEAV {

	public static void main(String[] args) {

		//3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Dividiendo 2 numeros");
		System.out.print("Introdusca el primer numero: ");
		a = entrada.nextInt();
		
		System.out.print("Introdusca el segundo numero: ");
		b = entrada.nextInt();
		
		if(b == 0) {
			System.out.println("El segundo error no puede ser 0, de que le serviria hacer eso?"); 
		} else {
			System.out.println("El resultado de la division es: " + a/b); 
		}
		
	}

}
