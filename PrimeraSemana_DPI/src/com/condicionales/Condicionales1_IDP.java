package com.condicionales;

import java.util.Scanner;

public class Condicionales1_IDP {

	public static void main(String[] args) {
		//realiza un programa que reciba dos numeros por teclado y evalue cual numero 
		//es el mayor
		
		Scanner datoEntrada = new Scanner(System.in);
		int primerDato;
		int segundoDato;
		
		System.out.println("introduce el primer numero");
		primerDato = datoEntrada.nextInt();
		System.out.println("introduce el segundo numero");
		segundoDato = datoEntrada.nextInt();
		
		if(primerDato > segundoDato){
			System.out.println("introduce el mayor es: " + primerDato );
		}else {
			System.out.println("introduce el mayor es: " + segundoDato );
		}
		

	}

}
