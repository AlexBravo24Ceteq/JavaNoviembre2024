package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VMTM {
	//1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		float x= entrada.nextFloat();
		System.out.println("Introduce el segundo numero: ");
		float y= entrada.nextFloat();
		if(x>y) {
			System.out.println("El primer numero es mayor que el segundo.");
		}else if(y>x) {
			System.out.println("El segundo numero es mayor que el primero");
		}else {
			System.out.println("Son iguales");
		}		
	}
	

}
