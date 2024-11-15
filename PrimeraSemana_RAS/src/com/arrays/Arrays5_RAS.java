package com.arrays;

import java.util.Scanner;

public class Arrays5_RAS {

	public static void main(String[] args) {

		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos
		 */
		Scanner entrada = new Scanner(System.in);
		int tam;
		System.out.println("Cuentos productos desea ingresar? ");
		tam = entrada.nextInt();
		
		String producto[]; producto = new String[tam];
		String precios[]; precios = new String[tam];
		
		for (int i = 0; i < producto.length; i++) {
			System.out.println("Ingresa el producto "+(i+1));
			producto[i]=entrada.next();
		}
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Ingresa el precio del "+producto[i]+": ");
			precios[i]=entrada.next();
		}
		System.out.println("*******************************************");
		for (int i = 0; i < producto.length; i++) {
			
			 System.out.println("producto: "+producto[i]+"...precio: $"+precios[i]);
		}
		
		

	}

}
