package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Listas son una colecciones de datos o elementos definida como una secesion
		// de los mismos, esta coleccion se implemenrta a travez de
		// interface Lista y por medio de un array dedimencionable de la clase ArrayList
		// Las listas si admiten valores duplicados, es de las coleeciones mas
		// utilizadas
		// y con mejor rendimiento
		// No podemos guardar tipos de datos primitivo, pero si datos de tipo
		// objetos(Strings, wrapper, ect)

		// Delcar lista de elementos tipo String

		List<String> lista = new ArrayList<String>();

		// Agregar elementos a nuestra lista

		lista.add("Alex");
		lista.add("Rodolfo");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");

		// imprimir la lista en consola

		System.out.println(lista);

		// Si quiero recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(1));

		// Devuelva un valor booleano si el elemento existe en la lista

		System.out.println(lista.contains("Alberto"));

		// Devuelve la posiscion doonde se encuentra el elemento por
		// primera vez

		System.out.println(lista.indexOf("Alberto"));

		// Devuelve la ultima posicion donde encunetra el elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		// Eliminar un elementode mi lista

		System.out.println(lista);
		lista.remove(4);
		lista.remove("Carlos");
		System.out.println(lista);

		// Añadir elementos a la lista , indicando una determinada posicio
		//
		lista.add(2, "Celso");// se agrega elemento y desplaza las posisciones, no remplaza el elemenrto del
								// indice indicado
		System.out.println(lista);

		// Remplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);

		// recuperar todos los valores de mi lista e impirmirlos en una nueva linea
		// lo hare por un ciclo for()

		for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i));
		}

		// Puedo almacenar varios elementos si parametrizo mi lista
		// con lementos objet o si no la parametrizo

		List<Object> coleccion = new ArrayList<Object>();

		coleccion.add("Nombre");
		coleccion.add(20);
		coleccion.add(3544.2);
		coleccion.add(true);
		coleccion.add('o');

		List coleccion2 = new ArrayList();

		coleccion2.add("JOse");
		coleccion2.add(25);
		coleccion2.add(3544.2);
		coleccion2.add(true);
		coleccion2.add('t');
		
		System.out.println(coleccion);
		System.out.println(coleccion2);

	}

}
