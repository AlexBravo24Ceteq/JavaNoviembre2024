package com;

public abstract class Persona {
	
	private String nombre;
	private int edad;
	private String genero;
	
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
	
	// Metodos propios
	//funciones o comportamientos
	
	// acciones que pueden ejecutar nuestros objetos
	//ej. una accion que una persona puede realizar  .comer()
	//ej. metodo sin retorno(void) ejecutan algo pero no deben devolver el valor de un tipo de dato
	
	public void comer(String comida) {
		//aqui va declarando lo que el metodo va a ejecutar
		//esto va a ejecutar este metodo cuando lo llamemos a travez de un objeto persona
		
		System.out.println("hola soy " + nombre + " estoy comiendo, buen provecho"  );
		
		//metodos de retorno declaren el tipo de dato que debe devolver antes del nombre del metodo
		
		
	}
	public String saludar (String horario) {
		// si quiero que aparte devolver el valor imprima algo en consola lo podemos hacer
		
		String saludo = "hola soy " + nombre + ". buenas" + horario;
		System.out.println(saludo);
		
		return saludo;
	}
	
	//ejemplo de metodos polimorfico
		// aqui en este no ppedimos ningun parametro
		public void comer() {
			
			System.out.println("hola estoy comiendo");
			
		}
		
		//ejemplo de metodo polimorfico con mas argumentos
		
		public void comer(String comida, int raciones) {
			
			System.out.println("hola estoy comiendo " + raciones + " raciones de "+ comida);
		}
		
		//METODOS ABSTRACTOS
		// nos dicen que se va hacer pero no como se va hacer5, es decir son metyodos sin un cuerpo
		//estos metodos que no van a ser definidos por esta clase (clase padre)
		//tendran que ser definidos por clases hijas (empleado)
		
		public abstract void sumar(int a, int b);
		
		//puede tener mas metodos abstractos
		
		public abstract void respirar();

}
