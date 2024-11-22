package com;

public class ProcesadorCel {
	
	private String modelo;
	private int nucleos;
	private double frecuencia;
	
	public ProcesadorCel () {
		
	}

	public ProcesadorCel(String modelo, int nucleos, double frecuencia) {
		super();
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "\nProcesadorCel [modelo=" + modelo + ", nucleos=" + nucleos + ", frecuencia=" + frecuencia + "]";
	}

}
