package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Los array , tambien conocidos como arreglos o vectores 
		 * Nos permiten almacenar un conjuento de dartos de un tipo en comun
		 * 
		 */
		
		int []  numeros = new int [5];// array declarado solo el tamaño 
		// procedemos a guardaer datos dentro del array
		numeros[0]=10;
		numeros[1]=11;
		numeros[2]=12;
		numeros[3]=13;
		numeros[4]=14;
		
		//imprimir en consola
		System.out.println(numeros[4]);
		//Sumando elemntos del array
		int suma = numeros[4]+numeros[0];
		System.out.println(suma);
		//Desventa no pueden crecer en tiempo de ejecucion 
		//numeros[5]=15;
		//System.out.println(numeros[5]);
		
		char [] nombre = {'a','l','e','x'};
		int numeros2[] = {10,20,30,40,50};
		char arrayCaracteres[]; arrayCaracteres = new char[10];
		
		// En el caso de los caracteres puedo mandar a imprimir el array directamente
		System.out.println(nombre);
		
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//for each
		for(int i:numeros2) {
			System.out.println(i);
		}
	}

}
