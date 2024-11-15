package com.condicionales;

import java.util.Scanner;

public class Condicionales_RAS {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
		
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce el primer numero: ");
		num1= entrada.nextInt();
		
		System.out.println("Introduce el primer numero: ");
		num2= entrada.nextInt();
		
		if(num1>num2) {
			System.out.println("El primer numero es mayor que el segundo");
		}else if(num1==num2){
			System.out.println("Los numeros son iguales");
		}else if (num1<num2){
			System.out.println("El segundo nuemro es mayor que el primero");
		}

	}

}
