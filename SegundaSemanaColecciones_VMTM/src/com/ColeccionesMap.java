package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//la interfaz map asocia o almacena los datos en pares
		//clave-valor
		//las claves no pueden duplicarse
		//es decir la clave actua como identificador unico paca daca elemento
		//declaracion de un map y clase hashmap
		//para almacenar claves de tipo Integer y elementos de tipo String
		//String
		Map<Integer, String> usuarios=new HashMap<Integer,String>();//map interface hash es clase
		usuarios.put(0, "Usuario0");
		usuarios.put(2, "Usuario2");
		usuarios.put(1, "Usuario1");
		
		//imprimir hashmap en consola
		System.out.println(usuarios);
		
		//imprimir un solo valor almacenado en determinada clave
		System.out.println(usuarios.get(2));
		
		//eliminar un elemento de nuestro HashMap
		
		usuarios.remove(2);//es con la llave
		System.out.println(usuarios);//para verificar eliminación
		
		//imprimir las llaves de mi hashmap
		System.out.println(usuarios.keySet());
		
		//imprimir en consola los valores contenidos en el hashmap
		System.out.println(usuarios.values());
		
		//mandar a imprimir cada una de las llaves con un ciclo
		//for each
		for(Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		//mandar a imprimir cada uno de los valores con un ciclo
		for(String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//imprimir llaves y valores 
		for(Integer i: usuarios.keySet()) {
			System.out.printf("Llave: %d, Valor: %s. \n",i,usuarios.get(i));
		}

	}

}
