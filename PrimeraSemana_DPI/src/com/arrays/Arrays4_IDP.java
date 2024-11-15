package com.arrays;

public class Arrays4_IDP {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores: 
		//{1,2,3,4,5}. Guardar los valores de este array 
		//en otro array distinto pero con los valores invertidos, 
		//es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		
		int array[] = {1, 2, 3, 4, 5};
		 
        int array2[] = new int[array.length];
 
        for (int i = array2.length - 1, j = 0; i >= 0; i--, j++) {
            array2[i] = array[j];
        }
 
        System.out.println("array original");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" [" + array[i] + "] ");
        }
        System.out.println("");
        System.out.println("array invertido");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" [" + array2[i] + "] ");
        }

	}

}
