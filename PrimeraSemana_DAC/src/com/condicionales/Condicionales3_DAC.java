package com.condicionales;

import java.util.Scanner;

public class Condicionales3_DAC {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
		// variables
				int numero1;
				
				int numero2;
				
				// entrada de valores
				Scanner x = new Scanner(System.in);
				
				System.out.println("Introduce un numero");
				
				numero1 = x.nextInt();
				
				if(numero1 == 0) {
					
					System.out.println("ERROR");
				}else {
				
				System.out.println("Primer numero es:"+numero1);
				
				
				Scanner y = new Scanner(System.in);
				
				System.out.println("Introduce un numero");
				
				numero2 = y.nextInt();
			
				
			if (numero2 == 0) {
					System.out.println("ERROR");
				}else {
					System.out.println("Segundo numero es:"+numero2);
					
					System.out.println("el resultado de  " +numero1 + "/" + numero2+ " es:" );
					
					int division = numero1/numero2;
					
					System.out.println(division);
					
				}
				
				}
		
				
						
						
		
		

	}

}
