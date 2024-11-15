package com.arrays;

public class Arreglos5_JEAV {

	public static void main(String[] args) {

		String[] productos = {"Manzanas", "Naranjas", "Leche", "Pan", "Huevos"};
		double[] precios = {15.50, 12.30, 18.75, 25.00, 28.90};

		System.out.println("Lista de productos y sus precios:");
		
		for (int i = 0; i < productos.length; i++) { 
			System.out.println(productos[i] + ": $" + precios[i]); 
			}
	}

}
