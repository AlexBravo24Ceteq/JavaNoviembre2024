package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//listas - son una coleccion de datos o elementos definida comom una sucesion de los mismos
		//esta coleccion se implementa a travez de la interfase list y pod medio de un array re dimencionable de la calse ArrayList.
		//las listas si permiten valores duplicados es de las colecciones mas utlilizadas y con mejor rendimiento
		//no podemos guardar tipos de dato primitivo 
		//pero si datos de tipo Objeto(String,Wrapper.etc.)
		
		List<String> lista = new ArrayList<String>();
		
		//list es una interfase y Arraylist es una clse
		
		//Agregar elementos a nuestra lista
		
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		
		// imprimir una lista en consola
		
		System.out.println(lista);
		// imprimir o recuperar el valor de un solo elemento de la lista
		
		System.out.println(lista.get(2));
		
		
		//devuelva un valor booleano si el elemento existe en la lista
		
		System.out.println(lista.contains("Gabriela"));
		
		
		//devuelve la posicion dodnde se encuentra al elemento por primera vez
		
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde se encuentra el elemento
		
		System.out.println(lista.lastIndexOf("Alberto"));
		
		
		//El metodo remuve para eliminar un elemento de la lista
		
		lista.remove(5);
		
		System.out.println(lista);
		
		//Añadir elementos a la lista indicando una determinada posicion
		
		lista.add(2, "Celso"); //se agrega el elemento y desplaza las posiciones no reemplaza el elemento del incie indicado
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posción
		
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		
		//Recuperar todos los valores de la lista e imprimirlos en una nueva linea
		
	 for (int i = 0; i <lista.size(); i++) {
		 
		 System.out.println(lista.get(i));
	}
		
		//Puedo almacenar varios elementos si parametrizo elementos object o si no la parametrizo
	 
	// List<Object> coleccion =new ArrayList<Object>();
	 
	 //Otra forma de sinyaxis es la siguiente
	 List coleccion =new ArrayList();
	 
	 //Subralla todo pero es debido a que nos esta avisandpo que no se sabe que se esta guardando
	 
	 
	 coleccion.add("Nombre");
	 coleccion.add(23);
	 coleccion.add(3.1416);
	 coleccion.add(true);
	 coleccion.add("$");
	 
		
		System.out.println(coleccion.get(2));
		
		
	}

}
