package com;

public class Presentacion {
	private double type;
	
	public Presentacion() {
		
	}

	public Presentacion(double type) {
		super();
		this.type = type;
	}

	public double getType() {
		return type;
	}

	public void setType(double type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Presentacion [type=" + type + "]";
	}
	
}
