package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String cadena = "Hoy es 11 de Noviembre de 2024";
		
		//.length() - devuelve el valor numerico entero de la longitud o tamñano del string
		//
		System.out.println("probanndo el metodo .length()");
		System.out.println(cadena.length());
		// como este metodo devuelve el valor numerico entero, si tengo la
		//necesidad de guardar ese valor en una variable de tipo nt lo puedo hacer 
		
		int longitud = cadena.length();
		
		//METODO .charAt - devuelve el caracter que se enceuntra en determinada psocion
		//en nuestro string
		System.out.println("probando el metodo .charAT()");
		System.out.println(cadena.charAt(2)); //en este caso y
		System.out.println(cadena.charAt(29)); //en este caso4
		
		//suponiendo que no conociera la longitud del ultimo caracter y quiero extraer el ulyimo 
		//caracter, se puede expresar mediante obtener la longitud -1 para llegar a la ultima posición
		System.out.println(cadena.charAt(cadena.length()-1));
		
		
		
		// METDODO.subtstring - devuelve la subcadena del String a parrir del indice
		//especificado
		System.out.println("probando el metodo substring()primera forma");
		System.out.println(cadena.substring(4)); 
		
		System.out.println("probando el metodo substring()segunda forma");
		System.out.println(cadena.substring(4, 23));
		
		// METODO. .toLowerCase()/.toUpperCase() - El primero convierte  la cadena de texto a minusculas
		//el segundo lo convierte a mayusculas 
		System.out.println("probando el metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("probando el metodo .toUpperCase()");
		System.out.println(cadena .toUpperCase());
	
		
		//.equals() compara un valor de un objeto  contra otro y son iuales 
		//devuelve true y si no devuelve false 
		System.out.println("probando el metodo .equals()");
		System.out.println(cadena .equals("hola")); // aqui aplica false porque no es igual 
		System.out.println(cadena .equals("hoy es 11 de noviembre de 2024")); //aplica false por las mayusculas y minusculas 
		//este metodo es sensible a mayusculas y minusculas
		
		// .equalsIgnoreCase - devuelve el valor true si las cadenas de texto son iguales 
		// en contenido ignorando mayusculas y minusculas 
		
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 11 de noviembre de 2024"));
		
		// METODO .replace() - remplaza un carater o secuencia de caracteres e un string
		//con otros nuevos 
		System.out.println("probando el metodo .replace()");
		System.out.println(cadena.replace("o", "O"));
		
		//los espacios tambien son considerados caracteres por lo que tambien se pueden remplazar



	}

}
