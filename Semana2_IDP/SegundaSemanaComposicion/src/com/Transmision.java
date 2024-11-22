package com;

public class Transmision {
	
	private String fabricante;
	private String tipo;
	private int Velocidades;
	public Transmision() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transmision(String fabricante, String tipo, int velocidades) {
		super();
		this.fabricante = fabricante;
		this.tipo = tipo;
		Velocidades = velocidades;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVelocidades() {
		return Velocidades;
	}
	public void setVelocidades(int velocidades) {
		Velocidades = velocidades;
	}
	@Override
	public String toString() {
		return "Transmision [fabricante=" + fabricante + ", tipo=" + tipo + ", Velocidades=" + Velocidades + "]";
	}
	
	
	

}
