package com.arrays;

import java.util.Scanner;

public class Arrays5_VMTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.
		Scanner entrada=new Scanner(System.in);
		String []productos=new String[5];
		float []precios=new float[5];
		for(int i=0;i<5;i++) {
			System.out.println("Introduce el producto número "+(i+1)+":");
			productos[i]=entrada.nextLine();
			System.out.println("Introduce el precio del producto número "+(i+1)+":");
			precios[i]=Float.parseFloat(entrada.nextLine());
		}for(int i=0;i<5;i++) {
			System.out.printf("Producto - %s, Precio - %.2f.\n",productos[i],precios[i]);
		}
	}
}
