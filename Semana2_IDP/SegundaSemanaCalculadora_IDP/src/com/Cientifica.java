package com;

public class  Cientifica extends Calculadora {
//9. Cientifica deberá implementar los métodos de su clase padre y deberán definir la lógica de los
//	métodos para que estos realicen las operaciones básicas. Y además crearan un método más de cada uno
//	(sumar, restar, multiplicar y dividir, que solicite argumentos distintos para las operaciones)
//	(Ej. int a, int b, int c)
	
	private String tipo;
	private String modelo;
	
	public Cientifica() {
		
	}

	public Cientifica(String marca, String pantalla, String color, String tipo, String modelo) {
		super(marca, pantalla, color);
		this.tipo = tipo;
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Cientifica [tipo=" + tipo + ", modelo=" + modelo + ", toString()=" + super.toString() + "]";
	}
	
//	Cientifica deberá implementar los métodos de su clase padre y deberán definir la lógica de los
//	métodos para que estos realicen las operaciones básicas. Y además crearan un método más de cada uno
//	(sumar, restar, multiplicar y dividir, que solicite argumentos distintos para las operaciones)
//	(Ej. int a, int b, int c)

	@Override
	public void sumar(int num1, int num2) {
		System.out.println("la suma es:"+(num1+num2));
		
	}

	@Override
	public void restar(int num1, int num2) {
		System.out.println("la resta es:"+(num1-num2));
		
	}

	@Override
	public void multiplicar(int num1, int num2) {
		System.out.println("la multiplicacion es:"+(num1*num2));
		
	}

	@Override
	public void dividir(float num1, float num2) {
		System.out.println("la division es:"+(num1/num2));
		
	}
	
	//metodos propios de la clase especializada o classe hija
	

	public long sumar(long a, long b, int c) {
		long resultado;
		resultado = a+b;
		return resultado;
	}

	public long restar(long a, long b, int c) {
		long resultado;
		resultado = a-b;
		return resultado;
	}

	public long multiplicar(long a, long b, int c) {
		long resultado;
		resultado = a*b;
		return resultado;
	}

	public double dividir(long a, long b, int c) {
		double resultado;
		resultado = a/b;
		return resultado;
	}
	
	
	
	
	
}
