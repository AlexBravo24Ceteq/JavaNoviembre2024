package com;

public class SistemaDeSonido {
	
	private String marca;
	private boolean bluetoot;
	private double canales;
	public SistemaDeSonido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SistemaDeSonido(String marca, boolean bluetoot, double canales) {
		super();
		this.marca = marca;
		this.bluetoot = bluetoot;
		this.canales = canales;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isBluetoot() {
		return bluetoot;
	}
	public void setBluetoot(boolean bluetoot) {
		this.bluetoot = bluetoot;
	}
	public double getCanales() {
		return canales;
	}
	public void setCanales(double canales) {
		this.canales = canales;
	}
	@Override
	public String toString() {
		return "SistemaDeSonido [marca=" + marca + ", bluetoot=" + bluetoot + ", canales=" + canales + "]";
	}
	
	

}
