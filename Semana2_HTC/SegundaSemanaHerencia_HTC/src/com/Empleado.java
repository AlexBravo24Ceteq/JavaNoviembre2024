package com;
//esta madre ya se volvió una quimera de muchas chingaderas
public class Empleado extends Persona implements IOperaciones,ITermometro {//Esto va a Heredar Persona.
	 //Luego le ponemos implements IOperaciones,ITermometro. ESta implementando Interfaces. Y por lo tanto, "hereda" las cosas en interfaces.
	//PArece multiherencia pero no es? npi
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {}

	public Empleado(String name, int edad, String genero, String rfc, double salario, String turno) {
		super(name, edad, genero);
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
		System.out.println("Entrando al chambo");
	}

	@Override
	public void sumar(int a, int b) { //Método heredado de Persona, su PADRE.
		System.out.println("La suma es: " + (a+b));
		
	}

	//Esto se heredó de IOperaciones, siendo una interface
	
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

	//Métodos implementados de ITermometro
	
	@Override
	public void temperaturaCelsius() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void temperaturaFerenheit() {
		// TODO Auto-generated method stub
		
	}
	
	//Los objetos toman comportamientos de métodos propios. Heredados de otras clases y/o clases abstractas, e interfaces. Esta chingadera se rellena con lo que sea.

}
