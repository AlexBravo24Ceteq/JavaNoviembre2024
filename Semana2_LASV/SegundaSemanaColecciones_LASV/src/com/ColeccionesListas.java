package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		//Listas
		/*
		 * Coleccion de datos o elementos definida como una susecion de los mismos esta coleccion
		 * se implementa atraves de interfase list y por medio de un array redireccionable de la clase
		 * Arraylist 
		 * Las listas si admiten valores duplicados, es de las mas utilizadas y con mayyor rendimiento
		 * No podemos guardad tipos de datos primitivo pero sii tipo de datos objeto(Strings, Wrapper, etc)
		 * 
		 * Declarar una lista de elementos de tipo string
		 */
		
		List<String> lista = new ArrayList<String> ();
		
		//Agregar valores a nuestra lista
		
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//imprimir una lista en consola
		
		System.out.println(lista);
		
		//si yo quiero recuperar  el valor de un elemento en la lista
		System.out.println(lista.get(2));
		
		//existe laposibilidad dedevolver un valor boolean si existe en la lista
		System.out.println(lista.contains("Alex"));
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelvela posision donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve laultimaposiscion donde encuentra al elemento 
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento en la lista
		lista.remove(5);//se puede eliminar por nombre o por posicion del elemento
		System.out.println(lista);
		
		//Añadir elementos  a lalista, indicando una determinada posicion
		lista.add(2, "Celso");//se agrega el elemento y desplasa las posiciones no remplaza el elemento del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(3, "Sady");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos object o si no la parametrizo
		
		List<Object> coleccion = new ArrayList<Object>(); // o List coleccion = new ArrayList(); solo que esto no es recomendado 
		//ya que se tiene que identificar con que estamos trabajando
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add("%");
		
	}

}
