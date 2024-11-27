package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Listas - Son una colección de datos o elementos definida como una sucesión de los mismos
		//Esta colección se implementa a través de la Interface List
		//y por medio de un Array redimensionable de la clase Arraylist
		//Las listas sí admiten valores duplicados, es de las colecciones más utilizadas
		//y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo, pero sí datos de tipo Objeto (String, Wrapper, etc.)
		
		//Declarar una lista de elementos de tipo String
		
		List<String> lista = new ArrayList<String> ();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana"); //esto va agregar este elemento en la lista en la posición 0
		lista.add("Carlos"); //esto va agregar este elemento en la lista en la posición 1
		lista.add("Saraí"); //esto va agregar este elemento en la lista en la posición 2
		lista.add("Alberto"); //esto va agregar este elemento en la lista en la posición 3
		lista.add("Gabriela"); //esto va agregar este elemento en la lista en la posición 4
		lista.add("Alberto");
		
		//Imprimir una lista en consola:
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un sólo elemento de la lista:
		System.out.println(lista.get(2));
		
		//Devuelva un valor booleano si el elemento existe en la lista:
		System.out.println(lista.contains("Gabriela")); //va a imprimir en consola un valor true pues sí está en la lista
		System.out.println(lista.contains("Alex")); //va a imprimir en consola un valor false pues NO está en la lista
		
		//Devuleve la posición donde se encuentra al elemento por primera vez:
		System.out.println(lista.indexOf("Alberto")); //va a imprimir su posición en la que lo encuentra la primera vez, que es la 3
		System.out.println(lista.indexOf("Alex")); //al no existir va a imprimir un valor -1
		System.out.println(lista.indexOf("Josué")); //al no existir va a imprimir un valor -1
		
		//Devuelve la última posición donde encuentra al elemento:
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista:
		lista.remove(5); //o se puede eliminar por el objeto: lista.remove("Alberto");
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posición:
		lista.add(2, "Celso"); //Se agrega el elemento y desplaza las demás posiciones
		//no reemplaza el elemento del índice indicado
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posición:
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva línea:
		for (int i = 0; i < lista.size (); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista
		//con elementos Object o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object> ();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		
	}

}
