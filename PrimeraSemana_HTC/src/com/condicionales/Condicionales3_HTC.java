package com.condicionales;

import java.util.Scanner;

public class Condicionales3_HTC {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		int dividend;
		int divisor;
		int result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca el dividendo");
		dividend = input.nextInt();
		System.out.println("Introduzca el divisor");
		divisor = input.nextInt();
	
		//result = dividend/divisor;
		
		if(divisor==0) {
			System.out.println("División entre 0, error");
		}else {
			System.out.println(dividend/divisor);
		}
		
		
	}

}
