package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	private String tipoPantalla;
	
	public Calculadora() {}

	public Calculadora(String marca, String color, String tipoPantalla) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipoPantalla = tipoPantalla;
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

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", tipoPantalla=" + tipoPantalla + "]";
	}
	
	public abstract void sumar(float a, float b);
	
	public abstract void sumar(float a, float b,float c);
	
	public abstract void restar(float a, float b);
	public abstract void multiplicar(float a, float b);
	public abstract void dividir(float a, float b);
	
	
	
	
	

}
