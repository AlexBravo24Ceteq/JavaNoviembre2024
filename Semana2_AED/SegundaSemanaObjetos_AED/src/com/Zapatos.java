package com;

public class Zapatos {

	private int tamaño;
	private String color;
	private String Marca;
	private boolean incluyecalzador;
	
	public Zapatos() {
		
	}

	public Zapatos(int tamaño, String color, String marca, boolean incluyecalzador) {
		super();
		this.tamaño = tamaño;
		this.color = color;
		Marca = marca;
		this.incluyecalzador = incluyecalzador;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public boolean isIncluyecalzador() {
		return incluyecalzador;
	}

	public void setIncluyecalzador(boolean incluyecalzador) {
		this.incluyecalzador = incluyecalzador;
	}

	@Override
	public String toString() {
		return "Zapatos [tamaño=" + tamaño + ", color=" + color + ", Marca=" + Marca + ", incluyecalzador="
				+ incluyecalzador + "]";
	}
}
