package com.ciclos;

import java.util.Scanner;

public class Ciclos2_DAC {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. Ejemplo, 
		//tabla de 23 hasta el 95. 23 x 95 = ???
		
		int mult;
		int lim;
		int x=1 ;
		int y=0;
		
			
		
		
		
		Scanner m = new Scanner(System.in);
		
		System.out.println("Introiduzca un número a multiplicar");
		
		mult= m.nextInt();
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("Introiduzca un limite ");
		
		lim= l.nextInt();
		
		for ( x = 1; y < lim; x++) {
			
			y=x*mult;
			
				System.out.println(x + " x " + mult+ " = " + y    );	
					
				
		
			
		}
		
				
				
		
		
		
		
		

	}

}
