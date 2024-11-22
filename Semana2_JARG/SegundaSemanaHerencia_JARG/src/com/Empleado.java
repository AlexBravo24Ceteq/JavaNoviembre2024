package com;


	//HERENCIA - Pilar de POO
	//Nos ayuda que una clase herede atributos y métodos de otra
	//ayudándonos así a reciclar código
	//Se realiza con la palabra reservada extends


	//La multiherencia en Java no existe. No puede una clase hija tener dos
	//clases padre

	//La multiherencia se puede simular con el  uso de Interfaces

	
	public class Empleado extends Persona implements IOperaciones, ITermometro {
		
		//Una vez heredando los atributos de Persona
		//sólo declaro aqui los propios del empleado
		
		private String rfc;
		private double salario;
		private String turno;
		
		
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
	
	
	//Además de tener métodos heredados el empleado puede tener métodos propios
	
	public void checarEntrada() {
		System.out.println("Iniciando turno. Buen día");
	}


	@Override
	public void sumar(int a, int b) {
		// Las clases hijas o las que heredan el método abstracto tienen que definirlo
		//CÓMO se van a realizar
		System.out.println("La suma es: "+(a+b));
		
		
	}


	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
		
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
	public void multiplica() {
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
	
	//¿DE DONDE TOMAN COMPORTAMIENTOS LOS OBJETOS7CLASES?
	
	// 1.- De métodos propios
	// 2.- De métodos heredados de otras clases, incluso abstractas
	// 3.- De interfaces
		
	
	}


	
	
	
	
	
	