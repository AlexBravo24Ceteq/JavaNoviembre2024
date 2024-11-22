package com;

public class Celular {
	
	private String tipoPantalla;
	private int gbAlmacenamiento;
	private int mpCamara;
	
	public Celular() {
		super();
	}

	public Celular(String tipoPantalla, int gbAlmacenamiento, int mpCamara) {
		super();
		this.tipoPantalla = tipoPantalla;
		this.gbAlmacenamiento = gbAlmacenamiento;
		this.mpCamara = mpCamara;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	public int getGbAlmacenamiento() {
		return gbAlmacenamiento;
	}

	public void setGbAlmacenamiento(int gbAlmacenamiento) {
		this.gbAlmacenamiento = gbAlmacenamiento;
	}

	public int getMpCamara() {
		return mpCamara;
	}

	public void setMpCamara(int mpCamara) {
		this.mpCamara = mpCamara;
	}

	@Override
	public String toString() {
		return "Celular [tipoPantalla=" + tipoPantalla + ", gbAlmacenamiento=" + gbAlmacenamiento + ", mpCamara="
				+ mpCamara + "]";
	}
	
	
	
	

}
