package com;

public class RamCel {
	private String tipo;
	private int campacidad;
	
	public RamCel() {
		
	}

	public RamCel(String tipo, int campacidad) {
		super();
		this.tipo = tipo;
		this.campacidad = campacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCampacidad() {
		return campacidad;
	}

	public void setCampacidad(int campacidad) {
		this.campacidad = campacidad;
	}

	@Override
	public String toString() {
		return "\nRamCel [tipo= " + tipo + ", campacidad= " + campacidad + "]";
	}

}
