package com;

public class Persona {
	
	//ABSTRACCION - Pilar de la POO
	//Capacidad de disminuir la complejidad de un objeto 
	//aquí en programación. Tener la idea de lo que queremos moderlar de un objeto
	//en sí y qué vamos a necesitar de él.
	
	//ATRIBUTOS - características que podrían conformar a mi objeto
	//Para proteger la información de asignaciones no autorizadas a estos
	//valores, debemos protegerlos o encapsularlos
	//ENCAPSULAMIENTO - proteger la info de acceso no autorizado
	//y se logra con modificadores de acceso
	//Estos pueden ser private, protected, public, default
	
	
	//Ej. para los atributos casi siempre se prefiere que estos sean privados
	//Esto los hará modificables únicamente desde esta misma clase
	
	String nombre;
	int edad;
	String genero;
	
	//Necesitamos métodos que me permitan crear mis objetos y podemos
	//encontrar los siguientes
	
	//Método constructor vacío
	//Me permite crear un objeto, pero sin necesidad de darle valor a sus atributos
	//Ej. crear a una Persona niño=new Persona();
	
	public Persona () {
		
		
		
	}
	
	//Método constructor con todos los parámetros 
	//Me permite crear objetos, asignandole valores desde un inicio a TODOS
	//los atributos de mis objetos
	
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	//Podemos tener constructores con las combinaciones que necesitemos 
	//Ej. Constructor para crear una Persona solo con nombre
	//Regularmente, sólo son ncecesarios el constructor vacío 
	//y el de todos los parámetros, pero si necesitamos más los podemos tener
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		
		
		//Posteriormente yo puedo asignar a mis objetos vacíos valores de la forma
		//correcta con los siguientes métodos: GETTERS SETTERS
		
		
		
		//Los métodos GET, me van a permitir recuperar el valor guardado del atributo
		//Los métodos SET, me van a permitir asignarle un valor a un atributo
		//determinado (atributos privados)
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

	
	//Método toString me va a permitir visualizar el valor del objeto de los atributos 
	//en formato String de mi objeto y poder así visualizarlos en consola
	//Funciona como una radiografía de mi objeto
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}


	

}
