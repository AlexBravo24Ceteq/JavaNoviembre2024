package com.arrays;

public class Arrays4_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero
		 * con los valores invertidos, es decir, que el segundo array deberá tener los
		 * valores {5,4,3,2,1}.
		 */
		int numeros[] = {10,20,30,40,50};
		int numeros2[] = new int [numeros.length];
		
		System.out.println("Imprimiendo primer Array");
		for (int i = 0; i < numeros.length; i++) {
			int pos=numeros.length - (i+1);
			numeros2[pos]=numeros[i];
			System.out.println("Array1["+i+"]="+numeros[i]);
		}
		System.out.println("Imprimiendo segundo Array");
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Array2["+i+"]="+numeros2[i]);
		}
		

	}

}
