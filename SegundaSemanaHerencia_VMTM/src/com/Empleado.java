package com;

//HERENCIA ES UN PILAR DE LA POO
	//AYUDA A QUE UNA CLASE HEREDE ATRIBUTOS Y MÉTODOS DE OTROS
	//AYUDANDONOS ASI A RECICLAR CÓDIGO
	//SE REALIZA CON LA PALABRA RESERVADA EXTENDS
	
//la miltiherencia se da mediante el implements IOperaciones, se puede implementar más de una interfaz
public class Empleado extends Persona implements IOperaciones,ITermometro{//atributos y metodos son prestados de Persona
	//puedo definir sus atributos propios
	private String rfc;
	private double salario;
	private String turno;
	
	//cuando se hereda en constructores si viene el cambio siguiente:
	//primero vacio, constructores selecciona super constructor to invoke,
	//es necesario seleccionar todos los parametros alñ generar el segundo constructor
	//se generan gettersz y setters
	//cuando se genera to string si hay cambio y es que se debe selecciona inherited methods, toString
	public Empleado() {}

	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
		super(nombre, edad, genero);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	//Un empleado puede tener metodos propios
	
	public void checarEntrada() {
		System.out.println("Iniciando turno");
		
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("El resultado de la suma es: %d",a+b);
		
	}

	@Override
	public void sumar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void temperaturaCelsius() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void temperaturaFarenheit() {
		// TODO Auto-generated method stub
		
	}
	
	//los objetos toman comportamientos de objetos:
	//de metodos propios
	//de metodos heredados de otras clases incluso clases abstractas
	//de interfaces
	
	//las colecciones son un conjunto de elementos sin orden en concreto
	//tipos de colecciones
	//1. set lista pero sdin elementos duplicados, .hashset, treeset, linkedhashset
	//2. listas arraylist, linkedlist, si puede tener elementos duplicados, add, remove
	//3. map, asocia claves a valores, hashmap, treemap, linkedhashmap, las claves son unicas y asociadas a un valor como máximo
	//4. stream api, permite realizar operaciones funcionales sobre los elementos de las colecciones
	
	
	
	
	
	
	
}
