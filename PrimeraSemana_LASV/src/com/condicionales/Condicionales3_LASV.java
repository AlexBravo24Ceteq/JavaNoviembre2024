package com.condicionales;

import java.util.Scanner;

public class Condicionales3_LASV {

	public static void main(String[] args) {
		// .Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

		int num1;
		int num2;
		int resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Resultado de una division");
		System.out.println("introduce tu primer numero");
		num1 = entrada.nextInt();
		
		System.out.println("introduce tu segundo numero");
		num2 = entrada.nextInt();
		
		if (num2 == 0) {
			System.out.println("error no se puede utilizar el numero 0");
		}else {
			resultado = num1/num2;
			System.out.println(resultado);
		}
		
	}

}
