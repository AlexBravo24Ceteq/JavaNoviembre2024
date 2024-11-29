package com;

public class Perro {
	
	private String raza, nombre, sexo;
	private int edad; 
	
	public Perro(){
		
	}

	public Perro(String raza, String nombre, String sexo, int edad) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	

}
