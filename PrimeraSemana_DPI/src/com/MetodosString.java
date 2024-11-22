package com;

public class MetodosString {

	public static void main(String[] args) {
		
		String cadena = "Hoy es 11 de noviembre del 2024";
		//.length() Devuelve el valor del string
		System.out.println("Probando la funcion length");
		System.out.println(cadena.length());//se puee almacenar en una variable dde tipo int ello ue me devuelve la funcion lenght
		
		int longitud = cadena.length();
		
		System.out.println("Probando el metodo  .charAt");
		System.out.println(cadena.charAt(2));
		
		System.out.println(cadena.charAt(29));
		
	    //suponiendo ue no conosco l longitudy quiero extraer el ultimo caracter puedo obtener la longitud
		//y retar una poricion
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring devuelve una subcadena del metodo especificado
		
		System.out.println("Probando el metodo subtring() primer forma");
		System.out.println(cadena.substring(4));
		
		System.out.println("Probando el metodo subtring() segunda forma");
		System.out.println(cadena.substring(4,23));
		
		//metodos .tolowercae y .touppercase
		
		System.out.println("Probando el metodo toLowercase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el metodo toUppercase()");
		System.out.println(cadena.toUpperCase());
		
		// metodo .equals compara y i on iguales devuelve true de lo contrario devuelve false
		
		System.out.println("Probando el metodo .equals() false");
		System.out.println(cadena.equals("Hola mundo"));
		
		System.out.println("Probando el metodo .equals() true");
		System.out.println(cadena.equals("Hoy es 11 de noviembre del 2024"));
		
		// el mtodo .eualsIgnoreCase ignora el uso de mayuscula y minuculas
		
		System.out.println("Probando el metodo .equals() true");
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de NoviemBre del 2024"));
		
		//metodo .repalce reemplaza un caracter o una ecuencia de caracteres con otro nuevos
		
		System.out.println("Probando el metodo .replace()");
		System.out.println(cadena.replace("o", "&"));
		
		System.out.println("Probando el metodo .replace()");
		System.out.println(cadena.replace("Noviembre", "Enero"));
	
	}
	

}
