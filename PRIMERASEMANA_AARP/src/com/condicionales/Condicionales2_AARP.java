package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AARP {

	public static void main(String[] args) {
		// Ejercicio 2 Realizar un programa que pida un numero por teclado y nos indique si es par o impar.
		
		//Ingresar el Scanner para poder solicitar al usuario el ingreso por teclado
		
		System.out.println("Ingrese un numero");
		Scanner entrada=new Scanner(System.in);
		int numero= entrada.nextInt();
	
		//Se evalua el numero ingreso para determinar si es par o impar
		int resultado=numero%2;
		System.out.println(resultado);
		if (resultado==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
	}
		
	
		
		
		
		
			
		
		
		
	

	}//cierre del main

}//cierra de la clase
