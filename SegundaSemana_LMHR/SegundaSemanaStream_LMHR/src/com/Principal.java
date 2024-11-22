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
		
		//API Stream - funcionalidad a prtir de java8
		//que nos va a apermitir gestionar de una forma mas
		//rapida e imperativa la infprmacion que tengamos en nuestras 
		//colecciones de datos, las colecciones se vuelven un flujo de datos
		//a partir del cual podemos solicitar la informacion qque necesitemos

		//Ejemplo del uso de Stream
		Stream <String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
				.filter(item -> item.contains("i"));
		
		//Una vez filtramos la informacion la llevo hacia una lista
		List <String> names = nombres.collect(Collectors.toList());
		
		//MOSTRAR LOS RESULTADOS EN CONSOLA
		System.out.println(names);
		
		
		//Lista para guardar nuestros objetos Persona
		List<Persona> original = new ArrayList<>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Anadir eleemntos a mi lista original
		original.add(new Persona("Leslie", "Masculino", 23));
		original.add(new Persona("Alicia", "Femenino ", 25));
		original.add(new Persona("Cesar", "Masculino", 26));
		original.add(new Persona("Mauricio", "Masculino", 28));
		original.add(new Persona("Guadalupe", "Femenino", 27));
		original.add(new Persona("Luciana", "Femenino", 27));
		original.add(new Persona("raul", "Masculino", 30));
		original.add(new Persona("Sergio", "Masculino", 37));
		original.add(new Persona("Gabriela", "Femenino", 33));
		original.add(new Persona("Rafael", "Masculino", 21));
		
		//Imprimir la lista original en consola
		
		System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento
		
////		for (int i = 0; i < original.size(); i++) {
////			System.out.println(original.get(i));	
//		}
		
		//tambien se puede Recuperar todos los eleentos con el ciclo for each
//		
////		for(Persona i: original) {
////			System.out.println(i);
//		}
		
		//Tambien se puede imprimir el ciclo for each a traves de nuestra lista 
		//original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino cn un ciclo convencional 
		//for each
		for (Persona i:original) {
			if (i.getGenero().equals("Masculino")) {
				filtrada.add(i); //filtrar cada elemmento siepre y cuando su genero sea masculino
				System.out.println(i); //una vez que tengo todos los elementos en la lista filtrada se mandan a imprrimir
			}
		}
		
		//Filtrar cn el API Stream a las personas del genero femenino 
		filtrada = original.stream() //los elementos de la lista original los convierto en un stream
				.filter(item -> item.getGenero().equals("Femenino"))
				.collect(Collectors.toList());
		filtrada.forEach(a -> System.out.println(a));
		
		//Otra formaa de solicitarlo con lambda podria ser mediante
		//filtrada.forEach(System.out::println);
		
		
		//Ordenar  las personas por edad ascendente
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		//mandar a imprimir
		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos de la lista
		System.out.println(original.stream ().count());
		
		//Solicitar una variable booleana si los elemntos cumplen una condicion
		
		boolean alguno= original.stream ().anyMatch(a-> a.getEdad()<30);
		System.out.println(alguno);
		
		//otra forma es con el metodo all match para saber si todos son <30
		
		//RETORNAR  un valor a una clase Optional
		//que es una clase que nos permite manejar valores nulos
		//en caso de que no se encuentren
		
		Optional<Persona>menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	
	}

}
