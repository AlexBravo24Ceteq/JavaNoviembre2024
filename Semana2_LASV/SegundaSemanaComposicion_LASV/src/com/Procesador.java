package com;

public class Procesador {
	
	private String marca; 
	private String modelo;
	private double frecuencia;
	private int nucleos;
	
	public Procesador() {
		
	}

	public Procesador(String marca, String modelo, double capacidad, int nucleos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.frecuencia = capacidad;
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

	public double getCapacidad() {
		return frecuencia;
	}

	public void setCapacidad(double capacidad) {
		this.frecuencia = capacidad;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + frecuencia + ", nucleos=" + nucleos
				+ "]";
	}

	
}
