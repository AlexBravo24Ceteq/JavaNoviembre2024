package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase "String"
		
		String cadena = "Hoy es 11 de Noviembre de 2024";
		
		//La clase String cuenta con un método llamado: .length() - Devuelve el valor numérico entero de la longitud o tamaño de un String
		System.out.println("Probando el método .length()");
		System.out.println(cadena.length());
		
		//Como éste método devuelve el valor numérido entero, si tengo la necesidad de guardar ese valor en una variable de tipo "int", lo puedo hacer
		int longitud = cadena.length(); //int longitud = 30;
		
		//.charAt() - Devuelve el caracter que se encuentre en determinada posición en nuestro string
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(29));
		
		//Suponiendo que no conociera la longitud de mi String y quiero extraer el último caracter, se puede expresiar mediante
		//obtener la longitud -1 para llegar a la última posición
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - Devuelve una subcadena del String a partir de un índice especificado
		System.out.println("Probando el método .substring() primera forma");
		System.out.println(cadena.substring(4));
		
		System.out.println("Probando el método .substring() segunda forma");
		System.out.println(cadena.substring(4, 20));
		
		//.toLowerCase() - convierte la cadena de texto a minúsculas
		//.toUpperCase() - convierte la cadena de texto a mayúsculas
		System.out.println("Probando el método .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara el valor de un objeto contra otro y si son iguales, devuelve "true"
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("Hola"));
		System.out.println(cadena.equals("hoy es 11 de noviembre de 2024")); //.equals es sensible al uso de mayúsculas y minúsculas
		
		//.equalsIgnoreCase - devuelve el valor true si las cadenas de texto son iguales en contenido ignorando Mayúsculas y minúsculas
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy Es 11 de nOVIEMBRE de 2024"));
		
		//.replace() - Reemplaza un caracter o secuencia de caracteres de un String
		//con otros nuevos
		
		System.out.println("Probando el método .replace()");
		System.out.println(cadena.replace("o", "O"));
		System.out.println(cadena.replace("o", "$"));
		System.out.println(cadena.replace("Noviembre", "Diciembre"));
		System.out.println(cadena.replace(" ", "-"));
		System.out.println(cadena.replace(" ", ""));
		
		

	}

}
