package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AED {

	public static void main(String[] args) {
		
		// Ejercicio 3
		//3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int x = 0;
		int y = 0;
		int resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor digite el primer numero (dividendo)"); // Se solicita el primer numero 
		if (entrada.hasNextInt()) {		
            x = entrada.nextInt();    // Se guarda el valor del primer numero
        	if (x == 0) {
        		System.out.println("Error no es posible que 0 sea el dividendo"); // si el usuario digita 0
        		return;
        	}
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		
		System.out.println("Por favor digite el segundo numero (divisor)"); // Se solicita el segundo numero  
		if (entrada.hasNextInt()) {
            y = entrada.nextInt();    // Se guarda el valor del segundo numero
            if (y == 0) {
        		System.out.println("Error no es posible que 0 sea el divisor"); // si el usuario digita 0
        		return;
        	}
        } else {
            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
            return;
        }
		
		// En caso de que los numeros digitados sean validos 
		System.out.println("Realizando división....");		
		resultado = (x/y); // Se efectua la divicion   
		System.out.println("El resultado es "+ resultado ); // Se muestra el resultado

	}

}
