package com;

public class Persona { //clase persona

	//atributos
	//para evitar asignaciones no autorizadas, debemos encapsularlos.
	//su nivel de acceso nos ayudará. private, protected, public, default.
	
	//con private solo podré cambiar su valor desde aquí.
	private String nombre;
	private int edad;
	private String genero;
	
	//Ahora necesito métodos que me permitan construir mis objetos.
	//Un método constructor vacía.
	//Me permite crear un objeto sin darle valor a sus atributos. El molde.
	
	// este es el método constructor.
	public Persona() {
		
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param genero
	 */
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	// Podemos tener más de un constructor. Aqui hay uno que usa solo el nombre.
	
	/**
	 * @param nombre
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	

	// Tener multiples constructures me permite declarar objetos con diferentes valores.
	// El vacío por ejemplo, te permite hacer unos que puedan ser construidos despues. 
	// Estps son getters y setters.
	// Los métodos GET te permiten recuperar el valor guardado del atributo.
	// Los métodos set te permiten asignarle un valor a un atributo determinado. Aunque sea privado.
	// ahora no colocamos objeto.atributo.
	// ahora usamos objeto.setAtributo para modificarlo.
	
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
	public String toString() { //Esto es para imprimir. Un nuevo método que puede usar la clase?
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
}
