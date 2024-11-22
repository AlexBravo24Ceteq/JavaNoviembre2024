package com;

public class Camara {
	
	private int tracera;
	private int frontal;
	
	public Camara() {
		
	}

	public Camara(int tracera, int frontal) {
		super();
		this.tracera = tracera;
		this.frontal = frontal;
	}

	public int getTracera() {
		return tracera;
	}

	public void setTracera(int tracera) {
		this.tracera = tracera;
	}

	public int getFrontal() {
		return frontal;
	}

	public void setFrontal(int frontal) {
		this.frontal = frontal;
	}

	@Override
	public String toString() {
		return "\nCamara [tracera de = " + tracera + "Mpx" + ", frontal de = " + frontal + "Mpx" + "]";
	}

}
