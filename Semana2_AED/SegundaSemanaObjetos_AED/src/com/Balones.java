package com;

public class Balones {

	private String deporte;
	private String marca;
	private int tamaño;
	
	public Balones() {
		
	}
	
	public Balones(String deporte, String marca, int tamaño) {
		super();
		this.deporte = deporte;
		this.marca = marca;
		this.tamaño = tamaño;
	}
	
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	@Override
	public String toString() {
		return "Balones [deporte=" + deporte + ", marca=" + marca + ", tamaño=" + tamaño + "]";
	}
	
	
	
}
