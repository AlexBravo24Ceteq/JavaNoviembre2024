package com;

public class Laptop {

	private String marca;
	private String modelo;
	private String color;
	// Aqui ahora nuestras labtos tendran como atributo otros objetos
	private Almacenamiento disco;
	private Procesador cpu;
	private Ram memorioa;
	
	public Laptop() {
		
	}

	public Laptop(String marca, String modelo, String color, Almacenamiento disco, Procesador cpu, Ram memorioa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.disco = disco;
		this.cpu = cpu;
		this.memorioa = memorioa;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Ram getMemorioa() {
		return memorioa;
	}

	public void setMemorioa(Ram memorioa) {
		this.memorioa = memorioa;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", disco=" + disco + ", cpu="
				+ cpu + ", memorioa=" + memorioa + "]";
	}
	
}
