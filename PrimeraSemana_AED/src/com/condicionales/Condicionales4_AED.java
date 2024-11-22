package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AED {

	public static void main(String[] args) {
		
		// Ejercicio 4
		//4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
		String cadena = "";
		boolean tieneMayusculas = false;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Se iniciara con el procesó de validación de mayúsculas");
		
		System.out.println("Por favor ingrese el texto que desea revisar"); // Se solicita el primer numero 
		cadena = entrada.nextLine();    // Se guarda el texto que introduce el usuario
		
		tieneMayusculas = cadena.matches(".*[A-Z].*"); // Verificar si la cadena contiene alguna letra mayúscula
		
		// se evalua si se tien mayusculas
		if (tieneMayusculas) {
            System.out.println("La cadena contiene letras mayúsculas.");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }

	}

}
