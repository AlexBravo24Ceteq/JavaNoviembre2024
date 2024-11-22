package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Listas- Son una coleccion de datos o elementos
		//definida como una sucesion de los mismos
		//Esta coleccion se implementa a través de la interface List
		//Y por medio de un array redimensionable de la clase
		//ArrayList
		//Las listas sí admiten valores duplicados, es de las colecciones
		//más utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//Pero sí tipos de dato Objeto (String, Wrapper, etc)
		
		
		//Declarar una lista de elementos de tipo String
		
		List<String> lista=new ArrayList<String>(); //Diferencia entre arrayList y List. List es la interface, y ArrayList es una clase
		
		//Agregar elementos a nuestra lista
		lista.add("Michi"); 
		lista.add("Johny");
		lista.add("Willy");
		lista.add("Rafa");
		lista.add("Josy");
		lista.add("Willy");
		
		
		//Imprimir una lista en consola
		
		System.out.println(lista);
		
		//Imprimir o recuperar de un solo elemento de la lista
		System.out.println(lista.get(3));
		
		//Devolver un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Michi"));
		
		//Devolver la posicion donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Willy"));
		
		//Devuelve la última posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Willy"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Lib");
		System.out.println(lista); 	//El elemento Lib no reemplazó el valor en 2, los desplazó hacia la siguiente posición
		
		//Reemplazar el valor de una determinada posición 
		lista.set(3, "Gus");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista 
		//e imprimirlos en una nueva línea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos object o si no la parametrizo
		List<Object> coleccion =new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		//Son colecciones versatiles porque nos van a permitir recuperar informacion y son redimensionables 

	}

}
