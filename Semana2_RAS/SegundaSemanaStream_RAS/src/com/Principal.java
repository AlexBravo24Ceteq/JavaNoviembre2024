package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* API Stream es una funcionalidad a partir de java 8
		 * que nos va a permitir gestionar de una forma mas rapida
		 * e imperativa la infomacion que tengamos en nuestras colecciones de 
		 * datos
		 * Las colecciones se vuelven un flujo de datos a partir 
		 * del cual podemos solicitar la infomacion que necesitamos
		 *  
		 */
		
		/*
		 * Ejemplo de el uso de Stream
		 */
		
		Stream<String> nombres = Stream.of("Carlos","Frida","Alex", "Alberto").distinct()
				.filter(item-> item.contains("i"));
		
		//una vez filtramos la infomacion la llevo a una Lista
		
		List<String> names = nombres.collect(Collectors.toList());
		
		//Mostrar resultados en consola 
		//System.out.println(names);
		
		//Declaramos una lista para guardar nuestros objetos Persona
		
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la infomacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a mi lista original
		Persona p1 = new Persona("Jorge", "MASCULINO", 37);
		
		original.add(p1);
		original.add(new Persona("Alicia","FEMENINO",25));
		original.add(new Persona("Cesar","MASCULINO",27));
		original.add(new Persona("Mauricio","MASCULINO",30));
		original.add(new Persona("Guadalupe","FEMENINO",25));
		original.add(new Persona("Lucia","FEMENINO",26));
		original.add(new Persona("Raul","MASCULINO",27));
		original.add(new Persona("Sergio","MASCULINO",38));
		original.add(new Persona("Gabriela","FEMENINO",22));
		original.add(new Persona("Rafael","MASCULINO",24));
		
		
		//iMPRIMIR LISTA ORIGINAL EN CONSOLA
		//System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elmento 
		//con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		}
		
		//Recuperar los elementos con el ciclo forEach
		
//		for(Persona i: original) {
//			System.out.println(i);
//		}
		
		
		//imprimir el mismo ciclo FOrEach pero ahora a travez de nuestra lista
		//original.forEach(a->System.out.println(a));
		
		/*
		 * si Filtraramos a los elementos del genero masculino
		 * con un ciclo convencional
		 * 
		 */
//		for(Persona i: original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				System.out.println(i);
//				filtrada.add(i);
//			}
//		}
		
		//Filtrar con API Stream a las personas del genero femenino
		
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		//filtrada.forEach(a->System.out.println(a));
//		filtrada.forEach(System.out::println);
		
		//ordenar a las persona por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);
		
		//Contaer el numero de elementos de mi losta 
	
		//System.out.println(	original.stream().count());
		
		
		//Solicitar una variable Booleana si uan elemento o todos cumplen alguna condicion
		
//		boolean alguno = original.stream().allMatch(a->a.getEdad()<30);
//		
//		System.out.println(alguno);
		
		
		//Retornar un valor a una clase Optionla
		//La clase optional es una clase que nos permite manejar valores nulos
		//en caso de que no se encuentren
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
	}

}
