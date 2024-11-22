package com;

import javax.swing.JOptionPane;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos  o funciones de la clase String
		
		String cadena = "Hoy es 11 de noviembre del 2024";
		
		//.length() - devuelve la longitud de un string
		System.out.println("El tamaño de mi cadena es:");
		System.out.println(cadena.length());
		
		
		int longitud = cadena.length();
		System.out.println(longitud);
		
		//.charAt() - Devuelve el caracter que se encuentre en determinada posision
		System.out.println("Probando el metodo .charAt()");
		System.out.println("caracter: "+cadena.charAt(0));
		
		/*
		 * Suponiendo que no se la longitud de mi String y quiero extraer el ultimo
		 * caracter
		 */
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		// .substring - Devuelve una subcadena del string apartir de un indice especificado
		System.out.println("probando el metodo substring() primera forma");
		System.out.println(cadena.substring(4));
		
		System.out.println("Probando el metodo substring en su segunda forma");
		System.out.println(cadena.substring(4,20));
		// .tolowerCase() / toUpperCase() - El primero convierte la cadena de texto a minuscula
		// el segundo metodo convierte a mayusculas
		
		System.out.println("Probando el metodo tolowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el metodo tolowerCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() -Compara un valor de un bojeto contra otro y si son iguales retorna un true
		System.out.println("probando el metodo .equals()");
		System.out.println(cadena.equals("hoy es 11 de noviembre del 2024"));
		System.out.println(cadena.equals("Hoy es 11 de noviembre del 2024"));
		
		// .equalsIgnoreCase - Compara un valor de un bojeto contra otro y si son iguales retorna un true
		// ignorando mayuculas y minusculas
		
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de noviembre del 2024"));
		System.out.println(cadena.equalsIgnoreCase("Hoy es 11 de noviembre del 2024"));
		
		// .replace() - Remplaza un caracter o secuencia de caracteres de un String
		System.out.println("probando el metodo .replace()");
		System.out.println(cadena.replace("e", "E"));
		System.out.println(cadena.replace("noviembre", "Diciembre"));
		System.out.println(cadena.replace(" ", ","));
		
		//Entrada y salida de datos con JOptionPane
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
		JOptionPane.showConfirmDialog(null, "El numero que ingresaste es: "+numero);
		
		
		
		
	}

}
