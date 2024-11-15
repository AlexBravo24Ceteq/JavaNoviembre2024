package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays5_DAC {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos
		//y otro para mostrar sus respectivos precios. Muestra en consola
		//la lista de productos y sus precios. Por lo menos 5 productos o artículos.

		  
		int np;
		
		Scanner cant =new Scanner(System.in);
		System.out.println("Introduzca el No de productos");
		np =cant.nextInt();
		
		String[] productos = new String [np];
		double[] costo = new double [np];
		
		String pr;
		double co;
		int x = 1 ;
		
		for (int i = 0; i <np; i++) {
			
			
			
			Scanner prod = new Scanner(System.in);
			System.out.println("Introduce el producto No "+ x++);
			pr=prod.nextLine();
			
			productos [i] = pr;
			
			Scanner cos = new Scanner(System.in);
			System.out.println("Introduce el precio del producto");
			co=cos.nextDouble();
			
			costo[i]= co;
			
			
		}
		
		for (int i = 0; i < costo.length; i++) {
			
			System.out.println(productos[i]+ " tene un costo de " + costo[i]);
			
			
		}
		
		
		System.out.println("-------------------FIN DEL PROGRAMA--------------");
		
		
		
	}

}
