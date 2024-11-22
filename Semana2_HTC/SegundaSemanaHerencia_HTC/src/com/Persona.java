package com;

public abstract class Persona { //se volvió abstracto por culpa de un método abstracto.

	private String name;
	private int edad;
	private String genero;
	
	public Persona() {}
	
	public Persona(String name, int edad, String genero) {
		super();
		this.name = name;
		this.edad = edad;
		this.genero = genero;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Persona [name=" + name + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	//Métodos propios
	//Funciones o comportamientos.
	//Acciones a ejecutar

	//Método sin retorno (void) - ejecutan algo pero no regesan un valor
	//Aqui hace algo y pide algo, sin volverse nada
	public void comer(String comida) {
		System.out.println("Toy comiendo " +comida + "." );
	}
	
	// Aquí un método que si regresa algo."saludo" guarda un string.
	public String saludar (String horario) {
		String saludo= "Hola me llamo " + name + ". Son las " + horario;
		return saludo;
	}
	
	public void comer() {
		System.out.println("Toy comiendo...");
	}
	
	public void comer(String comida, int raciones) {
		System.out.println("Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	// Métodos abstractos. Dicen que se va a hacer pero no como se va a hacer. Métodos sin cuerpo. Whatever that means.
	// Estos métodos no son definidos por el PADRE, pero serán definidos por los HIJOS
	public abstract void sumar(int a , int b);
}
