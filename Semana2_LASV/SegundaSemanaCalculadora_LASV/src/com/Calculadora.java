package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	private String tamaño;
	public Calculadora(String marca, String color, String tamaño) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
	}
	
	public Calculadora() {
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return " [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
	public abstract void sumar(int a, int b);
	
	public abstract void restar(int a, int b);
	
	public abstract void multiplicar(double a, double b);
	
	public abstract void dividir(double a, double b);

}
