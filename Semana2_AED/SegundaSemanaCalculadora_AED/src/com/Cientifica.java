package com;

public class Cientifica extends Calculadora{
	
	private String modelo;
	
	public Cientifica() {
		
	}

	public Cientifica(String marca, String color, boolean incBaterias, int precio, String modelo) {
		super(marca, color, incBaterias, precio);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Cientifica [modelo=" + modelo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		// Metodo Heredado
		System.out.println("La suma es :" + (a+b));
	}

	@Override
	public void restar(int a, int b) {
		// Metodo Heredado
		System.out.println("La restar es :" + (a-b));
	}

	@Override
	public void multiplicar(int a, int b) {
		// Metodo Heredado
		System.out.println("La multiplicacion es :" + (a*b));
	}

	@Override
	public void dicidir(int a, int b) {
		// Metodo Heredado
		System.out.println("La divicion es :" + (a/b));
	}
	
	public void sumar(int a, int b, int c) {
		System.out.println("La suma es :" + (a+b+c));
	}

	public void restar(int a, int b, int c) {
		System.out.println("La restar es :" + (a-b-c));
	}
	
	public void multiplicar(int a, int b, int c) {
		// Metodo Heredado
		System.out.println("La multiplicacion es :" + (c *(a*b)));
	}
	
	public void dicidir(int a, int b, int c) {
		// Metodo Heredado
		System.out.println("La divicion es :" + ((a/b)/c));
	}
}
