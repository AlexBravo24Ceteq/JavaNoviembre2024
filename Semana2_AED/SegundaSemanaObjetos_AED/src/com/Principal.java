package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la programacion orientada a objetos olo existe una clase com 
		// el meto main se encargara de ejecutar todo el proyecto 

		// vamos a comenzar a crear a nuestros objetos provenientes de la clase
		// Persona
		
		//Ej. crear a una persona vacia, gracias al cosntructor vacio
		
		Persona juan = new Persona();
		
		// mi variable u objeto juan aun no tiene asignados los valores de 
		// su nombre, edad o genero. vamos a ver la forma correcta de asignar
		// estos valores 
		
		//juan.nombre = "Juan Alberto"; // aqui estamos asignando facilmente 
		// un nombre a el objeto juan, pero no deberiamos de ser capaces 
		// de poder modificar este valor asi de sencillo
		
		//ya no le podemos asignar nada a nuestros objetos
		//juan.
		
		// vamos a crear una nueva persona pero con el constructor
		// con todos los parametros
		Persona fito = new Persona("Rodolfo", 30, "Masculino");
		
		// Vamos a probar el metodo Get para recuperar el nombre del objeto fito
		// y mandarlo a imprimir en consola 
		
		System.out.println(fito.getNombre());
		
		// Probando asignar un nombre a mi objeto Juan con el metodo set
		juan.setNombre("Juan Alberto");
		
		System.out.println(juan.getNombre());
		
		//intenta mandar todas los valores de mi objeto 
		
		System.out.println(fito);
		System.out.println(juan);
		
		// Ej. Creando dos objetos de mi clase Taco
		
		Taco conTodo = new Taco("Asada", 2, true, true, "Verde");
		
		Taco vacio = new Taco();
		
		vacio.setIngredienteprincipal("Chorizo");
		vacio.setSalsa("Roja");
		vacio.setCilantro(true);
		
		System.out.println(conTodo);
		System.out.println(vacio);
		
		//Van a crear 3 clases para modelar 3 diferentes objetos. Los que ustedes gusten
				//Sus objetos a crear deben tener minimo 3 atributos, maximo los que ustedes quieran
				//Crean constructores, getters, setters, toString
				//Y van a crear de cada clase un objeto con todas las caracteristicas en esta clase 
				//principal y uno vacio al que posteriormente le agregaran valor a algun atributo
				//y los mandan a imprimir en consola. En esta clase y este mismo proyecto
		
		// Ejemplo 1 
		Balones balondeBasquet = new Balones("Basquetbol", "Nike", 12);
		Balones balonEconomico = new Balones();		
		balonEconomico.setDeporte("Futbol");
		balonEconomico.setMarca(null);
		balonEconomico.setTamaño(9);	
		System.out.println(balondeBasquet);
		System.out.println(balonEconomico);		
		// Ejemplo 2
		Zapatos botas = new Zapatos(28, "Cafe", "Jeep", false);
		Zapatos tenis = new Zapatos();
		tenis.setTamaño(26);
		tenis.setColor("Azul");
		tenis.setMarca("Puma");
		tenis.setIncluyecalzador(true);	
		System.out.println(botas);
		System.out.println(tenis);	
		// Ejemplo 3
		Desodorante Estefano = new Desodorante("Estefano", true, false, "Aerosol", 159);
		Desodorante lady_speed = new Desodorante();
		lady_speed.setMarca("Lady Speed Stick");
		lady_speed.setParahombre(false);
		lady_speed.setParamujer(true);
		lady_speed.setPresentacion("Barra");
		lady_speed.setCantcontenido(49);	
		System.out.println(Estefano);
		System.out.println(lady_speed);
	
	}

}
