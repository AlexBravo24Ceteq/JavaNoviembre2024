package com.arrays;

public class Arrays5_LASV {

	public static void main(String[] args) {
		//  Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.

		String[] productos = {"Manzanas", "Naranjas", "Leche", "Pan", "Queso"};
		double[] precios = {1.99, 2.49, 3.89, 1.29, 5.99};
		
		System.out.println("Lista de productos y precios:");
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		}
		
	}

}
