package com.arrays;

public class Arrays2_AED {

	public static void main(String[] args) {
		
		// Ejercicio 2
		//2. Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		int[] numeros = new int[100];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        double media = (double) suma / numeros.length;

        System.out.println("Suma de los números del 1 al 100: " + suma);
        System.out.println("Media de los números del 1 al 100: " + media);
    
	}

}
