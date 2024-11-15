package com.arrays;

public class Arrays5_IDP {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y 
		//otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.

		String[] productos= {"shampoo","gel","zapato","leche","cafe","cloro"}; 
		int [] precios= {50,20,1000,30,90,45};
		
		System.out.println("LISTA DE PRODUCTOS");
		
        for (int i = 0; i < productos.length; i++) {
        	
            System.out.println("Producto: " + productos[i] + ".... Costo: $"+ precios[i]);
        }
	}

}
