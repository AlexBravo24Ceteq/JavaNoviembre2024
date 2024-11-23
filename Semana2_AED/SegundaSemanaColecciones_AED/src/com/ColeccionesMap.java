package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		// LA interface Map asocia o almacen los datos
		// En pares (clave - valor a almacenar)
		// Las claves no pueden duplicarse
		
        // Es decir la clave actua como un identificador unico para cada elementoa almacenar ID
		
		// declaracion de un Map y la clase HashMAp
		// para clases de tipo integer y elementos de tipo 
		// String
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");

		//Imprimir valores HashMap
		System.out.println(usuarios);
		
		// imprimir en pantalla un solo valor almacenado en 
		// una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento
		usuarios.remove(3);
		System.out.println(usuarios);
		
		// imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		// imprimir en consola los valores contenidos en mi HAsMap
		System.out.println(usuarios.values());
		
		// Mandar a imprimir cada llave con un ciclo for each
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		// Mandar a imprimir cada uno de los valores con un ciclo for each
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		// Imprimir llaves y valores 
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave "+ i + " Valor: "+ usuarios.get(i) );
		}
	}
}
