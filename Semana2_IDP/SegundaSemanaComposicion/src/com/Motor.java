package com;

public class Motor {

	private String modelo;
	private int cilindros;
	private String combustible;
	
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motor(String modelo, int cilindros, String combustible) {
		super();
		this.modelo = modelo;
		this.cilindros = cilindros;
		this.combustible = combustible;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor [modelo=" + modelo + ", cilindros=" + cilindros + ", combustible=" + combustible + "]";
	}
	
	
}
