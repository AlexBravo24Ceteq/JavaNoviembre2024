package com;

public class Boleto {
	
	int numBoleto;
	String destinoFinal;
	boolean conVentana;
	
	public Boleto() {
		super();
	}

	public Boleto(int numBoleto, String destinoFinal, boolean conVentana) {
		super();
		this.numBoleto = numBoleto;
		this.destinoFinal = destinoFinal;
		this.conVentana = conVentana;
	}

	public int getNumBoleto() {
		return numBoleto;
	}

	public void setNumBoleto(int numBoleto) {
		this.numBoleto = numBoleto;
	}

	public String getDestinoFinal() {
		return destinoFinal;
	}

	public void setDestinoFinal(String destinoFinal) {
		this.destinoFinal = destinoFinal;
	}

	public boolean isConVentana() {
		return conVentana;
	}

	public void setConVentana(boolean conVentana) {
		this.conVentana = conVentana;
	}

	@Override
	public String toString() {
		return "Boleto [numBoleto=" + numBoleto + ", destinoFinal=" + destinoFinal + ", conVentana=" + conVentana + "]";
	}
	
	

}
