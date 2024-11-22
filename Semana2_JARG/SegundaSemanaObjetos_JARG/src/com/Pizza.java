package com;

public class Pizza {

	private int rebanadas;
	private String sabor;
	private String tamaño;
	
	public Pizza() {
		
	}
	

	public Pizza(int rebanadas, String sabor, String tamaño) {
		super();
		this.rebanadas = rebanadas;
		this.sabor = sabor;
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "Pizza [rebanadas=" + rebanadas + ", sabor=" + sabor + ", tamaño=" + tamaño + "]";
	}


	public int getRebanadas() {
		return rebanadas;
	}


	public void setRebanadas(int rebanadas) {
		this.rebanadas = rebanadas;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	
}
