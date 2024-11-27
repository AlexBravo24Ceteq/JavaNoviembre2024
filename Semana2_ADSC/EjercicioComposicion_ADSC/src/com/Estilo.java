package com;

public class Estilo {
	private double label;
	
	public Estilo() {
		
	}

	public Estilo(double label) {
		super();
		this.label = label;
	}

	public double getLabel() {
		return label;
	}

	public void setLabel(double label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Estilo [label=" + label + "]";
	}
	
	
}
