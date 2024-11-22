package com;

public class Ram {
	private String marca;
	private String modelo;
	private double freceuncia;
	
	public Ram () {}

	public Ram(String marca, String modelo, double freceuncia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.freceuncia = freceuncia;
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

	public double getFreceuncia() {
		return freceuncia;
	}

	public void setFreceuncia(double freceuncia) {
		this.freceuncia = freceuncia;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", modelo=" + modelo + ", freceuncia=" + freceuncia + "]";
	}
	
	
	

}
