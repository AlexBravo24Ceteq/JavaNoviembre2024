package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//el ejercicio no especifica cantiadad asi que solo lo manejare a 2 numeros o cantidades
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		float a=entrada.nextFloat();
		System.out.println("Introduce el siguiente numero: ");
		float b=entrada.nextFloat();
		
		Calculadora nuevaCalculadora=new Cientifica();
		
		System.out.println("Introduce la marca de la calculadora: ");
		entrada.nextLine();
		String marca=entrada.nextLine();
		nuevaCalculadora.setMarca(marca);
		System.out.println("Introduce el color de la calculadora: ");
		String color=entrada.nextLine();
		nuevaCalculadora.setColor(color);
		System.out.println("Introduce el tipo de pantalla de la calculadora: ");
		String tipoPantalla=entrada.nextLine();
		nuevaCalculadora.setTipoPantalla(tipoPantalla);
		
		nuevaCalculadora.sumar(a,b);
		nuevaCalculadora.restar(a,b);
		nuevaCalculadora.multiplicar(a,b);
		nuevaCalculadora.dividir(a,b);
		System.out.println("Suma polimorfica a 3 argumentos");
		nuevaCalculadora.sumar(10, 5, 5);
		
	}
}
