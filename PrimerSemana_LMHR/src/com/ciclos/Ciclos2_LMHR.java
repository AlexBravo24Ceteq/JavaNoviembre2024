package com.ciclos;

import java.util.Scanner;

public class Ciclos2_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		int numero;
		int numero2;
		int x=0;
		
		System.out.println("Introduce el número que quieres multiplicar");
		Scanner entrada =new Scanner (System.in);
		
		numero=entrada.nextInt();
		
		System.out.println("introduce el numero por el que lo quieras multiplicar");
		numero2 = entrada.nextInt();
		
		//CICLO
//		do {
//			System.out.println(x+".-"+(numero*numero2));
//		}
//		while (x>0);{
//			x++;
//		}
//			System.out.println(x+ ".-"+(numero*numero2));
//			numero=(numero*numero2);
//			
		for (int i=1; i <= numero2; i++ ) {	
			System.out.println(i + " - " + numero*i );
		}

	}
}

