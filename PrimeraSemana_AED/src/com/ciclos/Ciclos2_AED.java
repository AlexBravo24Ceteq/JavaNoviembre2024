package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AED {

	public static void main(String[] args) {
		
		// Ejercicio 2
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		// introducido desde teclado, hasta la iteración deseada por el usuario. 
		// Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		int num1 = 0;
		int limite = 0;
		int contador = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero que desea multiplicar (multiplicando)");
		
		if (entrada.hasNextInt()) {
			num1 = entrada.nextInt();    // Se guarda el valor del multiplicando
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		
		System.out.println("Hasta que numero desea multiplicar? ");
		
		if (entrada.hasNextInt()) {
			limite = entrada.nextInt();    // Se guarda el limite
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }

		System.out.println("Tabla del " + num1 + " hasta " +num1+ " X " + limite);
		
		
		while (contador <= limite ) {  
	    	System.out.println( num1 + " por "+ contador + " = " +(num1 * contador));
	    	contador++; // Se incrementa mi contador en uno
		}
	}

}
