package com;

// HERENCIA - pilar de la programacion poo
// nos ayuda a que una clase herede atributos y metodods de otra 
// ayuda a reciclar codigo
// se realiza con la palabra reservada extends
// La multi  herencia en java no existe una clase fija no puede tener dos clases padre 
// La multi herencia se puede simular con el uso de interfaces
public class Empleado extends Persona implements IOperaciones, ITermometro {
	
// Una Vez heredando los atributos de Persona
// Solo declaro los propios del empleado
	
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

	// ademas de ter metodos heredados un empleado puede tener metodos propios
	
	public void checarEntrada() {
		System.out.println("Iniciando turno. buen día");
	}

	@Override
	public void sumar(int a, int b) {
		// las clases hijas o las que heredan el metodo abstracto tienen que definirlo
		System.out.println("La suma es :" + (a+b));
		
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
		
		// DE DONDE TOMAR COMPORTAMIENTO LOS OBJETOS
		// 1.- De metodos propios
		// 2.- De metodos heredados de otras clases, incluso clases abstractas
		// 3.- De intrfaces
		
	}
}
