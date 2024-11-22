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
	
	//metodos propios
	//funciones o comportamientos que pueden ejecutar nuestros objetos
	
	
	//ej. realizar la accion comer
	// acciones que pueden ejecutar nuestros objetos
	// ejemplo de metodo sin retorno (void) ejecutan algo pero no deben devolover el valor de un tipode dato

	
	
	public void comer(String comida) {
		// aqui va a declarar el metodo que va a ejecutar 
		System.out.println("Hola soy " + nombre +". Estoy comiendo "+ comida +  ".Buen provecho");
	}
	
	//Metodos con retorno. Declaran el tipo de dato a devolver antes del nombre del metodo
	
	public String saludar(String horario) {
		
		String saludo= "Hola soy " + nombre + ". Buenas"+ horario;
		
		System.out.println(saludo);
		
		return saludo;
		
		//Ej. metodo polimorfico
		
		
			
		
		}
		
	public void comer() {
		
		System.out.println("Estoy comiendo");
	
	}
	
	public void comer(String comida, int raciones) {
		
		System.out.println("Estoy comiendo "+ raciones+ " raciones de "+ comida);
		
	}
	
	
	
	//Metodos abstractos. son aquellos que nos dicen que se va a hacer pero no comom se va a hacer es decir son metodos sin un cuerpo
	//estos metodos que no van a ser definidos por esta clase tendran que ser definidas por las clases hijas
	
	
	
	public abstract void sumar(int a, int b);
	
	
	
	
}
