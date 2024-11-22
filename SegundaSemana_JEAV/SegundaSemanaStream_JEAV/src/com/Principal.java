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
		
		Stream<String> nombres = Stream.of("Calos", "Omar", "Juan", "Frida")
				.filter(item -> item.contains("i"));
		
		//System.out.println(nombres);

		
		List<String> names = nombres.collect(Collectors.toList());
		
		//System.out.println(names);
		
		List<Persona> original = new ArrayList<Persona>();
		
		List<Persona> filtrada = new ArrayList<Persona>();
		
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Carlos", "MASCULINO", 17));
		original.add(new Persona("Omar", "MASCULINO", 27));
		original.add(new Persona("Alan", "MASCULINO", 57));
		original.add(new Persona("Ana", "FEMENINO", 7));
		original.add(new Persona("Sack", "MASCULINO", 15));
		original.add(new Persona("Noe", "MASCULINO", 22));
		original.add(new Persona("Juan", "MASCULINO", 62));
		original.add(new Persona("Tomas", "MASCULINO", 25));
		original.add(new Persona("Joel", "MASCULINO", 29));
		
		//System.out.println(original);
		
		/*
		for(int i = 0; i<original.size(); i++) {
			System.out.println(original.get(i));
		}
		*/
		
		//original.forEach(a -> System.out.println(a));

		/*for(Persona i: original) {
			if(i.getGenero().equals("MASCULINO")){
				filtrada.add(i);
				System.out.println(i);
			}
		}*/
		
		//filtrada = original.stream().filter(item  -> item.getGenero().equals("FEMENINO")).collect(Collectors.toList());
		//filtrada.forEach(a -> System.out.print(a));
		
		//filtrada.forEach(System.out::println);
		
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		//filtrada.forEach(System.out::println);
		
		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		
		System.out.print(menorEdad);
	
	}
	

}
