package com;

public class MetodosString {

	public static void main(String[] args) {
		
		
		// Métodos o funcionalidades de la clase string
		
		String cadena = "Hoy es 11 de Noviembre de 2024";
		
		
		//.length() - Devuelve el valor numérico entero de la longitud o tamaño de un string 
		System.out.println("Probando el método .length()");
		System.out.println(cadena.length());
		
		//Como este método devuelve el valor numérico entero, si tengo la necesidad
		//de guardar ese valor en una variable de tipo int, lo puedo hacer
		int longitud = cadena.length(); //int longitud = 30;
		
		//.charAt() - Devuelve el caracter que se encuentre en determinada posición en 
		//nuestro String
		
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(29));
		
		//Suponiendo que no conociera la longitud de mi string y quiero extraer el último
		//caracter, se puede expresar mediante la longitud -1 para llegar a la última posición
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - Devuelve una subcadena del String a partir de un índice
		//especificado
		
		System.out.println("probando el método substring() primera forma");
		System.out.println(cadena.substring(4));
		
		System.out.println("Probando el método substring() segunda forma");
		System.out.println(cadena.substring(4,23));
		
		//.toLowerCase() /.toUpperCase() - El primeto convierte el texto a minúsculas
		//El segundo convierte a mayúsculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara un valor de un objeto contra otro y son iguales devuelve true
		//Este método es sensible al uso de mayúsculas y minúsculas
		System.out.println("probando el método .equals()");
		System.out.println(cadena.equals("hoy es 11 de noviembre de 2024"));
		
		//.equalsIgnoreCase - devuelve el valor true si las cadenas de texto son iguales
		//en contenido, ignorando el uso de mayúsculas y minúsculas
		
		System.out.println("probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de Noviembre de 2024"));
		
		//.replace() - Reemplaza un caracter o secuencia de caracteres de un string
		//con otros nuevos
		System.out.println("Probando el método .replace()");
		System.out.println(cadena.replace("o", "O"));
		System.out.println(cadena.replace("o", "$"));
		System.out.println(cadena.replace("Noviembre", "Diciembre"));
		
		System.out.println(cadena.replace(" ", "-"));
		System.out.println(cadena.replace(" ", ""));
	}

}
