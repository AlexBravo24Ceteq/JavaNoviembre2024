package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AED {

	public static void main(String[] args) {
		
		// Ejercicio 1  
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		// mayor o si son iguales. 

		int x = 0;
		int y = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Iniciaremos con la evaluación de mayores menores o iguales");
		
		System.out.println("Por favor digite el primer numero"); // Se solicita el primer numero 
		if (entrada.hasNextInt()) {
            x = entrada.nextInt();    // Se guarda el valor del primer numero
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		
		System.out.println("Por favor digite el segundo numero"); // Se solicita el segundo numero  
		if (entrada.hasNextInt()) {
            y = entrada.nextInt();    // Se guarda el valor del segundo numero
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		
		// Se comparan los numeros ingrezados 
		if (x > y) {
			System.out.println("El Primer numero: " + x + " es mayor que el segundo: " + y);
		}else if(x < y) {
			System.out.println("El Segundo numero: " + y + " es mayor que el primero: "+ x);
		}else {
			System.out.println("Los valores de ambos numeros son iguales primero: "+ x + " segundo: "+ y);
		}
		
	}

}
