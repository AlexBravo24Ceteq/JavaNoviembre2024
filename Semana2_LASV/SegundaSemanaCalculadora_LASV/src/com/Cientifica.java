package com;

public class Cientifica extends Calculadora {
	
	public Cientifica() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "La calculadora es: " + super.toString();
	}


	@Override
	public void sumar(int a, int b) {
		System.out.println("la suma es :" + (a + b));
		
	}


	@Override
	public void restar(int a, int b) {
		System.out.println("la resta es :" + (a - b));
		
	}


	@Override
	public void multiplicar(double a, double b) {
		System.out.println("la multiplicacion es :" + (a * b));
		
	}


	@Override
	public void dividir(double a, double b) {
		System.out.println("la division es :" + (a / b));
		
	}
	

}
