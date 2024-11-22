package com.arrays;

public class Arreglos4_JEAV {

	public static void main(String[] args) {

		int [] arregloUno = {1,2,3,4,5};
		int [] arregloDos = new int [arregloUno.length];
		
		for(int i = 0; i < arregloUno.length; i++) {
			arregloDos[i] = arregloUno[arregloUno.length-(i+1)];
		}
		
		System.out.print("{ "); 

		for(int a : arregloDos) {
			System.out.print(a + ", "); 
		}
		
		System.out.print("}"); 

	}

}
