package com.arrays;

public class Arrays4_AED {

	public static void main(String[] args) {
		
		// Egercicio 4
		// 4. Dado un array de números de 5 posiciones con los siguientes valores: 
		// {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		// los valores invertidos, es decir, que el segundo array deberá tener los valores 
		// {5,4,3,2,1}.

		 int[] numeros = {1, 2, 3, 4, 5};
	        int[] invertido = new int[numeros.length];

	        for (int i = 0; i < numeros.length; i++) {
	            invertido[i] = numeros[numeros.length - 1 - i];
	        }

	        System.out.println("Array invertido:");
	        for (int num : invertido) {
	            System.out.print(num + " ");
	        }
	        
	}

}
