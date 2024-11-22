package com;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cientifica calculadora = new Cientifica("Casio", "Negro", "FX-00000");

        System.out.println("Detalles de la calculadora: " + calculadora);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double num3 = scanner.nextDouble();
        
        
        System.out.println("\nOperaciones con 2 Numeros");


        System.out.println("\nResultados:");
        System.out.println("Suma de dos numeros: " + calculadora.sumar(num1, num2));
        System.out.println("Resta de dos numeros: " + calculadora.restar(num1, num2));
        System.out.println("Multiplicacion de dos numeros: " + calculadora.multiplicar(num1, num2));
        System.out.println("División de dos numeros: " + calculadora.dividir(num1, num2));

        System.out.println("");
        System.out.println("Operaciones con 3 Numeros\n");


        System.out.println("Suma de tres numeros: " + calculadora.sumar(num1, num2, num3));
        System.out.println("Resta de tres numeros: " + calculadora.restar(num1, num2, num3));
        System.out.println("Multiplicacion de tres nomeros: " + calculadora.multiplicar(num1, num2, num3));
        System.out.println("Division de tres numeros: " + calculadora.dividir(num1, num2, num3));

        scanner.close();
    }
}
