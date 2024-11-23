package com;

public class Comedor {

	private String color;
	private int NumVentanas;
	private int NumPuertas;
	private int NumTomacorrientes;
	private boolean Amueblada;
	private double medida;
	
	
	public Comedor() {
		
	}


	public Comedor(String color, int numVentanas, int numPuertas, int numTomacorrientes, boolean amueblada,
			double medida) {
		super();
		this.color = color;
		NumVentanas = numVentanas;
		NumPuertas = numPuertas;
		NumTomacorrientes = numTomacorrientes;
		Amueblada = amueblada;
		this.medida = medida;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumVentanas() {
		return NumVentanas;
	}


	public void setNumVentanas(int numVentanas) {
		NumVentanas = numVentanas;
	}


	public int getNumPuertas() {
		return NumPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		NumPuertas = numPuertas;
	}


	public int getNumTomacorrientes() {
		return NumTomacorrientes;
	}


	public void setNumTomacorrientes(int numTomacorrientes) {
		NumTomacorrientes = numTomacorrientes;
	}


	public boolean isAmueblada() {
		return Amueblada;
	}


	public void setAmueblada(boolean amueblada) {
		Amueblada = amueblada;
	}


	public double getMedida() {
		return medida;
	}


	public void setMedida(double medida) {
		this.medida = medida;
	}


	@Override
	public String toString() {
		return "Comedor [color=" + color + ", NumVentanas=" + NumVentanas + ", NumPuertas=" + NumPuertas
				+ ", NumTomacorrientes=" + NumTomacorrientes + ", Amueblada=" + Amueblada + ", medida=" + medida + "]";
	}
	
}
