package com;

public class Persona {
//Abstraccion capacidad de disminuit la complejidd de un objeto
	//pilar de la poo
	
	//Atributos- caracteristicas quepuede tener mi objeto
	
	//estos valores los podemo proteger o encapsular
	//esto se logrq con modificdores de acseso
	//private, public, default
	
	//ejemplo para los atributos se pretende que sean privados
	//eto solo permitira modificarlos desde la clase
	
	private String nombre;
	private int edad;
	private String genero;
	
	//necesitamos metodos que no permitan crear mis objetos y podemos encontrar lo siguiente
	//metodo constructor vacio
	//permite crear un metodo sin dar valores a sus tributos
	
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

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	//metodo tostring me permite visualisar el valor de los atributos en formato tring de mis objetos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
}
