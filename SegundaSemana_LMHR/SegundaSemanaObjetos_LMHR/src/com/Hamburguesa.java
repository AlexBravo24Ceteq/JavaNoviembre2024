package com;

public class Hamburguesa {
	
	private int carnes;
	private boolean cebolla;
	private boolean pepinillos;
	private boolean tomate;
	private boolean queso;
	
	public Hamburguesa () {
		
	}

	@Override
	public String toString() {
		return "Hamburguesa [carnes=" + carnes + ", cebolla=" + cebolla + ", pepinillos=" + pepinillos + ", tomate="
				+ tomate + ", queso=" + queso + "]";
	}

	public Hamburguesa(int carnes, boolean cebolla, boolean pepinillos, boolean tomate, boolean queso) {
		super();
		this.carnes = carnes;
		this.cebolla = cebolla;
		this.pepinillos = pepinillos;
		this.tomate = tomate;
		this.queso = queso;
	}
	
	
	
	

}
