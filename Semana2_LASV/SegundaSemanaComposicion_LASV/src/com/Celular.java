package com;

public class Celular {
	private String marca;
	private String modelo;
	private Camara camaras;
	private ProcesadorCel cpu;
	private RamCel ram;
	private String color;
	
	public Celular(String marca, String modelo, Camara camaras, ProcesadorCel cpu, RamCel ram, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.camaras = camaras;
		this.cpu = cpu;
		this.ram = ram;
		this.color = color;
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
	public Camara getCamaras() {
		return camaras;
	}
	public void setCamaras(Camara camaras) {
		this.camaras = camaras;
	}
	public ProcesadorCel getCpu() {
		return cpu;
	}
	public void setCpu(ProcesadorCel cpu) {
		this.cpu = cpu;
	}
	public RamCel getRam() {
		return ram;
	}
	public void setRam(RamCel ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", camaras=" + camaras + ", cpu=" + cpu + ", ram="
				+ ram + ", color=" + color + "]";
	}
	

}
