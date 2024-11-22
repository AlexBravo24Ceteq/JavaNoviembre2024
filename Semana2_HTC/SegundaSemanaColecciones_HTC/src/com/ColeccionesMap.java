package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		//La interfaz Map asocia o almancena datos en pares. Lets go. Claves no se duplican, lo demás si.
		
		Map<Integer,String> usuarios = new HashMap<Integer,String>(); //Map <INDICETIPO, DATOSTIPO> nombre = y lo demás.
		
		usuarios.put(1, "Angel"); //put coloca elementos.
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		System.out.println(usuarios);
		System.out.println(usuarios.get(2)); //get funciona y usa el indice.
		
		usuarios.remove(3);//remove quita.
		System.out.println(usuarios);
		
		System.out.println(usuarios.keySet());// Lista de indices.
		System.out.println(usuarios.values()); // lista de los valores.
		
		for (Integer i: usuarios.keySet()) {//New for just dropped. Ahí dice por cada integer contenido en keySet.
			System.out.println(i);
		}
		
		for (String i: usuarios.values()) {//New for just dropped. Ahí dice por cada String contenido en values.
			System.out.println(i);
		}
	}

}
