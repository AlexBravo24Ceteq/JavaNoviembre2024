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
		
		//API Stream es una funcion apartir de java 8 que nos va a permitir gestionar de una fomra mas rapida e 
		//imperativa la informacion que tengamos las colecciones de datos, las colecciones se vuelven un flujo
		//de datos apartir del cual podemos solicitarla informacion que necesitemos
		
		//ejemplo de el uso de Stream
		
		Stream<String> nombres = Stream.of("Carlos", "Alex", "Frida", "Alberto")
				.filter(item -> item.contains("i"));
		List<String> names = nombres.collect(Collectors.toList());
		System.out.println(names);
	
	//declaramos una lista para nuestros objetos persona
		
		List<Persona> original = new ArrayList<Persona>();
		
	//creamos  lista para recolectar la informacion filtrada
		List<Persona> filtrada  = new ArrayList<Persona>();
		
		original.add(new Persona("JORGE", "MASCULINO", 37));
		original.add(new Persona("ALICIA", "FEMENINO", 25));
		original.add(new Persona("ALBERTO", "MASCULINO", 30));
		original.add(new Persona("Alejandra", "FEMENINO", 29));
		original.add(new Persona("MARIO", "MASCULINO", 33));
		original.add(new Persona("DANIEL", "MASCULINO", 25));
		original.add(new Persona("MARIBEL", "FEMENINO", 22));
		original.add(new Persona("FERNANDA", "FEMENINO", 27));
		original.add(new Persona("LUIS", "MASCULINO", 31));
		original.add(new Persona("ALFREDO", "MASCULINO", 35));
		
		//IMPRIMIR LISTA  ORIGINAL EN CONSOLA
		
		System.out.println(original);
//		
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		}
//		
		//recuperar elementos con forEach
//		for (Persona i : original) {
//			System.out.println(i);
//			
//		}
		
		//forEach pero ahora atra vez  de nuestra lista
		//original.forEach(a -> System.out.println(a));
	
		// si filtraramos  los elementos del genero masculino  con un ciclo convencional
		
//		for(Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		//filtrar con el API Stream a las personas
		
		filtrada = original.stream()
				.filter(item -> item.getGenero().equals("FEMENINO"))
				.collect(Collectors.toList());
		
		filtrada.forEach(a -> System.out.println(a));
		filtrada.forEach(System.out::println);
		
		//ordenar  a las personas  por edad ascendente
		
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
		//contar el numero de elementos de mi lista
		
		System.out.println(original.stream().count());
		
		//solicitar una variable boolean si alguno de los elementos o todos los elementos cumplen con una condicion
		
		boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
		System.out.println(alguno);
		
		//vamos a retornar un valor a una clase optional
		//optional es una clase que nos permite manejar  valores nulos en caso de que no se encuentre
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
	}

}
