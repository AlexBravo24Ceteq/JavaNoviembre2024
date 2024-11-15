package com.ciclos;

public class Ciclos5_HTC {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		float inversion = 1000;
		
		for (int i = 1; i <= 12 ; i++) {
			inversion*=1.02;
			
		}
		System.out.println(inversion);
	}

}
