package com;

public class animal {

	
	private String nombre;
	private boolean mamifero;
	private int numPatas;
	
	public animal(){
		
	}

	public animal(String nombre, boolean mamifero, int numPatas) {
		super();
		this.nombre = nombre;
		this.mamifero = mamifero;
		this.numPatas = numPatas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMamifero() {
		return mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "animal [nombre=" + nombre + ", mamifero=" + mamifero + ", numPatas=" + numPatas + "]";
	}
	
	
	
}
