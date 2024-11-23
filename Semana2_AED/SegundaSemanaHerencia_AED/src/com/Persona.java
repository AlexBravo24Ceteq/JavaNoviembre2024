package com;

public abstract class Persona {

	private String nombre;
	private int edad;
	private String genero;
	
	public Persona() {}

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
	
	// METODOS PROPPIOS
	// FUNCIONES O COMPORTAMIENTOS
	
	//Acciones que pueden ejecutar nuestros objetos
	
	// Ej. una accion que una persona puede realizar ... comer()
	// Ej. Metodo sin retorno void ejecutan algo, pero no deben devolver el valor
	// de un tipo 
	
	public void comer(String comida) {
		// aqui va declarado lo que el metodo va a ejecutar
		// Esto va ejecutar este metodo cuandfo lo llamemos por medio
		// de un objeto personal 
		
		System.out.println("Hola soy "+ nombre + " Estoy comiendo "+ comida +" Buen provecho");
	}
	
	// Metodos con retorno. Declaran el tipo de dato que deben devolver antes del metodo
	
	public String saludar (String horario) {		
		
		String saludo = "Hola soy " + nombre + " Buenas " + horario;
		// Si quiero que aparte de devolver el valor imprima en cosnola puedo hacerlo 
		System.out.println(saludo);
		return saludo;
	}
	
	// Ej. de metodo polimorfico
	// aqui ene ste no pedimos ningun parametro
	public void comer() {
		System.out.println("Estoy comiendo...");
	}
	
	// Ej. de metodo polimorfico con mas parametros
	public void comer(String comida, int reciones) {
		System.out.println("Estoy comiendo " + reciones + "raciones de "+ comida );
		
	}
	
	// metodos abstractos
	// son aquellos que nos dicen que se va a hacer pero no como se va a hacer es decir 
	// son metodos sin cuerpo
	// estos metodos que no van a ser definidos por esta clase que es una clase padre
	
	public abstract void sumar (int a, int b);
	
}
