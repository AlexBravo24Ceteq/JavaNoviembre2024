package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream e una funcionalida de jva 8
		//ue nos va a permitir getionar de un forma ms rapida 
		//e imperativa la informacion de nuestras colecciones de datos
		//las colecciones se vuelven un flujo de datos
		//del cul podemos solicitar la info que necesitamos
		
	//Ejemplo de el uso de Stream
		
		Stream <String> nombres = Stream.of("Isai","Pepe","Alex","Alberto")
				.filter(item -> item.contains("e"));
		//una vez que filtramos la informacion la llevamos a una lista
		
		List<String> names = nombres.collect(Collectors.toList());
		
		// mostramos los resultado en consola
		
		//System.out.println(names);
		
		//declaramos una lita pra gurdar objetos persona
		
		List<Persona> original = new ArrayList<Persona>();
		//declaramos una lita pra gurdar informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//agregamos elementos a nuestra lista original
		
		original.add(new Persona("Jorge","MASCULINO", 37));
		original.add(new Persona("Isai","MASCULINO", 30));
		original.add(new Persona("pepe","MASCULINO", 20));
		original.add(new Persona("Lupe","FEMENINO", 25));
		original.add(new Persona("Sergio","MASCULINO", 32));
		original.add(new Persona("Laura","FEMENINO", 27));
		original.add(new Persona("Rafael","MASCULINO", 28));
		original.add(new Persona("Maria","FEMENINO", 31));
		original.add(new Persona("Brayan","MASCULINO", 29));
		
		System.out.println(original);
		
		for(int i = 0; i< original.size(); i++) {
			System.out.println(original.get(i));
		}
		
		//recuperar todo lo elementos con for each
		
//		for(Persona i:original) {
//			System.out.println(i);
//		}
		
		//original.forEach(a -> System.out.println(a));
		
		//si filtramos a los elementos con genero masculino
		//con un ciclo convencional o un for each
		System.out.println("");
		System.out.println("       ::::::Lista filtrada::::::");
		for(Persona i:original) {
			if(i.getGenero().equals("MASCULINO")){
				filtrada.add(i);
			System.out.println(i);
			}
		}
		
		//filtrar con el api stream paa objeto con genero femenino
		System.out.println("");
		System.out.println("       ::::::Lista filtrada con API Stream::::::");

//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(a -> System.out.println(a));
//		//filtrada.forEach(System.out::println);
		
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		filtrada.forEach(System.out::println);
		
		System.out.println("conteo de mis objetos");
		long conteo = original.stream().count();
		System.out.println(conteo);
		
		//algun elemento cumple con el match
		System.out.println("algun elemento cumple con el match");
		boolean alguno = original.stream().anyMatch(a -> a.getEdad() <30);
		
		System.out.println(alguno);
		
		//Retornal un valor a una cle opcional
		//optional es una clase que nos permite manejar valores nulos.
		//en caso de que no se encuentren
		System.out.println("Persona con menor edad usando optional .min");
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
	}

}
