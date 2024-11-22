package com;

public abstract class Persona {
	
	private String nombre;
	private int edad;
	private String genero;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
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
	
	//Metodos con retorno
	//metodos sin retorno
	
	//ejemplo de accion comer
	//ejemplo de metodo sin retorno
	
	public void comer(String comida) {
		System.out.println("hola soy:"+ nombre +" y estoy comiendo "+ comida);
		
	}
	
	public String saludar(String horario) {
		String saludo = "hola soy"+ nombre + " buenas"+ horario;
		
		
		return saludo;
	}
	
	public void comer() {
		System.out.println("estoy comiendo .....");
	}
	
	public void comer(String comida, int raciones) {
		System.out.println("estoy comiendo "+ raciones+" raciones de "+comida);
	}
	//metodos abstractos on aquellos qu nos dicn que se va a hacer pero no como se va a hacer
	//son metodos in un cuerpo
	
	public abstract void sumar(int numa, int numb);
	
	public abstract void respirar();

}
