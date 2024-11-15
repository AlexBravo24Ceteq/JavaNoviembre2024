package com.condicionales;

import java.util.Scanner;

public class Condicionales4_VMTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la cadena: ");
		//entrada.nextLine();
		String cadena=entrada.nextLine();
		if(cadena.matches(".*[A-Z].*")) {//utilizando expresiones regulares
			System.out.println("Si tiene mayusculas");
		}else {
			System.out.println("No tiene mayusculas");
		}
		

	}

}
