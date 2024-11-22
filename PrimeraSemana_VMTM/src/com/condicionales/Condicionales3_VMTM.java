package com.condicionales;

import java.util.Scanner;

public class Condicionales3_VMTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.Crea un programa que pida al usuario dos números y muestre el 
		//resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el numero 1: ");
		float numero1=entrada.nextFloat();
		System.out.println("Introduce el numero 2: ");
		float numero2=entrada.nextFloat();
		if(numero2==0) {
			System.out.println("Mensaje de error");
			System.exit(1);//termina en 1 para indicar error, normalmente se termina en 0
		}
		System.out.println("El resultado de su división es: "+ numero1/numero2);
		
		

	}

}
