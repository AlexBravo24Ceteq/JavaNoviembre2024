package com;

import java.util.ArrayList;

import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Listas - Coleccion de datos o elementos definida como una
		//sucesion de los mismos 
		//Se implementa a traves de la interface List, y por medio de un array redimensionable
		//ArrayList
		//valores duplicados, mas utilizada y mejor rendimiento
		//solo datos de tipo objeto String, Wrapped 
		
		//declarara una lista de elementos de tipo String
		List <String> lista = new ArrayList <String>(); //list es la interface y arraylist es una clase 
		
		// Agregar elementos a nuestra lista con .add
		
		lista.add("Adriana"); //se encuentra en la posicion cero
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola 
		System.out.println(lista); 
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2)); //en este caso sarai 
		
		//Devuelva un valor booleano is el elementoexiste en la lista
		System.out.println(lista.contains("Alex")); // en este caso falso porque no existe
		System.out.println(lista.contains("Gabriela"));
		
		///Devuelve la posicion donde se encuentra al elemento por primera vez 
		System.out.println(lista.indexOf("Alberto"));
		
		// Devuelve la ultima poscion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//El metodo Remove para eliminar un elemento de la lista
		lista.remove("Alberto"); //elimino al primer alberto
		System.out.println(lista);
		
		//anadir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Celso"); //Desplaza los valores hacia adelante, no remplaza el elemnto del indice 
		System.out.println(lista);
		
		//Reemplazar el valode una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//una forma de Recorrer o recuperar todos los valores de la lista e imprimirlos
		//en una nueva linea se utiliza un ciclo for 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i)); //la primera vez que se ejecuta i vale 0 y la imprime y asi hasta que se
			//acaben los valores de la lista  
		}
		
		//Puedo almacenar varios elementos si paarametrizo mi lista con elementos object
		//o si no la parametrizo
		
		List <Object> coleccion = new ArrayList<Object> ();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		
		//si no parametrizamos no hay problema porque aun asi se puede llamar a imprimir todo
		//No es lo recomendado
		
	
		
	
		
		
		

	}

}
