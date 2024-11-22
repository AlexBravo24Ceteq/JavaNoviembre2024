package com;

//herencia es un pilar de la poo y no ayuda que una clae herede atributos y metodos de otra
//ayudandonos a reciclr codigo y se declara con l palabr reservada extend
public class Empleado extends Persona implements IOperaciones, ITermometro{
	
	private String rfc;
	private double salario;
	private String turno;
	
	
	public Empleado() {
		
	}


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
	
	public void checarEntrada() {
		System.out.print("iniciando turno buen dia");
	}


	@Override
	public void sumar(int numa, int numb) {
		//las clases hijas tienen que eclarar como se realiza
		
		System.out.println("la suma es:"+ (numa+numb));
		
	}


	@Override
	public void respirar() {
		// TODO Auto-generated method stub

		System.out.println("estoy respirando");
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
	public void temperaturaFrenheit() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
