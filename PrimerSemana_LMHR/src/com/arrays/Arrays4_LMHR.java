package com.arrays;

public class Arrays4_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Dado un array de números de 5 posiciones con los siguientes valores: 
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deberá tener los valores 
//		{5,4,3,2,1}. 
		
		int []numeros = {1,2,3,4,5};
		int []numeros2 =new int [5] ;
		
		System.out.println("El array invertido es:");
		// LLenado array invertido
		for (int i = 0; i < numeros.length; i++) {
			numeros2 [i]= numeros [numeros.length-1-i];
			System.out.println("El array invertido es:" + numeros2 [i]);
			
		}
		
			
		}
	   
			
				
		}
		




