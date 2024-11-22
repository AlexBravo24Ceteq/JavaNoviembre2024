package com.arrays;

public class Arrays4_LASV {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores: 
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}. 
		
		int [] numeros1 = {1, 2, 3, 4, 5};
		int [] reversa = new int[numeros1.length];
		
		System.out.println("los numero invertidos son: ");
		
		for (int i = (numeros1.length-1), j=0; i >=0;  i--, j++) {
			
			reversa[j] = numeros1[i];
			System.out.println(reversa[j]);
		}
	

	}

}
