package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		/*La interfaz Map asocia o almacena en pares (clave - valor a almacenar)
		 * Las claves no pueden duplicarse
		 * Es decir, la clave actua como un identificar unico para cada elemento a almacenar(ID)
		 */
		
		//Declaracion  de un Map  y una clase tipo Hasmap 
		//para declarar claves de tipo integrer y elementos de tipo String
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregamos elementos a nuestro HashMap
		
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		System.out.println(usuarios);
		System.out.println(usuarios.get(2));
		
		//eliminar un elemento
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los Valores  contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		for(Integer i: usuarios.keySet()) {
			System.out.println("llave: " + i + " Valor: " + usuarios.get(i));
		}

	}

}
