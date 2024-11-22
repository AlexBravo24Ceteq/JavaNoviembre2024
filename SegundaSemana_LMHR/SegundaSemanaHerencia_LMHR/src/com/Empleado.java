package com;

public class Empleado extends Persona implements IOperaciones, ITermometro{
	// HERENCIA - pilar e la POO
	// Nos ayda a que una clse herede atributos y metodos de otra
	// ayudandonos a reciclar codigo
	//se realiza con la palabra resevrada extend 
	
	
	
	//La multiherencia en Java no existe, no puede una clase hija
	//ttener dos clases padre
	//La multiherencia se puede simular con el uso de interfaces 

	
	
	
// Una vez heredando los atributos de Persona 
	//solo eclaro aqui los porpios del empleado
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado () {}

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
	
	//Ademas de tener metodos heredados el empleado puede tener metodos propios
	public void checarEntrada () {
		System.out.println("iniciando turno. Buen dia");
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		// las clases hijas o las que heredan metodo abstracto tienen que definirlo
		//COMO se van a realizar
		System.out.println("La suma es: " + (a+b));
		
		
		
		
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
	
	//de donde toman comportamientos los objetos?
	// 1. Metodos propios
	// 2. metodos heredados de otras clases, incluso abstractas 
	//3. de interfaces
	
}
