package com;

public class Persona {
	
	//ABSTRACCION - Es un Pilar de la POO 
	   				//- Capacidad de disminuir la complegidad de un objeto 
					// aqui en programacion 
	
	/*
	 * ATRIBUTOS - Caracteristicas que podrian conformar a mi onjeto 
	 * 
	 */
	
	
	//Los atibutos casi siempre se requeiren ser privados 
	//Esto los hara modificables solo desde desde su misma clase 
	
	private String nombre, genero; 
	private int edad;
	
	//Para proteger la infomacion de asignacon no autorizada 
	
	// Necesitamos metodos que nos permitan crear objetos
	// y podemos encontrar los siguinetes 
	
	//Metodo constructor vacio que me permite crear un onjeto pero sin necesidad de darle valor a sus atributos 
	//Ejemplo crear una persona niño
	
	public Persona() {
		
	}
	//MEtodo contructor con todos los parametros 
	//Me permiste crear objetos 
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}
	//Podemos generar contructores con las combinaciones que necesitemos 
	//Contructor para crear una persona solo con nombre
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	
	}
	
	//Los metodos get me permiten obtener el valor de mis atributos
	public String getNombre() {
		return nombre;
	}
	//Los metodos set me permiten asiganrles un valor a mis variables aunque sea privado
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Me permite visualizar el valor de los atributos 
	//en fomato string y poder verlos en consola
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	

}
