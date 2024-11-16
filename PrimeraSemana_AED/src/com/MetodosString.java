package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funcionalidades de la clase string
		
		String cadena = "Hoy es 11 de Noviembre de 2024";
		
		//.length() - Devuelve el valor numerico entero de la longitud o tamaño de un string
		System.out.println("Probando el metodo .length");
		System.out.println(cadena.length());
		
		// como este metodo devuelbe el valor numerico entero 
		// si tengo la nesecidad de guardar ese valor en una variable de tipo in lo puedo hacer
		
		int longitud = cadena.length(); // int longitud = 30;
		
		//.charAt() - Devuelbe el caracater en determinada posicion en un string
		
		System.out.println("Probando el metodo .charAt()");
		System.out.println(cadena.charAt(2));
		
		System.out.println(cadena.charAt(29));
		
		/* suponiendo que no conociera la longitud de mi string y quiero extrar el ultimo caracter
		 * se puede expresar mediante obtener la longitud -1 para llegar a la ultioma posicion ya que 
		 * se inicializa en 0
		 */	
		System.out.println(cadena.charAt(cadena.length()-1));
		
		/*
		 * devuebe una cadea del string a partir de un metodo especifico
		 */
		System.out.println("Provando el metodo substring() primera forma");
		System.out.println(cadena.substring(4));
		
		System.out.println("Provando el metodo substring() primera forma");
		System.out.println(cadena.substring(4,23));
		
		/*
		 * .tolowecase()/.toupercase() - el primero convierter la cadena de texto
		 * a minuscula 
		 */
		
		System.out.println("Probar el metodo .toLoweCase");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probar el metodo .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - compara el valor de un objerto contra otro y regresa un true o un false
		// este metodo es sensible a mayusculas y minusculas
		System.out.println("Probando el metodo .equals()");
		System.out.println(cadena.equals("Hoy es 11 de Noviembre de 2024"));
		
		//.equalsIfnorecase - devuelbe el valor true si las cadenas de texto son iguales
		// en contenido ignoro uso de mayusculas y minusculas
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de noviembre de 2024"));
		
		//.replace() - Remplaza un caraqcter o una secuencia de caracteres de un string con otro nuevo 
		System.out.println("Probando el metodo .Replace()");
		System.out.println(cadena.replace("o", "O"));
		System.out.println(cadena.replace("o", "*"));
		System.out.println(cadena.replace("Noviembre", "Diciembre"));
		
		System.out.println(cadena.replace(" ", "-"));
		System.out.println(cadena.replace(" ", ""));
		
	}

}
