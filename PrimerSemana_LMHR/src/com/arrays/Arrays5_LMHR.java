package com.arrays;

import java.util.Iterator;

public class Arrays5_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos.
		String [] productos = {"producto 1", "producto2", "producto3", "producto 4", "producto5"};
		double [] precios = {14.50, 29.75, 35.30, 5.9,124.45};
		
	for (int i = 0; i < productos.length; i++) {
		System.out.println(productos[i]+ ":$" + precios [i]);
	}

	}

}
