package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// la interfaz map asosia o almacena los dato en pares
		// y los asocia por clave y valor 
		//las claves no pueden duplicarse
		
		//declarar un map y una clase hasmap
		//para lmcenar claves de tipo integer
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "Angel");
		usuarios.put(3,"Karla");
		usuarios.put(2,"pepe");
		
		System.out.println(usuarios);
		
		//imprimir en pantalla un solo valor almacenado en una determinad clave
		
		System.out.println(usuarios.get(3));
		
		// eliminar un elemento de nuestro hashMap
		
		usuarios.remove(3);
		
		System.out.println(usuarios);
		//impime en consola las llve de mi hashmap
		
		System.out.println(usuarios.keySet());
		
		//si quiero imprimir en consola los datos de mi hashmap
		
		System.out.println(usuarios.values());
		//mandar  imprimir con un for each
		
		for(Integer i: usuarios.keySet()) {
			System.out.println(i);
			
		}
		for(String i: usuarios.values()) {
			System.out.println(i);
			
		}
		//imrpimir llve y valor
		for(Integer i: usuarios.keySet()) {
			System.out.println("llave: "+i+" valor: "+usuarios.get(i));
			
		}
	}

}
