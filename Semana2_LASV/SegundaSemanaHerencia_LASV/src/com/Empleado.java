package com;

//Herencia - pilar de la POO
//Nos ayyuda a que una clase herede atributos y metodos de otra ayudandonos asi a recilar codigo
//se realiza con la palabra reservada extends
//la multiherencia en java no existe. no puede una clase hija tener 2 clases padre
//la multiherencia se puede simular con el uso de Interfaces
public class Empleado extends Persona implements IOperaciones, ITermometro {
	
	//una vez heredando los atributois de persona solo declaro aqui los propios del empleado
	
	private String rfc;
	private double salario;
	private String turno;
	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
		super(nombre, edad, genero);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}
	public Empleado() {
		// TODO Auto-generated constructor stub
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
 //ademas de tener metodos heredados ell empleado puede tener metodos propios
	
	public void checarEntrada() {
		System.out.println("inicianado turno buen dia");
	}
	@Override
	public void sumar(int a, int b) {
		// las clases hijas o las que heredan el metodo abstracto tienen que definirlo
		//como se van a realizar
		System.out.println("la suma es : " + (a+b));
		
	}
	@Override
	public void respirar() {
		System.out.println("estoy respirandob");
		
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
	public void temperaturaCelcius() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void temperaturafahrenheit() {
		// TODO Auto-generated method stub
		// De donde toman comportamientos los Objetos?
		// 1. De metodos propios
		// 2. De metodos heredados de otras clases, incluso clases abstractas
		// 3. De interfaces
		
	}
}
