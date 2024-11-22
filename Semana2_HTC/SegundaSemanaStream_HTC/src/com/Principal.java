package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream. De Java 8 para arriba.
		//Las colecciones se vuelven un flujo de datos  a partir
		//del cual podemos solicitar la información que necesitemos
		
		//Ejemplos:
		
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex","Alberto")
				.filter(item->item.contains("i"));
		
		//una vez filtramos info, la llevo a una lista
		
		List<String> names = nombres.collect(Collectors.toList());
		
		//System.out.println(names);
		 
		//listas para recolectar y filtrar
		List<Persona> original = new ArrayList<Persona>();
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a  la lista original.
		
		original.add(new Persona("Jorge","MASCULINO",37));
		original.add(new Persona("Alicia","FEMENINO",25));
		original.add(new Persona("César","MASCULINO",27));
		original.add(new Persona("Mauricio","MASCULINO",30));
		original.add(new Persona("Guadalupe","FEMENINO",25));
		original.add(new Persona("Raul","MASCULINO",37));
		original.add(new Persona("Sergio","MASCULINO",38));
		original.add(new Persona("Gabriela","FEMENINO",22));
		original.add(new Persona("Rafael","MASCULINO",24));
		
		//System.out.println(original);
		//Aqui hago un for each para imprimir, pero...
//		for(Persona i:original) {
//			System.out.println(i);
//		}
//		
		//original.forEach(a -> System.out.println(a));// Listas tienen un for each para ellas! Con un lambda para realizar la acción.
		
		//Convencionalmente podrías filtrar la info con un ciclo.
//		for (Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//			}
//		}
//		System.out.println(filtrada);
		// Y esa madre funciona. Ahora intentemos con API Stream
		filtrada = original.stream().filter(item -> item.getGenero().equals("FEMENINO")).collect(Collectors.toList());
		
		//filtrada.forEach(item -> System.out.println(item)); Normalmente así lo imprimes con lambda.
		//Pero puedes ser aún más mamón y usar
		//filtrada.forEach(System.out::println); //Que es lo mismo, manda a imprimir todo por línea.
		
		//Ordenar por edad ascendente.
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		filtrada.forEach(System.out::println); 
		
		//Contar elementos de la lista
		System.out.println(original.stream().count());
		
		//Solicitar una variable bool si algun elemento cumple con una condición.
		boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
		boolean algunos = original.stream().allMatch(a -> a.getEdad()<30);
		
		System.out.println(alguno);
		System.out.println(algunos);
		
		// Clase Optional
		// Optional es una clase que permite valores nulos, si no encuentra.
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}

}
