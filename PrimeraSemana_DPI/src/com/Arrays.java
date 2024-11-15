package com;

public class Arrays {

	public static void main(String[] args) {
		// 
		
		int [] numeros = new int[5]; // ejemplo e array declarado con su tamanio
		
		//acontinuacion guardamos valores dentro del array en cada poscicion
		numeros[0]= 10;
		numeros[1]= 11;
		numeros[2]= 12;
		numeros[3]= 13;
		numeros[4]= 14; 
		
		System.out.println(numeros[4]);
		
		int suma = numeros[4] + numeros[0];
		
		System.out.println(suma);
		
		char[] nombre= {'i','s','a','i'}; //en cso de los cracteres se puede imprimir el arreglo directmente
		
		System.out.println(nombre);
		
		int[] numero2= {10, 11, 12, 13, 14, 15};
		for (int i = 0; i < numero2.length; i++) {
			System.out.println(numero2[i]);
		}
		
		for (int i : numero2) {
			
			System.out.println(i);
		}
		
		
		

	}

}
