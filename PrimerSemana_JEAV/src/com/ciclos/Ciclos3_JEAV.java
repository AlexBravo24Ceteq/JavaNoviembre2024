package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JEAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String palabra;

        System.out.print("Introduzca una palabra: ");
        palabra = entrada.nextLine();  
        
        palabra = palabra.replace(" ", "").toLowerCase();
        
        boolean esPalindromo = true; 
        
        int longitud = palabra.length(); 
        
        for (int i = 0; i < longitud / 2; i++) { 
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) { 
                esPalindromo = false; 
                break; 
            } 
        } 
        
        if (esPalindromo) { 
            System.out.println("La palabra es un palindromo."); 
        } else { 
            System.out.println("La palabra no es un palindromo."); 
        }

        entrada.close();
    }
}
