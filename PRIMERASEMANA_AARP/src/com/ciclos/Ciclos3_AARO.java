package com.ciclos;

import java.util.Scanner;

public class Ciclos3_AARO {

	public static void main(String[] args) {
		// REALIZA UN PROGRAMA PARA DETERMINAR SI UN String es palindromo
		//en este ejercicio no supe como hacerlo asi que repase lo que explicó usted profesor y copie su programa
		//Se requiere de un Scanner para poder ingresar la palabra
		Scanner entrada= new Scanner(System.in);
		//sig.paso guardar la palabra a evaluar
		//y solicito la frase a evaluar
		System.out.println("Introduce la palabra o frase para evaluar si es palindromo");
		String original= entrada.nextLine();
		System.out.println(original);
		
		//Declaro un String que voy a armar con un ciclo en reversa
		String reversa="";
		//creamos el ciclo que nos ayudara a armar el String en reversa
		
		for (int i = original.length()-1; i >=0; i--) {
		reversa=reversa+ original.charAt(i);
		}
		System.out.println(reversa);
		
		//reemplazamos en ambas cadenas los espacios para poder realizar la evaluacion con equals
		original=original.replace(" ","");
		reversa=reversa.replace(" ","");
		if (original.equalsIgnoreCase(reversa)) {
			System.out.println("La palabra o frase es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		

	}

}
