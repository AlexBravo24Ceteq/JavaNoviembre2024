package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Listas-son una coleccion de datos o elementos
		//definida como una sucesión de los mismos, coleccion implementada
		//por medio de la interface List y por medio de un array redimensionable
		//de la clase ArrayList
		//las listas si admiten valores duplicados, es coleccion de alto rendimiento
		//no podemos guardar objetos de dato primitivo
		//pero si datos de objeto string, wrapper, etc
		//para declarar una lista:
		List<String> lista=new ArrayList<String>();//list es la interface y array list es una clase
		//agregar elementos a la lista:
		lista.add("Elemento0");
		lista.add("Elemento1");
		lista.add("Elemento2");
		lista.add("Elemento3");
		lista.add("Elemento4");
		lista.add("Elemento5");
		lista.add("Elemento0");
		//imprimir una lista de elementos en consola
		System.out.println(lista);
		//imprimir un solo elemento o recuperar valor de una posicion
		System.out.println(lista.get(0));//indice 0
		System.out.println(lista.get(1));//indice 0
		//devolver un boolean si el valor existe en la lista
		System.out.println(lista.contains("Elemento5"));
		System.out.println(lista.contains("Elemento65"));
		//devuelve la posicion donde se encuentra al elemento por primera vez, primera coincidencia
		System.out.println(lista.indexOf("Elemento0"));
		//devuelva la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Elemento0"));
		//eliminar el elemento de la lista
		lista.remove(0);//puede ser por indice
		lista.remove("Elemento 0");//puede ser por valores
		//agregar elementos a la lista a partir de determinada posicion
		lista.add(2,"Celso");//no reemplaza los valores los desplaza solamente
		System.out.println(lista);
		//reemplazar el valor de una lista en determinada posicion
		lista.set(3, "Elemento_Posicion_3");
		System.out.println(lista);
		
		//recorrer o recuperar los valores de mi liosta e impromirlos en una nueva linea
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//puedo almacenar varios elementos si parametrizo mi lista
		//con elementos Object o sino la parametrizo
		List<Object> coleccion=new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(25);
		coleccion.add(true);
		coleccion.add(3.1416);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
	}

}
