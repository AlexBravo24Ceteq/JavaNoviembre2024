package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{
	
	public String modelo;
	public String tpbaterias;
	public int capnumenpantalla;
	
	

public Cientifica() {}


	
	






	@Override
public String toString() {
	return "Cientifica [modelo=" + modelo + ", tpbaterias=" + tpbaterias + ", capnumenpantalla=" + capnumenpantalla
			+ ", toString()=" + super.toString() + "]";
}










	public String getModelo() {
	return modelo;
}










public void setModelo(String modelo) {
	this.modelo = modelo;
}










public String getTpbaterias() {
	return tpbaterias;
}










public void setTpbaterias(String tpbaterias) {
	this.tpbaterias = tpbaterias;
}










public int getCapnumenpantalla() {
	return capnumenpantalla;
}










public void setCapnumenpantalla(int capnumenpantalla) {
	this.capnumenpantalla = capnumenpantalla;
}










	public Cientifica(String marca, String color, boolean baterias, String modelo, String tpbaterias,
		int capnumenpantalla) {
	super(marca, color, baterias);
	this.modelo = modelo;
	this.tpbaterias = tpbaterias;
	this.capnumenpantalla = capnumenpantalla;
}










	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub

		System.out.println("La suma de "+a+ "+" + b +" es igual a :" + (a+b));
		
	
		
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
	
		System.out.println("La resta de "+a+"-" + b+" es igual a :" + (a-b));
		
		
		
		
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
	
		System.out.println("El resultado de "+a+ "x " + b + " es es igual a :" + (a*b));
		
		
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
	
		System.out.println("El resultado de "+a+ "/ " + b + " es igual a :" + (a/b));
		
		
		
	}
	
	public void sumar(int a, int b, int c) {
		// TODO Auto-generated method stub
		

		System.out.println("La suma de "+ a + "+"+ b + "+"+ c + " es igual a :" + (a+b+c));
	}
	
	
	public void restar(int a, int b, int c) {
		// TODO Auto-generated method stub
	
		System.out.println("La resta de "+ a + "-"+ b + "-"+ c + " es igual a :" + (a-b-c));
	}
	
	
	public void multiplicar(int a) {
	
		
		System.out.println(a+ " a la 3ra potencia es :" + (a*a*a));
	}
	
	public void dividir(int a) {
		// TODO Auto-generated method stub
	
	
			double resultado= Math.sqrt(a);
		
		
		System.out.println( "La raiz de "+a+" es; " + resultado);
	}
	
	
	
}
