package com;

public class Celular {
	
	private String marca, gama; 
	private float precio, ram;
	
	public Celular(){
		
	}

	public Celular(String marca, String gama, float precio, float ram) {
		super();
		this.marca = marca;
		this.gama = gama;
		this.precio = precio;
		this.ram = ram;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getRam() {
		return ram;
	}

	public void setRam(float ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", gama=" + gama + ", precio=" + precio + ", ram=" + ram + "]";
	}
	
	

}
