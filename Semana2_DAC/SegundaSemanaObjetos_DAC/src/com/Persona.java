package com;

public class Persona {

	
	//Es un pilar de la programacion
	//Abstraccion-  Capacidad de disminuir la complejidad de un objeto
	// aqui en programacion , tener la idea de que queremos moldear de un objeto  en si y que vamos a necesitar de el
	
	//ATRIBUTOS- caracteristicas que podrian conformar mi objeto
	//Para proteger la informacion de asignaciones no autorizadas a estos valores debemos protegerlos o encapsularlos
	//ENCAPSULAMIENTO proteger la info de acceso no autorizado que se logra con modificadores de acceso, estos pueden ser;
	//private, protected,public,default
	//Para los atributos casi siempre se prefiere que estos sean Privados
	//esto los hará modificables unicamente desde esta misma clase
	
	
	
	private String nombre;
	private int edad;
	private String genero;
	
	// Necesitamos metodos que me permitan crear mis objetos y podemos encontrar los siguientes
	
	//metodo constructor vacío
	
	//me permite crear un objeto pero sin necesidad de darle valor a sus otributos
	// ejemplo crer una persona niño = new Persona();
	
	public Persona() {
	
	}

	//Metodo constructor con todos los parametros, permite crear objetos asignandole valores desde un inicio a todos los objetos
	
	
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		
		
				
		
		
		
	}

	// podemos crear una persona solo con nombre
	//regularmente solo necesitamos por lo menos el constructor vacio
	//y el de todos los parametros, pero si necesitamos mas lo podemos tener
	
	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		
		// los metodos get nos van a permitir recuperar el valor guardado del atributo
		// por otro lado los metodos set van a permitir asignarle un valor a un attrubuto determinado ej attributos privados
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

	
	// metodo toString() -  me va  apermitir vizualisar el valor de los atributos en forma de string de mi objeto 
	//y asi poder vizualizar en consola , es algo asi como una radiografia de mi objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}

	
	
	
	
}
