package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private boolean solar;
	
	public Calculadora ( ) {}

	public Calculadora(String marca, String color, boolean solar) {
		super();
		this.marca = marca;
		this.color = color;
		this.solar = solar;
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

	public boolean isSolar() {
		return solar;
	}

	public void setSolar(boolean solar) {
		this.solar = solar;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", solar=" + solar + "]";
	}
	
	//METODO ABSTRACTO
	public abstract void sumar (int a, int b, int c);
	
	public abstract void restar (int a, int b);
	
	public abstract void multiplicar (int a, int b, int c);
	
	public abstract void dividir (int a, int b);

}
