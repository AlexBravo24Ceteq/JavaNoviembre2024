package com;

public abstract class Calculadora {

	public String marca;
	public String color;
	public boolean baterias;
	
	
	public Calculadora() {}

	
	
	
	
	public Calculadora(String marca, String color, boolean baterias) {
		super();
		this.marca = marca;
		this.color = color;
		this.baterias = baterias;
	}





	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public boolean isBaterias() {
		return baterias;
	}





	public void setBaterias(boolean baterias) {
		this.baterias = baterias;
	}





	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", baterias=" + baterias + "]";
	}





	public abstract void sumar (int a, int b);
	
	public abstract void restar (int a, int b);
	
	public abstract void multiplicar (int a, int b);
	
	public abstract void dividir (int a, int b);
	
	
	
	
	
	
}
