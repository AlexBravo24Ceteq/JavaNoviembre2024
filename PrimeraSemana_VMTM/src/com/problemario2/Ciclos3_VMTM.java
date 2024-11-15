package com.problemario2;

import java.util.Scanner;

public class Ciclos3_VMTM {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la string: ");
		String cadena=entrada.nextLine();
		cadena=cadena.toUpperCase();
		cadena=cadena.replace(" ", "");
		//System.out.println(cadena);//debug 
		//System.out.println(cadena.length());
		
		for(int i=cadena.length();i>=1;i--) {
			//System.out.println(cadena.charAt(i-1));
			if(cadena.charAt(i-1)==cadena.charAt(cadena.length()-i)) {
				if(i==cadena.length()) {
					System.out.println("Es palindromo");
				}
			}else {
				System.out.println("No es palindromo");
				System.exit(0);//No es palindromo 
			}
		}
	}
}
