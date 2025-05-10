package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La interface map oaocia o almacena los datos
		// en pares [clave][valor]
		// Las claves no pueden duplicarce

		// La clave actua como un identificador unico para
		// cada lemento a almacenar "ID"

		// Declaracion de un map y la clase hashMap

		Map<Integer, String> users = new HashMap<Integer, String>();

		// Agregamos elementos a nustros HashMap
		users.put(1, "Juan");
		users.put(3, "Karla");
		users.put(2, "Pedro");

		// Imprimir mi HashMap en consola

		System.out.println(users);
		System.out.println(users.get(2));

		// Eliminiar un elemento de nuestro HashMap
		System.out.println("Eliminando un elemento");
		users.remove(3);
		System.out.println(users);

		// Imprimir en consola unicamente las llaves de mi HashMap
		System.out.println(users.keySet());

		// Imprimir en consola unicamente los valores de mi HashMap
		System.out.println(users.values());

		// Mandar a imprimir cada una de las llaves con un ciclo
		// for each

		for (Integer i : users.keySet()) {
			System.out.println(i);
		}
		// Mandar a imprimir cada una de los valores con un ciclo
		// for each

		for (String i : users.values()) {
			System.out.println(i);
		}
		//Imprimir llaves y valores 
		for(Integer i: users.keySet()) {
			System.out.println("Llave: "+i+" valor: "+users.get(i));
		}
	}

}
