package com.problemario2;

import java.util.Scanner;

public class Ciclos2_VMTM {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		//introducido desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el numero del que deseas hacer la tabla: ");
		int numero=entrada.nextInt();
		System.out.println("Introduce el numero hasta el que deseas hacer la tabla: ");
		int limite=entrada.nextInt();
		for(int i=0;i<=limite;i++) {
			System.out.println("La tabla del "+numero+" * "+i+" = "+(numero*i));
		}
	}

}
