package com;

public class Carro {

private int llantas;
private String color;
private String modelo;

public Carro() {
	
}


public Carro(int llantas, String color, String modelo) {
	super();
	this.llantas = llantas;
	this.color = color;
	this.modelo = modelo;
}


@Override
public String toString() {
	return "Carro [llantas=" + llantas + ", color=" + color + ", modelo=" + modelo + "]";
}


public int getLlantas() {
	return llantas;
}


public void setLlantas(int llantas) {
	this.llantas = llantas;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}



}
