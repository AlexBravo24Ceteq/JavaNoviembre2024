package com;

public class iPhone {

	
	private double pantalla;
	private String modelo;
	private boolean FaceID;
	
	public iPhone() {
		
	}

	@Override
	public String toString() {
		return "iPhone [pantalla=" + pantalla + ", modelo=" + modelo + ", FaceID=" + FaceID + "]";
	}

	public iPhone(double pantalla, String modelo, boolean faceID) {
		super();
		this.pantalla = pantalla;
		this.modelo = modelo;
		FaceID = faceID;
	}

	public double getPantalla() {
		return pantalla;
	}

	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isFaceID() {
		return FaceID;
	}

	public void setFaceID(boolean faceID) {
		FaceID = faceID;
	}
	
	
}
