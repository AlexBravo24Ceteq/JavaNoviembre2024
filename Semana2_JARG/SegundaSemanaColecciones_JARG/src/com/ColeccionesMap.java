package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		// La interfaz Map asocia o almacena los datos en pares (clave - valor a almacenar)
		//Las claves no pueden duplicarse
		
		//Es decir, la clave actúa como un identificador 
		//único para cada elemento a almacenar

		//Ej. Declaración de un Map y la clase Hashmap
		//para almacenar claves de tipo integer y elementos de
		//tipo string
		
		
		Map<Integer, String> usuarios=new HashMap<Integer, String>();
		
		//Agregar elementos a nuestro HashMap
		usuarios.put(1, "Michi");
		usuarios.put(3, "Johny");
		usuarios.put(2, "Willy");
		
		//Imprimir mi HashMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en 
		//una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		/*
		 * Mandar a imprimir cada una de las llaves con un ciclo
		 * for each
		 */
		for (Integer i:usuarios.keySet()) {
			System.out.println(i);
		}
		
		/*
		 * Mandar a imprimir cada uno de los valores con un ciclo
		 * for each
		 */
		for (String i:usuarios.values()) { //Para cada elemento i de tipo string contenido en usuarios, imprimir
			System.out.println(i);
		}
		
		//Para imprimir llaves y valores 
		for(Integer i:usuarios.keySet()) {
			System.out.println("Llave: "+i+ " Valor: "+ usuarios.get(i));
		}
		
		
		
		
		
		
		
		
		
	}

}
















