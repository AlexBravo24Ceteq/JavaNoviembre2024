package com;

public class Celular {
	
	private String modelo;
	private int camara;
	private int almacenamiento;
	private String color;
	private int menRam;
	public Celular(String modelo, int camara, int almacenamiento, String color, int menRam) {
		super();
		this.modelo = modelo;
		this.camara = camara;
		this.almacenamiento = almacenamiento;
		this.color = color;
		this.menRam = menRam;
	}
	public Celular() {
		// TODO Auto-generated constructor stub
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCamara() {
		return camara;
	}
	public void setCamara(int camara) {
		this.camara = camara;
	}
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMenRam() {
		return menRam;
	}
	public void setMenRam(int menRam) {
		this.menRam = menRam;
	}
	@Override
	public String toString() {
		return "Celular [modelo del celular= " + modelo + ", camara MPX= " + camara + ", almacenamiento= " + almacenamiento + ", color= "
				+ color + ", menRam= " + menRam + "]";
	}

}
