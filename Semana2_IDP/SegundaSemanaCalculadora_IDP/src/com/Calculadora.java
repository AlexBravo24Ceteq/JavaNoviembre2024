package com;

public abstract class Calculadora {
	
	private String marca;
	private String pantalla;
	private String color;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String pantalla, String color) {
		super();
		this.marca = marca;
		this.pantalla = pantalla;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String modelo) {
		this.pantalla = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", pantalla=" + pantalla + ", color=" + color + "]";
	}
	//6. Crear 4 métodos abstractos (sumar, restar, multiplicar y dividir), ya sean métodos void
	//public abstract void sumar(int numa, int numb);
	
	public abstract void sumar(int num1, int num2);
	public abstract void restar(int num1, int num2);
	public abstract void multiplicar(int num1, int num2);
	public abstract void dividir(float num1, float num2);
	

}
