package com;

public class Ram {
	private String marca;
	private String modelo;
//	private String tipo;
	private double frecuencia;
//	private int capacidad;
	
	public Ram() {}
	public Ram(String marca, String modelo, double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.frecuencia = frecuencia;
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
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", modelo=" + modelo + ", frecuencia=" + frecuencia + "]";
	}
	
	
	

}
