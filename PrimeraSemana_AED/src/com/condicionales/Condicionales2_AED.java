package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AED {

	public static void main(String[] args) {
		
		// Ejercicio 2
		// Realiza un programa que pida un número por teclado y nos indique si es par  
		// o impar.

		int x = 0;
		int resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Evaluación de números pares e impares");
		System.out.println("Por favor digite el numero a evaluar");
		
		if (entrada.hasNextInt()) {
            x = entrada.nextInt();    // Se guarda el valor del primer numero
    	    resultado = x%2;
            // Evaluó en base al residuo para saber si es par o impar 
            if (resultado != 0) { 
            	System.out.println("El numero: "+ x + " es un numero impar"); // si es un numero impar
            }
            else {
              	System.out.println("El numero: "+ x + " es un numero par"); // si es numero par
            }
            
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
	}

}
