package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase string
		
		String cadena ="Hoy es 11 de Noviembre de 2024";
		//.lenght() -Devuelve el valor numerico entero o tamaño de un string
		System.out.println("Probando el método.lenght()");
		System.out.println(cadena.length());
		
		//Como este metodo devuekve el valor numerico entero si tengo la necesidad de guardar ese valor en una variable de tipo Int dr puede hacer
		int longitud = cadena.length(); // int longitud = 30;
		
		//.chartAT() - Devuelve el caracter que se encuentre eN deternminada posicion nuestro SSTRING
		
		System.out.println("Probando el método.charAT()");
		
		System.out.println(cadena.charAt(2));// este metodo cuenta desde 0 por lo que la letra y es la posición numero 2
		
		System.out.println(cadena.charAt(29));
		
		// Suponiendo que no se connozca la longitud de mi string y se necesita el ultimo caracter se saca el valor de string -1
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		
		//.substring  - Devuelve una cadena del string a apartir de un indice especificado
		
		System.out.println("Probando el méodo substring() primera forma"); // se especifica desde que indice inicia la impresion del texto en este caso arranca desde la 4ta posición
		System.out.println(cadena.substring(4));
		
		System.out.println("Probando el méodo substring() segunda forma");	// se especifica desde que indice inicia la impresion del texto y hasta que pocicion termina
		System.out.println(cadena.substring(4,23));
		
		//.toLowerCase() / .toUpperCase() - El primero convierte cadena de texto en minuscula
		
		System.out.println("Probando el méodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el méodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() compara el valor de un objeto contra otro y si son iguales devuelve TRUE si no devuelve FALSE
		
		System.out.println("Probando el metodo .equals()");
		System.out.println(cadena.equals("Hola"));
		System.out.println(cadena.equals("hoy es 11 de noviembre de 2024"));//El metodo es sencible al uso de minusculas y mayusculas
		System.out.println(cadena.equals("Hoy es 11 de Noviembre de 2024"));
		
		//.equalsIgnoreCase - devuelve el valor TRUE si las cadenas de texto son iguales en contenido ignorando si son minusculas o mayusculas
		

		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hola"));
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de noviembre de 2024"));
		
		
		//.replace() - Reemplaza un caracter o secuencia de caracteres de un String con otros nuevos
		
		System.out.println("Probando el metodo .replace()");
		
		System.out.println(cadena.replace("o", "O"));	//se pueden sustituir caracteres simples
		System.out.println(cadena.replace("o", "$"));	// se pueden cambiar por simbolos
		System.out.println(cadena.replace("Noviembre", "Diciembre"));	// palabras enteras
		System.out.println(cadena.replace(" ", "-"));	//los espacios tambien son caracteres
		System.out.println(cadena.replace(" ", ""));
		
		
		
	
		
		
		
	}

}
