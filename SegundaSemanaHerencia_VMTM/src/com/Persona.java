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
	
	public void comer(String comida) {//metodo que no retorna nada
		//acciones que hara el metodo
		System.out.println("Hola soy "+nombre+" y estoy comiendo "+ comida +" no molestes.");
	}
	
	public String saludar(String horario) {
		//return "Hola buenas "+horario+" soy " + nombre;//Forma 1
		String saludo="Hola buenas "+horario+" soy " + nombre;//Forma 2
		//puede hacer otra cosa aparte de mandar una simple impresion por consola
		
		return saludo;
	}
	//POLIMORFISMO: HABILIDAD DE METODO FUNCION, VARIABLE U OBJETO DE POSEER VARIAS FORMAS DIFERENTES, 
	//SU PROPOSITO ES IMPLEMENTAR ENVIO DE MENSAJES EN QUE LOS OBJETOS INTERACTUAN ENTRE SI 
	//EN JAVA HAY 4 FORMAS DE POLIMORFISMO
	//POLIMORFISMO DE ASIGNACION-
	//POLIMORFISMO PURO-
	//SOBRECARGA-
	//POLIMORFISMO DE INCLUSIÓN-
	
	//METODO POLIMORFICO
	//EJ DONDE NO SE PIDE NINGUN PARAMETRO
	public void comer() {
		System.out.println("Estoy comiendo no molestes");
	}
	
	public void comer(String comida, int raciones) {//polimorfismo con mas parametros
		//la sobre carga es cuando un elemento se le pasen los parámetros necesarios
		System.out.printf("Estoy comiendo %s distribuida en %d raciones no me molestes",comida,raciones);
	}
	
	
	//metodos abstractos, nos dicen que pero no el como
	// son métodos sin un cuerpo
	//estos metodos no definidos se definirán por las clases hijas
	public abstract void sumar(int a, int b);
	
}
