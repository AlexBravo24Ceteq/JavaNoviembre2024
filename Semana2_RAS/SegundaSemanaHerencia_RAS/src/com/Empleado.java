package com;

//Herencia 

//La multiherencia en java no existe

public class Empleado extends Persona implements IOperaciones, ITermometro{
	
	private String rfc, turno;
	private double salario;

	public Empleado() {}

	public Empleado(String nombre, String genero, int edad, String rfc, String turno, double salario) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.turno = turno;
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", turno=" + turno + ", salario=" + salario + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void checarEntrada() {
		System.out.println("Iniciando turno");
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("La suma es: "+(a+b));
		
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
	public void temperaturaFarenheit() {
		// TODO Auto-generated method stub
		
	}
	
	//DE donde toman comportamiento los objetos?
	//- De metodos propios
	//- De metodos heredados o abstractos de otras clases 
	//- De interfaces
	
	
	
	

}
