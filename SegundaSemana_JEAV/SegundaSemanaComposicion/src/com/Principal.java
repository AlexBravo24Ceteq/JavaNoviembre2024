package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Almacenamiento kingston = new Almacenamiento ("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", 4.5);
		RAM adata = new RAM ("Adata", "DDR4", 2333);
		
		
		
		Laptop miLaptop = new Laptop("HP","40244","Plata", kingston, intel, adata );
		
		
		System.out.print(miLaptop);
	}

}
