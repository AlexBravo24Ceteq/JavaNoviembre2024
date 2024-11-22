package com.condicionales;

import java.util.Scanner;

public class Condicionales3_RAS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 3.Crea un programa que pida al usuario dos números y muestre el resultado
			de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
			
		 */
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, resul;
		
		System.out.println("Introduce el primer numero: ");
		num1= entrada.nextInt();
		
		System.out.println("Introduce el primer numero: ");
		num2= entrada.nextInt();
		
		
		
		if(num2==0) {
			System.out.println("Error");
		}else {
			resul = num1/num2;
			System.out.println("Resultado de la Division: " +resul);
		}
	
		

	}


}
