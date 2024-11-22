package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Declaremos una lista
		
		List<String> lista = new ArrayList<String>(); //Como una clase o array. List<TIPO> nombre = new ArrayList<MISMOTIPO>().
		lista.add("Adriana"); //Agregando cosas a esa lista.
		lista.add("Monseny");
		lista.add("Alex");
		lista.add("Jan");
		lista.add("Dani");
		
		System.out.println(lista);//toda la lista
		System.out.println(lista.get(3));//posición especifica
		System.out.println(lista.contains("Heri"));//Itera buscando ese valor, regresa un bool
		System.out.println(lista.indexOf("Dani"));//Primera vez de una instancia
		System.out.println(lista.lastIndexOf("Monseny"));//Ultima vez de una instancia
		
		lista.remove("Alex");// o el numero de indíce a remover.
		System.out.println(lista);
		lista.add(2,"BLEEM");//agregar desplaza los elementos hacia adelante, no borra.
		System.out.println(lista);
		
		lista.set(3,"Mayte"); // esto si reemplaza.
		System.out.println(lista);
		
		for(int i = 0;i < lista.size(); i++) { //también puedo imprimir a la antigua
			System.out.println(lista.get(i));
		}
		
		List<Object> coleccion = new ArrayList<Object>(); //Curiosamente, <object> podría no estar y funciona, pero no es tan chido.
		coleccion.add("Nombre");
		coleccion.add(21);
		coleccion.add(3.1416);
		coleccion.add(true);
		
		System.out.println(coleccion);
		
		
	}

}
