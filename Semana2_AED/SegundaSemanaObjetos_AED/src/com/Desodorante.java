package com;

public class Desodorante {
	
	private String marca;
	private boolean parahombre;
	private boolean paramujer;
	private String presentacion;
	private int cantcontenido;
	
	public Desodorante () {
		
	}

	public Desodorante(String marca, boolean parahombre, boolean paramujer, String presentacion, int cantcontenido) {
		super();
		this.marca = marca;
		this.parahombre = parahombre;
		this.paramujer = paramujer;
		this.presentacion = presentacion;
		this.cantcontenido = cantcontenido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isParahombre() {
		return parahombre;
	}

	public void setParahombre(boolean parahombre) {
		this.parahombre = parahombre;
	}

	public boolean isParamujer() {
		return paramujer;
	}

	public void setParamujer(boolean paramujer) {
		this.paramujer = paramujer;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public int getCantcontenido() {
		return cantcontenido;
	}

	public void setCantcontenido(int cantcontenido) {
		this.cantcontenido = cantcontenido;
	}

	@Override
	public String toString() {
		return "Desodorante [marca=" + marca + ", parahombre=" + parahombre + ", paramujer=" + paramujer
				+ ", presentacion=" + presentacion + ", cantcontenido=" + cantcontenido + "]";
	}

}
