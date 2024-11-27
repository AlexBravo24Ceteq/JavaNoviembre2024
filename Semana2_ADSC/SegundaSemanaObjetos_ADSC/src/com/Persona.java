package com;

public class Persona {

	//ABSTRACCIÓN - Pilar de la POO 
	//Capacidad de disminuid la complejidad de un objeto
	//aquí en programación. Tener la idea de que queremos modelar un objeto
	//en sí y qué vamos a necesitar de él
	
	//Atributos - Características que conforman a mi objeto
	//Para proteger la información de asignaciones no autorizadas a éstos valores,
	//debemos protegerlos o encapsularlos:
	//ENCAPSULAMIENTO - Proteger la información de acceso no autorizado y
	//se logra con modificadores de acceso. Estos pueden ser: private, protected, public, default
	
	//Ej. Para los atributos casi siempre se prefiere que estos sean privados
	//Estos los hará modificables únicamente desde esta misma clase
	private String nombre;
	private int edad;
	private String genero;
	
	//Necesitamos Métodos que me permitan crear mis objetos y podemos
	//encontrar los siguientes
	
	//Método constructor vacío
	//Me permite crear un objeto pero sin necesidad de darle valor a sus atributos
	//Ej. Crear una Persona niño = new Persona();
	
	public Persona() {
		
	}
	
	
	//Después del constructor vacío, Constructor con todos los atributos: click derecho => Source =>  Generate Constructor Using Fields
	//Este es el método constructor con todos sus atributosy permite crear objetos desde un inicio a a TODOS los atributos de mis objetos.
	
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	//Podemos tener contructores con las combinaciones que necesitemos
	//Ej. Constructor para crear una persona sólo con nombre;
	//Regularmente, sólo son necesarios por lo menos el constructor vacío
	//y el de todos los parámetros, pero si necesitamos más, los podemos tener
	
	//Posteriormente yo puedo asignar a mis objetos vacíos valores de la fomra correcta
	//con los métodos: getter y setters.
	
	//Los métodos GET, me van a permitir recuperar el valor guardado del atributo
	//Los métodos SET, me permiten asignarle un valor a un atributo determinado (atributos privados)
	
	//click derecho => Source =>  Generate Getters and Setters
	
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


	//click derecho => Source =>  Generate toString()...
	//Método toString - me va a permitir visualizar el valor de los atributos
	//en formato String de mi objeto y poder visualizarlos en consola
	//Funciona como una "radiografía de mi objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
		
	
	
	
}
