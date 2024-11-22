package com;

public class Carro {
	private String color;
	private String marca;
	private int year;
	
	public Carro() {
		
	}

	public Carro(String color, String marca, int year) {
		super();
		this.color = color;
		this.marca = marca;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Carro [color=" + color + ", marca=" + marca + ", year=" + year + "]";
	}
	
	

}
