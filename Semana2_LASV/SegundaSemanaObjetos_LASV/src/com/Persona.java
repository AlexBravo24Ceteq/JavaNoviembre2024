package com;

public class Persona {
	
	//ABSTRACCION - Pilar de la POO
	//capacidad de disminuir lla complegidad de un objeto
	//aqui en programacion. Tener la idea de que queremos modelar de un objeto
	//en si yy que vamos a necesitar de el

	
	//ATRIBUTOS - caracteristicas que podrian conformar a mi objeto
	//para proteger la informacion de asignaciones no autorizada a estos valores
	//debemos protegerlos o ENCAPSILARLOS
	//ENCAPSULAMIENTO- proteger la info de acceso no autroizado
	//y se logra con modificadores de acceso, estps pueden ser, private, protected, publick defauld
	
	//ej para los atrivutos casi siempre prefiere que estos sean privamos
	//estos los hara modificables unicamente desde esta misma clase
	
	private String nombre;
	private int edad;
	private String genero;
	
	//Necesitamos metodos que me permitan crear mis objetos y podemos encontrar los sig.
	
	//Metodo constructor vacio
	//Me permite crear un objeto, pero sin necesidad de darle valor a sus atributos
	// Ej. crear una Persona niño = new Persona();
	
	
	public Persona() {
		
		
	}

	// Metodo Constructor con todos los parametros
	// Me permite crear objetos, asignandole valores desde un inicio a TODOS los atributos de mis objetos
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	
	//Podemos tener constructores con las combinaciones que necesitemos
	//EJ. constructor para crear una persona solo con nombre
	//Regularmente, solo son necesarrios por lo menos el contrusctor vacio y el de todos los parametros,
	//pero sii necesitamos mas los podemos tener
	
	
	//posteriormente yo pouedo asignar a mis objetos vacios valores de la forma correcta con los sig metodos
		//GETTERS y SETTERS
		
	//Los metodos GET, me vana permitir recuperar el valor guardado del atributo
	//Los metodos SET, me van a permitir asignarle un valor a un atributo determinado (atributos privamos)
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

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
	
	//Metodo toString() - me va permitir ver el valor de los atributos en forma de String en mi objeto y poder
	//asi vosializarlos en consola

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	
}
