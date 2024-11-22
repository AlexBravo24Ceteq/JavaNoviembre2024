package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// La interfas Map asocia o almacena los datos en pares y los asocia mediante
		// una clave y un valor a almacenar en dicha clave
		// las claves no pueden duplicarse, pero los elementos almacenados si

		// La clave actua como un id unico para el dato a almacenar

		// Ejemplo de declaracion Map y la clase HashMap de clave sde tipo Int y
		// almacenamiento de Sring
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		// Map es la interfase y HashMap es la clase que nos permite almacenar los
		// valores

		// Agregamos elementos al HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Carla");
		usuarios.put(2, "Pedro");

		// Imprimir hashmap en consola
		System.out.println(usuarios);

		// Imprimir en pantalla un solo valor almacenado en una determinada clave

		System.out.println(usuarios.get(2));

		// Eliminar un elemento del HashMap

		usuarios.remove(3);
		System.out.println(usuarios);

		// Imprimir en consola las llaves de mi HashMaps
		System.out.println(usuarios.keySet());

		// Imprimir en consola los valores contenidos en el HashMap
		System.out.println(usuarios.values());

		// Imprimir cada una de las llaves con un ciclo for each

		for (Integer i : usuarios.keySet()) {

			System.out.println(i);

		}

		// Imprimir cada una de los valores con un ciclo for each

				for (String i : usuarios.values()) {

					System.out.println(i);

				}
		
		//Imprimir llaves y valores
				for (Integer i : usuarios.keySet()) {
					System.out.println("Llave: "+i + "  Valor: "+ usuarios.get(i));
				}
		
	}

}
