package com;

public abstract class Calculadora {

	public String marca;
	public String color;
	public boolean incBaterias;
	public int precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, boolean incBaterias, int precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.incBaterias = incBaterias;
		this.precio = precio;
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

	public boolean isIncBaterias() {
		return incBaterias;
	}

	public void setIncBaterias(boolean incBaterias) {
		this.incBaterias = incBaterias;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", incBaterias=" + incBaterias + ", precio="
				+ precio + "]";
	}
	// Metodos abstractos
	public abstract void sumar( int a, int b);
	public abstract void restar( int a, int b);
	public abstract void multiplicar( int a, int b);
	public abstract void dicidir( int a, int b);
}
