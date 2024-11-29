package com;

public class Procesador {
	private String marca;
	private String modelo;
	private double freceuncia;
	private double nucleos;
	
	public Procesador () {}

	public Procesador(String marca, String modelo, double freceuncia, double nucleos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.freceuncia = freceuncia;
		this.nucleos = nucleos;
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

	public double getNucleos() {
		return nucleos;
	}

	public void setNucleos(double nucleos) {
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", freceuncia=" + freceuncia + ", nucleos="
				+ nucleos + "]";
	}
	

}