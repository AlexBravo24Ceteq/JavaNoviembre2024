package com;

public abstract class Persona {
	
	private String nombre,genero; 
	private int edad;
	
	public Persona() {}
	
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	//Metodos propios
	//Funciones o comportamientos
	
	//Ejemplo una accion que una persona puede realizar comer()
	
	public void comer() {
		
		System.out.println("Hola soy "+nombre+" estoy comiendo");
	}
	//MEtodo que retorna
	
	public String saludar() {
		String saludo = "Hola";
		return saludo;
	}
	
	public void comer(String comida) {
		System.out.println("Estoy comiendo "+comida);
	}
	public void comer(String comida, String bebida) {
		System.out.println("Estoy comiendo "+comida+" y bebiendo "+bebida);
	}
	
	//Metodos Abstractos que son aquellos que nos dicen "que se va hacer" pero no el "como", son metodos sin cuerpo 
	//Estos metodos que no va a ser definidos por esta clase (clase padre)
	//tendran que ser definidos por las clases hijas(empleado)
	
	public abstract void sumar(int a, int b);
	
}
