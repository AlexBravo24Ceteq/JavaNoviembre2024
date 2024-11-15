package com.arrays;

public class Arrays2_RAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un array de números de 100 posiciones, que contendrá los números del 1
		 * al 100. Obtén la suma de todos ellos y la media.
		 */
		int numeros[] = new int [100];
		int suma=0, media=0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
			System.out.println(numeros[i]);
			suma=suma+numeros[i];
			media=suma/100;
		}
		
		System.out.println("La suma de toso los numeros es: "+suma);
		System.out.println("La media es: "+media);
	}

}
