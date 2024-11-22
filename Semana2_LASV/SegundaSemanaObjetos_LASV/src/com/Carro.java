package com;

public class Carro {
	
	private String modelo;
	private int año;
	private String color;
	public Carro(String modelo, int año, String color) {
		super();
		this.modelo = modelo;
		this.año = año;
		this.color = color;
	}
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "[Modelo del carro= " + modelo + ", año= " + año + ", color de carro = " + color + "]";
	}
	

}
