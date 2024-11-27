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
	
	//METODOS PROPIOS
	//FUNCIONES O COMPORTAMIENTOS
	
	//Acciones que pueden ejecutar nuestros ojetos
	
	//Ej. una acción que una persona puede realizar: .comer()
	//Ej. Método sin retorno (void) - ejecutan algo, pero no deben devolver el valor de un tipo de dato
	
	public void comer(String comida) {
		//Aquí va declarado lo que el método va a ejecutar
		System.out.println("Estoy comiendo, buen provecho");
		System.out.println("Estoy comiendo " + comida + ". Buen provecho");
	}
	
	//Métodos con retorno. Declaran el tipo de dato que deben devolver antes del nombre del método
	
	public String saludar (String horario) {
		
		String saludo = "Hola soy " + nombre + ". Buenas " + horario;
		
		//Si quiero que aparte de devolverl el valor, imprima algo en consola, lo podemos hacer
		System.out.println(saludo);
		return saludo;
	}
	
	//Ejemplo de método polimórfico
	
	public void comer() {
		System.out.println("Estoy comiendo...");
	}
	
	//Ejemplo de método polimórfico con más parámetros
	
	public void comer(String comida, int raciones) {
		System.out.println("Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	//METODOS ABSTRACTOS
	//Nos "¿dicen qué se va hacer?", pero no ¿cómo se va hacer?, es decir,
	//son métodos sin un cuerpo
	//Estos métodos que no van a ser definidos por esta clase (CLASE PADRE)
	//tendrán que ser definidos por las clases hijas (EMPLEADO)
	
	public abstract void sumar (int a, int b);
}

