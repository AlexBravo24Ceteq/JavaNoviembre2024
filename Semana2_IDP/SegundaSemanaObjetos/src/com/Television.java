package com;

public class Television {
	
	private String marca;
	private int pulgadas;
	private String tipoDisplay;
	private String software;
	
	
	
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String marca, int pulgadas, String tipoDisplay, String software) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
		this.tipoDisplay = tipoDisplay;
		this.software = software;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getTipoDisplay() {
		return tipoDisplay;
	}

	public void setTipoDisplay(String tipoDisplay) {
		this.tipoDisplay = tipoDisplay;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", pulgadas=" + pulgadas + ", tipoDisplay=" + tipoDisplay + ", software="
				+ software + "]";
	}

	
	
}
