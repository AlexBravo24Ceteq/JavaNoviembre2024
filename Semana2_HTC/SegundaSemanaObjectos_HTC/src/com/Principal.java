package com;

public class Principal {

	public static void main(String[] args) {
		// En P O O solo debe existir una clase con el método main para ejecutar todo el proyecto.

		//Usaré el constructor de la clase Persona aquí
		
		Persona juan = new Persona(); // Clase objeto/instancia de clase = new Clase();
		//construido pero nada definido.
		
		//la forma incorrecta de asignar valores
		//juan.nombre = "Juancho"; // Si se hace pero es incorrecto porque puede ser sobre escrito.No deberíamos de poder modificarlo.
		//bloqueé lo anterior haciendolo private.
		
		//Vamos a crear una nueva persona pero con el constructor y todos los parametros.
		
		Persona fido = new Persona("Firulais", 10, "Perro"); // Nueva persona creada, con todos sus atributos.
		
		// Vamos a probar el método GET para recuperar el nombre de fido e imprimirlo
		
		System.out.println(fido.getNombre());
		
		//Probando SET.
		
		juan.setNombre("Juancho");
		System.out.println(juan.getNombre());
		System.out.println(juan.getGenero());
		
		//System.out.println(fido.toString()); //funciona igual, huh
		//System.out.println(juan.toString());
		System.out.println(fido);
		System.out.println(juan);
		
		Cat lily = new Cat("Common Mexican","Good","Overweight","Calm");
		Cat merlina = new Cat();
		merlina.setAppearance("Calico");
		merlina.setGrooming("Good");
		merlina.setHealth("Slightly underweight.");
		merlina.setTemperament("Aggresive");
		
		System.out.println("Lily" + lily);
		System.out.println("Merlina" + merlina);
		
		Song lithonia = new Song("Lithonia","Bando Stone and The New World","Childish Gambino",2024);
		Song doYouMind = new Song();

		doYouMind.setAlbum("Woman on the Internet");
		doYouMind.setAuthor("Orla Gartland");
		doYouMind.setReleaseDate(2021);
		doYouMind.setTitle("Do you mind?");
		
		System.out.println(lithonia);
		System.out.println(doYouMind);
		
		Player zaina = new Player ("Zaina","Elandrin","Cleric",5,true);
		Player belladona = new Player();
		
		belladona.setName("Belladone Richie");
		belladona.setSpecies("Elf");
		belladona.setProfession("Warlock");
		belladona.setLevel(5);
		belladona.setClaimed(false);
		
		System.out.println(zaina);
		System.out.println(belladona);
	}

}
