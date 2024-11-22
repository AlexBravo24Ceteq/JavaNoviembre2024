package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Hoy es 12 de Noviembre de 2024";
		
		System.out.println("Probando el método .length()");
		System.out.println(cadena.length());
		
		int longitud=cadena.length();
		
		//.charAt() devuelve el caracter que se encuentra en determinada posicion en el String
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring deuelve una subcadena del string a partir de un indice
		
		System.out.println("Probando el método .substring");
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		System.out.println("Probando el metodo .equals");
		System.out.println(cadena.equals("Hoy es 13 de Noviembre del 2024"));
		
		System.out.println("Probando el metodo equalsisignorecase");
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de noviembre de 2024"));
		
		System.out.println("Probando el método .replace()");
		System.out.println(cadena.replace("o","O"));
		
		

	}

}
