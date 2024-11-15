package com.arrays;

import java.util.Scanner;

public class Arrays1_VMTM {
	//1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
	//Muestra por consola el índice y el valor al que corresponde.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float []numeros=new float[10];
		for(int i=0;i<10;i++) {
			System.out.println("Introduce el número "+(i+1)+":");
			numeros[i]=entrada.nextInt();
		}
		for(int i=0;i<10;i++) {
			System.out.println("["+(i)+"]"+"="+numeros[i]);
		}
	}
}
