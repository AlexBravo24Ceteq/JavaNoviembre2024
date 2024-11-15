package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JEAV {

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);

        int edad, nota;
        String genero;

        System.out.println("Programa de Aceptacion:");
        System.out.print("Introduzca la edad: ");
        edad = entrada.nextInt();

        System.out.print("Introduzca la nota: ");
        nota = entrada.nextInt();

        System.out.print("Introduzca el genero (M/F): ");
        genero = entrada.next().toUpperCase();

        if (edad >= 18 && nota >= 5) {
            if (genero.equals("F")) {
                System.out.println("Ha sido ACEPTADA");
            } else if (genero.equals("M")) {
                System.out.println("Su aceptacion es POSIBLE");
            } else {
                System.out.println("Genero no reconocido");
            }
        } else {
            System.out.println("Nosotros le llamaremos... (*NO ACEPTADA*)");
        }

      
    }
}
