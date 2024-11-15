package com.arrays;

import java.util.Iterator;

public class Array4_JARG {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		//los valores invertidos, es decir, que el segundo array deberá tener los valores
		//{5,4,3,2,1}.
		
		int[]numeros= {1,2,3,4,5};
		
		//Segundo array
		
		int[]numerosInvertidos=new int[5];
		
		System.out.println("Los números invertidos son: ");
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			numerosInvertidos[i]=numeros[numeros.length-1-i]; 
			//Restando 1 nos da 4, que es el índice del último elemento en numeros
			//Al restarle i, estamos "moviendo" desde el último índice hacia 
			//el primero conforme i avanza de 0 a 4
					
		//Y como cada iteración va de 1 en 1, vamos recorriendo en orden inverso de 4 a 0
			
			
			System.out.println(numerosInvertidos[i]);
			
		}
		
		
	}

}
