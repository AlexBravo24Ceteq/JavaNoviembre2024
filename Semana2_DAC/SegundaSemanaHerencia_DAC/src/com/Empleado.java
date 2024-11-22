package com;

//la multy herencia en java no existe una clase hija no puede tener dos clases padre
//pero se puede simular con el uso de interfases

public class Empleado extends Persona implements IOperaciones, ITermometro{
	
	//Herencia- pilar de la programación POO
	// nos ayuda a que una clase herede atributos y metodos de otra ayudandonos asi a reciclar codigo y se realiza con la palabra reservada extends
	
	
		
		//una vez heredando los atributos de persona declaro aqui los propiios del empleado
		
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

// ademas de tener metodos heredados el empleado puede tener metodos porpios
public void checarEntrada () {
	System.out.println("INICIANDO TURNO. bUENAS TARDES");
	
}

@Override
public void sumar(int a, int b) {
	// lAS CLASES HIJAS O LAS QUE HEREDAN EL METODO ABSTRACTO TIENEN QUE DEFINIR COMO SE VAN A REALIZAR ESTAS ACCIONES	
	
	System.out.println("La suma es: "+ (a+b));
	
	
	
	
	
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
	
//¿De donde toman comportamientos los objetos/clases?
	
	//1.- de metodos propios
	//2.- de metodos heredados de otras clases incluso clases abstractas
	//3.- de interfases
	
	
	
	
}




}
