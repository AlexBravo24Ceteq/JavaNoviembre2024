package com;

public class Mochila {

	String marcaMochila;
	int numBolsas;
	String color;
	

	public Mochila() {
		super();
	}
	
	public Mochila(String marcaMochila, int numBolsas, String color) {
		super();
		this.marcaMochila = marcaMochila;
		this.numBolsas = numBolsas;
		this.color = color;
	}

	public String getMarcaMochila() {
		return marcaMochila;
	}

	public void setMarcaMochila(String marcaMochila) {
		this.marcaMochila = marcaMochila;
	}

	public int getNumBolsas() {
		return numBolsas;
	}

	public void setNumBolsas(int numBolsas) {
		this.numBolsas = numBolsas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mochila [marcaMochila=" + marcaMochila + ", numBolsas=" + numBolsas + ", color=" + color + "]";
	}

	
}
