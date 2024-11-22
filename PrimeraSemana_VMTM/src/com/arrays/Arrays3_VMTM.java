package com.arrays;

import java.util.Scanner;

public class Arrays3_VMTM {
	//3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
	//caracteres.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=entrada.nextLine();
		int tam=frase.length();
		
		char []caracteres=new char[tam];
		for(int i=0;i<tam;i++) {
			caracteres[i]=frase.charAt(i);
		}
		System.out.println("El tamaño del arreglo de caracteres es: "+ caracteres.length);
	}

}
