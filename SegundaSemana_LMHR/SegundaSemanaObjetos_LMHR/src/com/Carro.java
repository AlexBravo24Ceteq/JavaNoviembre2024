package com;

public class Carro {
	
	private int llantas ;
	private String color;
	private String modelo;
	private int puertas;

	public Carro () {
	
}

	@Override
	public String toString() {
		return "Carro [llantas=" + llantas + ", color=" + color + ", modelo=" + modelo + ", puertas=" + puertas + "]";
	}

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public Carro(int llantas, String color, String modelo, int puertas) {
		super();
		this.llantas = llantas;
		this.color = color;
		this.modelo = modelo;
		this.puertas = puertas;
	}
	
}