package com;

public abstract class Persona {
	
	private String nombre;
	private int edad;
	private String genero;
	
	public Persona ()  {}

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

	// metodos propios 
	//FUNCIONES O COMPORTAMIENTOS
	
	//Acciones que pueden ejecutar nuestros objetos
	
	//ej. una acciion que una persona pede reaizar
	//ej. etodo sin retorno- Void - ejecutan algo pero no deben devolver
	//el valor deun tipo de dato
	
	public void comer (String comida) {
		//Aqui va declarado loque el metodo va a ejecuta
		//esto va a ejecutaar este metodo cuando lo llamemos a traves de un objeo persona
		System.out.println("Hola soy "+ nombre+ "Estoy comiendo. Buen provecho");
	}
	//Metodos con retorno: Declaran el tipo de dato que deben devolver antes del nombre del metodo
	
	public String saludar (String horario) {
		
		String saludo = "Hola soy " + nombre + ".Buenas " + horario;
		
		return saludo;
		
		
	}
	//Ej. del metodo polimorfico
		//Aqui en este no pedimos ningun parametro
		public void comer () {
			System.out.println(" Estoy comiendo...");
		}
		
		//ej. del metodo polimorfico con mas parametros
		public void comer(String comida, int raciones) {
			System.out.println("Estoy comiendo" +  raciones  + "raciones de " + comida );
}
		
		//METODOS ABSTRACTOS 
		// nos dcen que se va a hacer pero no COMO se va a hacer, ed decir:
		// sin cuerpo
		//estos metodos que no van a estr definidos por esta clase (Clase padre0
		//Tendran que ser definidos por las clases hijas (empleado)
		public abstract void sumar (int a, int b);
		
		//puede tener mas metodos asbtractos
		public abstract void respirar ();
}
