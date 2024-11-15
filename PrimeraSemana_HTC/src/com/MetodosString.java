package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos de la clase String
		
		String cadena = "Hoy es 11 de Noviembre del 2024";
		
		System.out.println(cadena.length());
		
		//Este método devuelve el valor númerico entero. Entonces ahora se puede guardar en algo que guarde números, obvi.
		
		int longitud = cadena.length();
		
		//.charAt() caracter en posición
		
		System.out.println(cadena.charAt(0)); // Pido el primer carácter
		System.out.println(cadena.charAt(cadena.length()-1)); // Pido el último carácter. Le pongo menos 1 porque me sali de rango, jajaja. Porque enpezamnos de 0.
		System.out.println(cadena.substring(4)); // Cadena desde otra cadena. Ahí pido inicio.
		System.out.println(cadena.substring(4,20)); // Aquí pido inicio y final.
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		System.out.println(cadena.equals("hoy es 11 de Noviembre del 2024"));//equals compara valores y regresa boleano. Tiene que ser exacto.
		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de Noviembre del 2024"));//Este no tiene que ser exacto. Obvi.
		
		System.out.println(cadena.replace("e", "a")); // reemplaza 1 caracter
		System.out.println(cadena.replace("Hoy", "Ayer")); //reemplaza una cadena de caracteres.
		
	}

}
