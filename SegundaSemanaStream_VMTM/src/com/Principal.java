package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//API Stream - Funcionalidad a partir de 8 que 
		//ayuda a gestionar la informacion que tengamos en las colecciones de datos
		Stream<String> nombres=Stream.of("Victor","Miguel","Claudia","Terrón")
				.filter(item->item.contains("i"));
		
		//si la mando a imprimir me manda a impresion del objeto
		//System.out.println(nombres);
		//una vez filtrada se lleva a una lista
		List<String> nombresLista=nombres.collect(Collectors.toList());
		//Mostrar los resultados en consola
		//System.out.println(nombresLista);
		
		//Crear una lista para guardar nuestros objetos Persona
		List<Persona> listaOriginal=new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> listaFiltrada=new ArrayList<Persona>();
		
		//agregamos elementos a listaOriginal
		listaOriginal.add(new Persona("Persona0", "Masculino", 25));
		listaOriginal.add(new Persona("Persona1", "Masculino", 26));
		listaOriginal.add(new Persona("Persona2", "Masculino", 27));
		listaOriginal.add(new Persona("Persona3", "Femenino", 28));
		listaOriginal.add(new Persona("Persona4", "Femenino", 29));
		listaOriginal.add(new Persona("Persona5", "Femenino", 30));
		listaOriginal.add(new Persona("Persona6", "Femenino", 31));
		listaOriginal.add(new Persona("Persona7", "Femenino", 32));
		listaOriginal.add(new Persona("Persona8", "Femenino", 33));
		
		
		//imprimir lista original en consola
//		System.out.println(listaOriginal);
		
		//Recorrer la lista para ver cada elemento
//		for (int i = 0;i<listaOriginal.size();i++) {
//			System.out.println(listaOriginal.get(i));
//			
//		}
		
		//recuperar todos los elementos con el ciclo forEach
//		for(Persona i:listaOriginal) {//forma no tan buena
//			System.out.println(i);
//		}
		
		//foreach pero ahora mediante nuestra lista
		listaOriginal.forEach(item->System.out.println(item));//forma chingona
		System.out.println("VIDEO PARTE 2");
		
		//si filtraramos a los elementos del genero Masculino con un ciclo convencional sería de la siguiente forma:
//		for(Persona elemento:listaOriginal) {
//			if(elemento.getGenero().equals("Masculino")) {
//				listaFiltrada.add(elemento);
//				System.out.println(elemento);
//			}	
//		}
		
		//PARA FILTRAR CON API STREAM
		System.out.println("Filtrado con api stream");
		listaFiltrada=listaOriginal.stream()
				.filter(elemento->elemento.getGenero().equals("Masculino"))
				.collect(Collectors.toList());
		System.out.println("Forma 1");
		listaFiltrada.forEach(elemento->System.out.println(elemento));
		System.out.println("Forma 2");
		listaFiltrada.forEach(System.out::println);
		
		
		//ordenar a las personas por edad ascendentemente
		listaFiltrada=listaOriginal.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		System.out.println("Ordenado con stream");
		listaFiltrada.forEach(System.out::println);
		
		//contar el numero de elementos de la lista
		System.out.println("Contador con stream");
		System.out.println(listaOriginal.stream().count());
		
		//solicitar una var booleana si algun elemento o todos los elementos cumplen alguna condicion
		
		boolean alguno=listaOriginal.stream().anyMatch(elemento->elemento.getEdad()<20);//alguna coincidencia
		System.out.println("Booleano 0 con stream");
		System.out.println(alguno);
		System.out.println("Booleano 1 con stream");
		boolean algunoTodas=listaOriginal.stream().allMatch(elemento->elemento.getEdad()<20);//todas las coincidencia
		
		
		//retornar un valor a una clase optional
		//optional es una clase que permite manejar valores nulos
		//en caso de que no se encuentren
		System.out.println("Manejar nulos con stream");
		Optional<Persona> menorEdad=listaOriginal.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
	}

}
