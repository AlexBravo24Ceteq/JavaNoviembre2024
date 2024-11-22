package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// La interfaz map asocia o almacena los datos en pares
		// (clave - valor a almacenar)
		//las claves no se duplican
		
		//la clave actua como un identficador unico para cada
		//eelemento a lmacenar (ID)
		
		//DECLARACION de un Map y clase hashMap
		//para almacenar claves de tipo Integer y elementos de tipo
		//String
		
		Map<Integer,String> usuarios = new HashMap<Integer,String> ();
		//map interface y hashmap clase
		//Agregamos elementos a nuestro hashmap
		
		usuarios.put(1, "Angel"); //las claves pueden ir en desorden
		usuarios.put(3, "Carla");
		usuarios.put(2, "Pedro");
		
		//Si yo mando a impimir mi hashmap en consola
		System.out.println(usuarios);
		
		//imprimir en antalla un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento del hashMap
		
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//mandar a imprimir en cnsola las llaves de mi hashMap
		System.out.println(usuarios.keySet()); //no devuelve un valor si no la lista
		
		//Imprimir   en consola los valores contenido en hashmap
		System.out.println(usuarios.values());
		
		//Mandar a imprimir cada una de las llaves con un ciclo for each
		
		for (Integer i: usuarios.keySet()) { 
			System.out.println(i);//para cada elemento contenido en la coleccion
			//quiero mandar a imprimir cada elemento en una nueva linea 
		}
		//Mandar a imprimir cada una de los valores con un ciclo for each
		for (String i: usuarios.values()) { 
			System.out.println(i); 
	}
		//Imprimir llaves y valores 
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave: "+ i + " Valor: " + usuarios.get(i));
			
		}

}
}
