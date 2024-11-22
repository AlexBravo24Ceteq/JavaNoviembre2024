package com;

public class Laptop {
	private String marca;
	private String Modelo;
	private String color;
	//aqui ahora nuestras laptops tendran como atributo otros objetos
	
	private Almacenamiento disco;
	private Procesador cpu;
	private Ram memoria;
	public Laptop(String marca, String modelo, String color, Almacenamiento disco, Procesador cpu, Ram memoria) {
		super();
		this.marca = marca;
		Modelo = modelo;
		this.color = color;
		this.disco = disco;
		this.cpu = cpu;
		this.memoria = memoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
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
	public Ram getMemoria() {
		return memoria;
	}
	public void setMemoria(Ram memoria) {
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", Modelo=" + Modelo + ", color=" + color + ", disco=" + disco + ", cpu="
				+ cpu + ", memoria=" + memoria + "]";
	}

}
