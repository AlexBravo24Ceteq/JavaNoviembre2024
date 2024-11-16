package com.ciclos;

public class Ciclos1_AED {

	public static void main(String[] args) {
		
		// Ejercicio1
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12

		int x = 12; // Inicializo en 12 porque sera el numero multiplicado
		int contador = 1; // Este sera el multiplicador
		
    	System.out.println("Tabla del 12");
		while (contador <= 10 ) {  
	    	System.out.println( x + " por "+ contador + " = " +(x * contador));
	    	contador++; // Se incrementa mi contador en uno
		}
	}

}
