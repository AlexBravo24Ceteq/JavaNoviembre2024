package com;

public class Persona {
	
	// ABSTRACCION - capacidad de disminuir la complejidad de un objeto 
	// aqui en progamacion. tenemos tenemos la idea de que queremos modelar
	// de un objeto en si y que vamos a nesecitar de el.
	
	
	//ATRIBUTOS - caracteristicas que podria conforma mi objeto
	// para proteger la informacion de asignacion no autorizada a estos
	// valores, debemos protegerlos o ENCAPSULARLOS
	
	// ENCAPSULAMIENTO - proteger la informacion de acceso no autiorizado
	// y se logra con modificacores de acceso
	// Estos pueden ser private, protected, public, default
	
	// Ej. para los atributos casi siempre se prefiere que sean privados
	// esto los hara modificables unicamente desde esta misma clase 
	
	private String nombre;
	private int edad;
	private String genero;
	
	// Nesecitamos metodos que nos permitan crear mi9s objetos y podemos encontrar los siguientes
	
	// Metodo constructor vacio
	// Me permite crear un objeto pero sin nesecidad de darle vaqlor 
	// a sus atributos. ej. crear una persona niño = new persona();
	
	public Persona() {
		
	}

	// Metodo constructor con todos los parametros
	// permite crear objetos asignandole valores desde un inicio a mis objetos
	// a todos los atributos de mis objetos
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	// Podemos tener constructores con las combinaciones que nesecitemos
	// Constructor para crear una persona solo con nombre
	// Regularmente, solo son necesarios por lo menos el constructor vacio
	// y el de todos los parametros, pero si necesitamos mas los podemos tener
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	// posteriormente yo puedo asignar a mis objetos vacios valores de la forma correcta 
	// con metodos : GETTERS Y SETTERS
	
	// Los metodos GET, permiten recuperar el valor guardado del atributo
	// Los metodos SET me van a permitir asignarle un valor a un metodo determinado 
	//(atributos privados)
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	//Metodo toString() - me va a permitir poder visualizar el valor de los atributos
	// en forma de strig de mi objeto y poder adi visualizarlos en consola 
	// Funciona como una "radiografia de mi objeto"
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
   
	
	
	

}
