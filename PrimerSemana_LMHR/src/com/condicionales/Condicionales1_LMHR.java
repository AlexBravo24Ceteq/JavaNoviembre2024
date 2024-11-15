package com.condicionales;

import java.util.Scanner;

public class Condicionales1_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EJERCICIO 1 
		//Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		int primerNumero;
		int segundoNumero;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduce el primer numero");
		
		primerNumero= entrada.nextInt();
		
		System.out.println("introduce el segundo numero");
		
		segundoNumero=entrada.nextInt();
		
		
		
//		//ESTRUCTURA CONDICIONAL
		if ( primerNumero > segundoNumero ) {
			System.out.println("el primer numero es mayor");
		} else if (primerNumero < segundoNumero) {
			System.out.println("el segundo numero es mayor");
		}else  {
			System.out.println("los numeros son iguales");
		}


	} //cierre main

} //cierre clase 
