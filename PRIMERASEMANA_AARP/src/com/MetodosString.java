package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase String
		
		String cadena= "Hoy es 11 de noviembre de 2024";
		
		
		//.length()- Devuelve el valor entero de la longitud o tamaño de un String 
		System.out.println("Probando el método .length()");
		System.out.println(cadena .length());
		
		//Como este método devuelve el valor numérico entero, si tengo la 
		//necesidad de guardar ese valor en una variable de tipo int, lo puedo hacer
		int longitud= cadena.length(); // int longitud=30;
		
		//.charAt()- Devuelve el caracter que se encuentra en determinada posición en nuestro String
		
	System.out.println("Probando el Método .charAt()");
	System.out.println(cadena .charAt(2));
	
	System.out.println(cadena .charAt(29));
	
	//suponiendo que no conociera la longitud de mi String y quiero extrae el último caracter,
	//se puede expresar mediante obtener la longitud -1 para llegar a la última posición
	System.out.println(cadena.charAt(cadena.length()-1));
	
	//.substring- devuelve una subcadena del String a partir de un indice especificado
	
	System.out.println("Probando el método .substring() Primera forma");
	System.out.println(cadena .substring(4));
	
	System.out.println("Probando el método .substring() segunda forma");
	System.out.println(cadena .substring(4,20));
	
	//.toLowerCase()/.toUpperCase()- El primero convierte la cadena de texto a minusculas 
	//El segundo a mayusculas
	
	System.out.println("Probando el método .toLowerCase()");
	System.out.println( cadena.toLowerCase());
	
	System.out.println("Probando el método .toUpperCase()");
	System.out.println(cadena.toUpperCase());
	
	
	
	//.equals()- compara un valor contra otro y si son iguales devuelve true, si no lo son false
	//este método es sensible al uso de mayusculas y minusculas
	System.out.println("Probando el método .equals()");
	System.out.println(cadena.equals("Hoy es 11 de noviembre de 2024"));
	
		//.equalsIgnoreCase()- devuelve el valor true si las cadenas de texto son iguales ignorando uso 
	//de mayusculas y minusculas
	System.out.println("Probando el método .equalsIgnoreCase()");
	System.out.println(cadena.equalsIgnoreCase("hoy es 11 de noviembre de 2024"));
	
	//.replace()- reemplaza un caracter o secuencia de caracteres de un String con otros nuevos
	System.out.println("Probando el método .replace()");
	System.out.println(cadena.replace("o", "$"));
	System.out.println(cadena.replace("noviembre", "diciembre"));
	
	System.out.println(cadena.replace(" ", "-"));
	System.out.println(cadena.replace(" ", ""));
	
	

	}

}
