package com;

public abstract class Calculadora {
	
	private String marca, color, precio;
	
	public Calculadora() {}

	public Calculadora(String marca, String color, String precio) {
		super();
		this.marca = marca;
		this.color = color;
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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	};
	public abstract void suma();
	public abstract double suma(double x, double y);
	public abstract void restar();
	public abstract double restar(double x, double y);
	public abstract void multiplicar();
	public abstract double multiplicar(double x, double y);
	public abstract void dividir();
	public abstract double dividir(double x, double y);
	
	

}
