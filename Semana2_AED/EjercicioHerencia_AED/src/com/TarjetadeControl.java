package com;

public class TarjetadeControl {
	
	private String marca;
	private String modelo;
	private int velocidades;
	private double prcio;

	public TarjetadeControl() {}

	public TarjetadeControl(String marca, String modelo, int velocidades, double prcio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidades = velocidades;
		this.prcio = prcio;
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

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	public double getPrcio() {
		return prcio;
	}

	public void setPrcio(double prcio) {
		this.prcio = prcio;
	}

	@Override
	public String toString() {
		return "TarjetadeControl [marca=" + marca + ", modelo=" + modelo + ", velocidades=" + velocidades + ", prcio="
				+ prcio + "]";
	}
	
}
