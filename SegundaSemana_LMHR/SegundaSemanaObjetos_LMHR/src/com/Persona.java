package com;

public class Persona {

	//ABSTRACCION - PILAR DE LA POO
	//capacidad de disminuir la complejidad de un objeto
	//tener la idea de que quermos modelar de un objeto y que vamos a necesitar
	// de el.
	
	//ATRIBUTOS - Caracteristicas que podrian conformar a mi objeto
	// Pra proteger la informacion de asignaciones no autorizadas a estos
	//valores, debemos protegerlos o encapsularlos
	//ENCAPSULAMIENTO - proteger la info de acceso no autorizado
	//y se logra con modificadoress de acceso
	//estos pueden ser private, protected, public, deafult
	
	//ej. los atributos casi siempre se prefiere que estos sean privados
	//esto hara moodificables unicamente desde esta misma clase
	
	private String nombre;
	private int edad;
	private String genero;
	
	
//	String nombre;
//	int edad;
//	String genero;
	
	//neceistamos metodos que me permitan crear mis objetos y podemos 
	//encontrar los sogueintes
	
	//Metodo CONSTRUCTOR VACIO
	//me permite crear un objrto, pero  sin necesidad de darle valor a sus atributos
	// ej. crear una persona nino= new persona ();
	
	public Persona ( ){
		
	}

  //Metodo Contructor con todos los parametros
	//me permite crear objetos, asignandole valores desde un inico a TODOS 
	// los atributos 

	
public Persona(String nombre, int edad, String genero) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.genero = genero;
}
//Podemos tener cosntructores con las combinaciones que necesitemos
//ej. crear constructorr para una persona solo con nombre
// regularmente solo son nescesarios el constructor vacio
// y el de todos los parametros, pero si necesitamos mas los podemos tener 

public Persona(String nombre) {
	super();
	this.nombre = nombre;
}
//posteriormente yo puedo asgnar a mis objetos acios valores de la froma correcta 
//con los sig metodos: GETTERS Y SETTERS

//Los metodos GET, me van a permitir recuperar el valor guardaddo del aributo
//Los metodos SET, me van a permitir asignarle un valor a un atributo determinaodo
// (atributos privados)


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

//metodo toString () me va a permitir poder visualizar el valor de los atributos 
//en formato Strng de mi objeto y poder asi visualizralos en consola
// funciona como una "radiografia" dr mi objeto
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
}
	


	
}
