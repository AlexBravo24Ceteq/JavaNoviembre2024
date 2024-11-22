package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metrodos o funcionalidades de la clase String
		
		String cadena = "hoy es 11 de noviembre de 2024";
		
		//length() - devuelve el valor numerico entero de la longitud o tama;o de  un string
		System.out.println("probando el metodo .legnth()");
		System.out.println(cadena.length());
		
		//como este metrodo devuelve el valor numerico entero si tengo la necesidad
		// de guardar ese valor en una variable de tipo int. lo puedo hacer
		int longitud = cadena.length(); // int longitud = 30;
		
		// charAt() devuelve el caracter que se encuentre en determinada posicion de nuestro string
		System.out.println("probando el metodo .charAt()");
		System.out.println(cadena.charAt(2));
		
		//suponiendo que no conocieras la longitud de mi stringh y quiero extraer el ultimo
		//caracter, se puede expresar mediante obtener la longitud -1 para llegar a la ultima
		//posicion
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - devuelve una cadena de string a
		System.out.println("probando el metodo .substring() primera forma");
		System.out.println(cadena.substring(4));
		
		System.out.println("probando el metodo .substring() segunda forma");
		System.out.println(cadena.substring(4, 23));
		
		//.toLowerCase()/toUpPerCase() el primero convierte la cadena de texo a minusculas
		//el segundo lo convierte a mayusculas
		System.out.println("probando el metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("probando el metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() compara un valor de un objeto contra otro son iguales devuelve true o false
		
		System.out.println("probando el metodo .equals()");
		System.out.println(cadena.equals("hoy es 11 de noviembre de 2024"));// el metodo es sensible a mayusculas y minusculas
		
		//.equalsIgnoreCase()devuelva el valor true si las cadenas de trexto son iguales en contenido ignora las mayusculas y minusculas
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 11 de noviembre de 2024"));
		
		//.replace() remplaza un caracter o secuencia de caracteres de un string con otros nuevos
		
		System.out.println("probando el metodo .repplace()");
		System.out.println(cadena.replace("o", "O"));
		System.out.println(cadena.replace("o", "$"));
		System.out.println(cadena.replace("noviembre", "Diciembre"));
		System.out.println(cadena.replace(" ", "-"));
		
	}

}
