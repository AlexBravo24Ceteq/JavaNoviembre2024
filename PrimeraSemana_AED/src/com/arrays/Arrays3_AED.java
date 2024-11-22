package com.arrays;

import java.util.Scanner;

public class Arrays3_AED {

	public static void main(String[] args) {
		
		// ejercicio 3
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		// caracteres.
		
		Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = entrada.nextLine();

        char[] caracteres = frase.toCharArray();

        System.out.println("Caracteres de la frase en un array:");
        for (char letra : caracteres) {
            System.out.print(letra + " ");
        }
        
        entrada.close();

	}

}
