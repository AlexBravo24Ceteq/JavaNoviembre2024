package com.condicionales;

import java.util.Scanner;

public class Condicionales3_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		
		int numero1;
		int numero2;
		
		System.out.println("introduce el primer numero");
		Scanner entrada = new Scanner (System.in);
		
		numero1= entrada.nextInt();
		
		System.out.println("introduce el segundo numero");
		
		numero2=entrada.nextInt();
	
		
		//CONDICIONAL
		if (numero2 == 0) {
			System.out.println("el segundo numero no es valido");
		} else {
			int resultado = numero1/numero2;
			System.out.println("el resultado de la divison es:" + resultado);
		}
		

	} //cierre main

} //cierre clase 
