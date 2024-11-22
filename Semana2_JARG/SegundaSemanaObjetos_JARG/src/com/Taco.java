package com;

public class Taco {
private String ingPrincipal;
private int numTortillas;
private boolean cebolla;
private boolean cilantro;
private String Salsa;

public Taco() {
	

}


public Taco(String ingPrincipal, int numTortillas, boolean cebolla, boolean cilantro, String salsa) {
	super();
	this.ingPrincipal = ingPrincipal;
	this.numTortillas = numTortillas;
	this.cebolla = cebolla;
	this.cilantro = cilantro;
	Salsa = salsa;
}


@Override
public String toString() {
	return "Taco [ingPrincipal=" + ingPrincipal + ", numTortillas=" + numTortillas + ", cebolla=" + cebolla
			+ ", cilantro=" + cilantro + ", Salsa=" + Salsa + "]";
}


public String getIngPrincipal() {
	return ingPrincipal;
}

public void setIngPrincipal(String ingPrincipal) {
	this.ingPrincipal = ingPrincipal;
}

public int getNumTortillas() {
	return numTortillas;
}

public void setNumTortillas(int numTortillas) {
	this.numTortillas = numTortillas;
}

public boolean isCebolla() {
	return cebolla;
}

public void setCebolla(boolean cebolla) {
	this.cebolla = cebolla;
}

public boolean isCilantro() {
	return cilantro;
}

public void setCilantro(boolean cilantro) {
	this.cilantro = cilantro;
}

public String getSalsa() {
	return Salsa;
}

public void setSalsa(String salsa) {
	Salsa = salsa;
}
	

}

