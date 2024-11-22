package com;

public class Perro {

	private String raza;
	private String nombre;
	private String color;
	private int edad;
	
	
	
	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Perro(String raza, String nombre, String color, int edad) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", color=" + color + ", edad=" + edad + "]";
	}
	
	
	
}
