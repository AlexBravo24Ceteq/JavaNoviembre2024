package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AARP {

	public static void main(String[] args) {
		
		// Ejercicio 1
		// Realiza un programa que reciba dos números por teclado y nos indique cual es mayor 
		//o si son iguales.
		
		//Solicitar al usuario que ingrese dos numeros
		
		System.out.println("Ingresar 2 números ");
Scanner entrada= new Scanner(System.in);
System.out.println("Ingrese numero 1");
int numero1=entrada.nextInt();
System.out.println("Ingrese numero 2");
int numero2=entrada.nextInt();

//Comparar los números ingresados por teclado para indicar cual es mayor a si son iguales
if (numero1>numero2) {
	System.out.println("El primer numero es mayor al segundo");
	} else if (numero1<numero2){
		System.out.println("El segundo número es mayor que el primero");	
}else { //para el caso de que los numeros sean iguales
	System.out.println("Los dos numeros son iguales");
}








	}

}
