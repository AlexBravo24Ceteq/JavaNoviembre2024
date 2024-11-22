package com;

public class Principal {

	public static void main(String[] args) {
		// Composición. Un objeto es atributo de otro. Antes de crear los más grandes, debemos crear los más pequeños.
		
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", 4.3, 8);
		Ram adata = new Ram("AData", "DDR4", 2333);
		
		//ahora puedo crear la laptop.
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", kingston, intel, adata); //Checate, se lleno con los que tenía disponibles.
		
		System.out.println(hp);
		
		
	}

}
