package com; //Nombre del paquete. Porque empiezan con "com"?

public class TiposDeDatos { //Nombre de la clase.

	public static void main(String[] args) { // Metodo principal. Punto de entrada y ejecución de un programa. Lo primero que se corre. Jaja, corre.
		
		
		/*
		 * Comentario de multiples lineas. Requiere esos asteriscos.
		*/
		
		byte numero; // Declarando variable- Tipo nombre
		
		numero = 127; // Definiendo variable después. 

		
		byte by = -128; // Declarando y definiendo variable - Tipo nombre = valor
		
		short sh = 32767; // Todos estos los estamos poniendo en sus limites. Ahora se porque uso tantos floats en shaders. No sé cual es el equivalente a fixed y half.
		int in = 2147483647; //chingo de memoria. Lo odiaría en shaders pero sigue siendo el que más ocupo, wtf. Pues es el más usado.
		long largo = 214748364799l; //debe terminar con una L para funcionar. Quirky like that.
		
		float pulgadas = 2.54f; //Solo usalo para decimales. TAmbién necesita un sufijo.
		double pi = 3.1416; // El más amplio de los decimales.
		
		boolean eval = true; //true o false
		char words = 'a'; // Para caráctares,Pero solo uno, chafísima.
		
		/*
		 *Tipos de dato estructurado
		 *no primitivos
		 *Tipos de dato objeto
		 */
		
		String nombre = "Eskibidi"; // String es una clase, por eso el color y la mayúscula.
		
		words = '?'  ; // ahi cambie mi variable.
		nombre.toUpperCase();// Como nombre esta guardado en una clase (es un objeto), puede realizar más operaciones.
		//Tipos de dato objeto pueden acceder a métodos y funciones.
		
		//Wrapper, otro tipo de objeto. Envuelven a los primitivos para darles funcionalidades. 
		
		Byte variable = 3; //Este sigue siendo un byte, pero al estar en mayúsculas se vuelve un wrapper. Mismos valores, pero ahora es clase.
		Double decimales = 0.1; 
		
		variable.toString(); //Aquí esta usando una función mientras aun es un byte. Al pedo.
		int x = 1;
		int y = 2;
		
		System.out.println("Algo"); // Para imprimir en consola
		System.out.println(nombre.toUpperCase());
		System.out.println(x+y); // Este lo puse haciendo syso ctrl + spacebar. Interesante.
		System.out.println(nombre.toUpperCase()+ " "+ (x+y)); //Concatenación
		
	}
	
}
