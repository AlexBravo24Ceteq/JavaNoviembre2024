package com;

public class Cocina {
	
	private String color;
	private int numVentanas;
	private int numPuertas;
	private int numTomacorrientes;
	private boolean amueblada;
	private boolean instalacionGas;
	private double medida;
	
	public Cocina() {}

	public Cocina(String color, int numVentanas, int numPuertas, int numTomacorrientes, boolean amueblada,
			boolean instalacionGas, double medida) {
		super();
		this.color = color;
		this.numVentanas = numVentanas;
		this.numPuertas = numPuertas;
		this.numTomacorrientes = numTomacorrientes;
		this.amueblada = amueblada;
		this.instalacionGas = instalacionGas;
		this.medida = medida;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumVentanas() {
		return numVentanas;
	}

	public void setNumVentanas(int numVentanas) {
		this.numVentanas = numVentanas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumTomacorrientes() {
		return numTomacorrientes;
	}

	public void setNumTomacorrientes(int numTomacorrientes) {
		this.numTomacorrientes = numTomacorrientes;
	}

	public boolean isAmueblada() {
		return amueblada;
	}

	public void setAmueblada(boolean amueblada) {
		this.amueblada = amueblada;
	}

	public boolean isInstalacionGas() {
		return instalacionGas;
	}

	public void setInstalacionGas(boolean instalacionGas) {
		this.instalacionGas = instalacionGas;
	}

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "Cocina [color=" + color + ", numVentanas=" + numVentanas + ", numPuertas=" + numPuertas
				+ ", numTomacorrientes=" + numTomacorrientes + ", amueblada=" + amueblada + ", instalacionGas="
				+ instalacionGas + ", medida=" + medida + "]";
	}

}
