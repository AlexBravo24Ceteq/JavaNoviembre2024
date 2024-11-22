package com;

public class Persona {
	//ABSTR. Capacidad de disminuir la complejidad de un objeto
	//ATRIBUTOS. Características dle objeto
	String nombre;
	int edad;
	String genero;
	
	//Se necesutan metodos para crear objetos y podemos encontrar los siguientes
	//primero vacio, luego constructores, luego getters y setters y luego toString
	public Persona() {
		
	}
	

	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
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


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	

}
