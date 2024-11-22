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
	
	//MÉTODOS PROPIOS
	//FUNCIONES O COMPORTAMIENTOS
	
	//Acciobes que pueden ejecuar nuestros objetos
	
	
	//Ej una accion que nua persona puede realizar .comer()
	//Ej. Método sin retorno (void) - ejecutan algo, pero no deben devolver el valor
	//de tipo dato
	
	
	public void comer(String comida) {
	//Aquí va declarado lo que el método va a ejecutar
	//Esto va a ejecutar este método cuando lo llamemos a traves de un objeto persona
	
	System.out.println("Hola, soy "+ nombre+ ", estoy comiendo " + comida+". Buen provecho");
	}
	
	//Métodos con retorno. declaran el tipo de dato que deben devolver antes del nombre del método
	
	public String saludar (String horario){
		
		String saludo="Hola soy " + nombre + ". Buenas " + horario;
		//Si quiero que aparte de devolcer el valor, imprima algo en consola, lo podemos hacer 		
		System.out.println(saludo);
		return saludo;
		
		
	}
	
	//Ej. de polimorfismo
	//Aquí en este no pedimos ningun parametro
	public void comer () {
		System.out.println("Estoy comiendo...");
		
	}
	
	//Ej. de método polimorfico con más parámetros
	public void comer(String comida, int raciones) {
		System.out.println("Estoy comiendo "+raciones+" raciones de "+comida);
	
}

	//MÉTODOS ABSTRACTOS
	//Nos dicen QUÉ se va a hacer, pero no CÓMO se va a hacer. Es decir, son métodos sin un cuerpo
	//Estos métodos que no van a ser definidos por esta clase (CLASE PADRE)
	//Tendrán que ser definidos por las clases hijas (EMPLEADO)
	
	public abstract void sumar (int a,int b);
	
	//Puede tener más métodos abstractos
	public abstract void respirar();


}









