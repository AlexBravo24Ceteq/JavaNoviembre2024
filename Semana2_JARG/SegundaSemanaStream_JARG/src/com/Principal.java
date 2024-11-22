package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream - Funcionalidad a partir de Java 8
		//que nos va a permitir gestionar de una forma más
		//rápida e imperativa la informacion que tengamos
		//en nuestras colecciones de datos
		//Las colecciones se vuelven un flujo de datos a partir
		//del cual podemos solicitar la informacion que necesitemos
		
		//Ejemplo del uso de Stream
		
		Stream<String> nombres = Stream.of("Michi", "Johny", "Willy", "Josy").filter(item -> item.contains("i"));
		
			//Una vez filtramos la informacion la llevo hacia una lista
		
		List<String> names = nombres.collect(Collectors.toList());
		
		
		//Mostrar los resultados en consola
//		System.out.println(names);
		
		//Declaramos una lista para guarda a nuestros objetos persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a mi lista original
		original.add(new Persona("Jorge", "Masculino", 37));
		original.add(new Persona("Alicia", "Femenino", 25));
		original.add(new Persona("Cesar", "Masculino", 27));
		original.add(new Persona("Mauricio", "Masculino", 30));
		original.add(new Persona("Guadalupe", "Femenino", 25));
		original.add(new Persona("Lucina", "Femenino", 26));
		original.add(new Persona("Raul", "Masculino", 27));
		original.add(new Persona("Sergio", "Masculino", 38));
		original.add(new Persona("Gabriela", "Femenino", 22));
		original.add(new Persona("Rafael", "Masculino", 24));
		
		//Imprimir la lista original en consola
//		System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
			
//		}
		
		//Recuperar todos los elementos con el ciclo foreach
//		for (Persona i:original) {
//			System.out.println(i);
//		}
		
		//Imprimir el mismo ciclo forEach pero ahora a traves de nuestra lista
//		original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino
		//con un ciclo convencional
//		for (Persona i:original) {
//			if (i.getGenero().equals("Masculino")){
//			filtrada.add(i);
//			System.out.println(i);
//		}
		
		
//	}
		//Filtrar con el API Stream a las personas del genero femenino
		filtrada = original.stream().filter(item -> item.getGenero().equals("Femenino")).collect(Collectors.toList());
				
//		filtrada.forEach(a->System.out.println(a));
		
//		filtrada.forEach(System.out::println); es otra manera de imprimir
		
//		//Ordenar a las personas por edad ascendente
//		filtrada=original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//				
//		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos de mi lista
		
		
//		System.out.println(original.stream().count());	
		
		//Solicitar una variable booleana si algún elemento o todos
		//los elementos cumplen alguna condicion
		
//		boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30); //allMatch
//		
//		System.out.println(alguno);
		
		
		//Retornar un valor a una clase Optional
		//optioal es una clase que nos permite manejar valores nulos
		//en caso de que no se encuentren
		
		
		Optional<Persona>menorEdad=original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
	}
}
	












