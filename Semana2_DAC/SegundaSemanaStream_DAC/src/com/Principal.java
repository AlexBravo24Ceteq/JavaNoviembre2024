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
		// API - Stream es una funcionalidad a partir de ava 8 que nos va a permitit gestionar de una forma mas rapida e 
		//imperativa la informacion que tengamos en nuestras colecciones de datos
		//Las colecciones se vuelven de flijo de datos a partir del cual podamos solicitar la informacion requerida
		
		
		//Ejemplo de el uso de Stream
		Stream< String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
				// nota recuerda rectificar los datos al guardar ya que cada dato es independiente.
				
				.filter(item -> item.contains("i"));
				
		//System.out.println(nombres); se debe llevar el dato filtrado a una variable que sea capas de imprimirse es como pezcar y para comer el pescado hay que cocinarlo primero
		// Ua vez filtramos la info la llevo hacia una lista
		List<String>names= nombres.collect(Collectors.toList());
		
		// mostrar los resultados en consola
		//System.out.println(names);
		
		
		// lISTA para guardar a nuestros objetos persona
		
		List <Persona> original = new ArrayList<Persona>();
		
		// Creamos una lista para recolectar la info filtrada
		
		List<Persona>filtrada = new ArrayList <Persona>();
		
		//Añadir elementos a mi lista original
		
		original.add(new Persona("JORGE", "MASCULINO", 37));
		original.add(new Persona("ALICIA", "FEMENINO", 25));
		original.add(new Persona("CESAR", "MASCULINO", 27));
		original.add(new Persona("MAURICIO", "MASCULINO", 30));
		original.add(new Persona("GUADALUPE", "FEMENINO", 25));
		original.add(new Persona("LUCINA", "FEMENINO", 26));
		original.add(new Persona("RAUL", "MASCULINO", 27));
		original.add(new Persona("SERGIO", "MASCULINO", 38));
		original.add(new Persona("GABRIELA", "FEMENINO", 22));
		original.add(new Persona("RAFAEL", "MASCULINO", 24));

		//Imprimir lista original
//		System.out.println(original);
		
		// recorrer la lista para vevr cada elemento con un ciclo for
		
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		}

		//Recuperar todos los elementos con el ciclo forEach
//		for(Persona i:original) {
//			System.out.println(i);
//		}
//		
		//forEach pero ahora a travez de la lista
//		original.forEach(a-> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino con un ciclo convencional:
		
//		for (Persona i : original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				
//				System.out.println(i);
//			}
//		}
//		
		
		//Filtrar con las personas del genero FEMENINO
		
		filtrada=original.stream()											//ESTE DESMADRE ES EN UNA SOLA LINEA
				.filter(item -> item.getGenero().equals("FEMENINO"))		//FILTRA LOS ITEMS QUE CONTENGAN FEMENINO
				.collect(Collectors.toList());								//Y LOS METE A LA LISTA
				
		//filtrada.forEach(a-> System.out.println(a));						// ESTA ES UNA FORMA DE IMPRIMIR CON LA EXPRECION LAMBDA
		
		//filtrada.forEach(System.out::println);								// ESTA ES OTRA FORMA DE IMPRIMIR
		
		
		//ORDENAR A LAS PERSONAS POR EDAD ASCENDENTE
//		filtrada =original.stream().sorted(Comparator.comparing(Persona::getEdad))	//ESTE DESMADRE ES EN UNA SOLA LINEA
//				.collect(Collectors.toList());										//
//		
//		filtrada.forEach(System.out::println);

		//Contar el numero de elementos de la lista
		
		
//		System.out.println(original.stream().count());			//Esto es lo mismo que
//	
//		
//		long conteo = original.stream().count();				//ESTO
//		System.out.println(conteo);
		
		//SOLICITAR ALGUNA AVRIABLE BOOLEAN SI ALGUN ELEMENTO OTODOS CUMPLEN ALGUNA CONDICION
		
//		boolean alguno = original.stream().anyMatch(a-> a.getEdad()<30);
//		
//		//COMO LA CONDICION ES CORRECTA DEBERIA ARROJAR UN VALOR TRUE
//		
//		System.out.println(alguno);
		
//		boolean alguno = original.stream().allMatch(a-> a.getEdad()<30);
//		
////		//COMO LA CONDICION ES INCORRECTA DEBERIA ARROJAR UN VALOR FALSE
//		
//		System.out.println(alguno);
//		
		
		//OPTIONAL ES UNA CLASE QUE NOS PERMITE MANEJAR VALORES NULOS,
		//EN CASO DE QUE NO SE ENCUENTREN
		
		Optional<Persona> menorEdad =original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
	}

}
