package com;

public abstract class Calculadora {

	private String marca;
	private int precio;
	private boolean consciente;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, int precio, boolean consciente) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.consciente = consciente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isConsciente() {
		return consciente;
	}

	public void setConsciente(boolean consciente) {
		this.consciente = consciente;
	}

	@Override
	public String toString() {
		return "Marca= " + marca + ", Precio= " + precio + " pesos, y consciencia= " + consciente + ".";
	}
	
	public abstract void sum();
	public abstract void mult();
	public abstract void div();
	public abstract void abst();
	
	
}
