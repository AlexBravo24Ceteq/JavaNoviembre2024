package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		// Listas - Son una coleccion de datos o elementos
		// definida como una sucesion de los mismos
		// Esta coleccion se implementa por medio de la interface list
		// y por medio de un array redimendionable de la clase 
		// ArrayList
		// Las listas si admiten valores duplicados de las colecciones
		// son mas utilizadas y con mejor rendimiento
		// no podemos guardar tipos de datos primitivos
		// pero si datos de tipo objeto (String, Wrapper, etc)
		
		//  Declarar una lista de elementos de tipo String
		List <String> lista = new ArrayList <String> ();
		
		// Agregar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola 
		System.out.println(lista);
		
		// Imprimir o recuperar un solo valor de la lista
		System.out.println(lista.get(2));
		
		//devuelve un valor booleano si el elemento existe en la lista 
		System.out.println(lista.contains("Gabriela"));
		
		// devuelbe la posicion donde se encuentra el elemento
		// por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		// devuelve la ultima posicion donde encuentra al elemnto 
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi listas
		lista.remove(5);
		System.out.println(lista);
		
		// añadir elementos a la lista indicando una posicion
		lista.add(2, "Celso"); // con esta parte se agrega el elemento y desplaza las posiciones
		//no remplaza el elemnto del indice indicado
		System.out.println(lista);
		
		
		// remplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		// recorrer o recuperar todos los valores de mi lista 
		// e imprimirlos en una nueva linea 
	    for (int i = 0; i < lista.size(); i++) {
	    	System.out.println(lista.get(i));			
		}
	    
	    // PUEDO almacenar varios elementos si parametrizo mi lista 
	    //con elementos Objet o si  no la parametrizo
	    //List <Object> coleccion = new ArrayList <Object>();
	    List coleccion = new ArrayList ();
	    
	    coleccion.add("Nombre");
	    coleccion.add(23);
	    coleccion.add(3.1416);
	    coleccion.add(true);
	    coleccion.add('$');
	    
	    System.out.println(coleccion.get(2));
	}
}
