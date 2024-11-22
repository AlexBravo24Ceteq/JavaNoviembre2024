package com;

public class Carro {
	private String marca;
	private String modelo;
	private String color;
	private int numPuertas;
	private String combustible;
	
	
	
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Carro(String marca, String modelo, String color, int numPuertas, String combustible) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numPuertas = numPuertas;
		this.combustible = combustible;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numPuertas=" + numPuertas
				+ ", combustible=" + combustible + "]";
	}
	
	
	
	

}
