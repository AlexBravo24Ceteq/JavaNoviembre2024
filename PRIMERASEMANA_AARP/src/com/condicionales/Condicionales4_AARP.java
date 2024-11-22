package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AARP {

	public static void main(String[] args) {
		
		//Ejercicio 4, realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayusculas.
		
		Scanner cadenaTexto=new Scanner(System.in);//se importa la libreria
			System.out.println("Ingresar una cadena por teclado y compruebe si contiene mayusculas");	
		String Texto;//declaramos la variable 
		String TextoLowerCase;
		
		Texto=cadenaTexto.nextLine();
		TextoLowerCase=Texto.toLowerCase();
		if (Texto.equals(TextoLowerCase)){
			System.out.println("Texto en minusculas");
		}else {
			System.out.println("El texto contiene mayusculas");
		}
		
		
			
		
		
		
		
		
		
		
		
		
				

	}//cierre main

}//cierre clase
