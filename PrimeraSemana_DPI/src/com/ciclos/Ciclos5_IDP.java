package com.ciclos;

public class Ciclos5_IDP {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. 
		//¿Cuál será la cantidad de dinero que esta persona tendrá al 
		//cabo de un año si todo el dinero lo reinvierte?

		float inversion = 1000;
		float interes;
		int meses=1;
		
		while(meses<13) {
			interes = (inversion*2)/100;
			inversion= inversion+ interes;
			System.out.println( "el interes recibido en el mes "+ meses+" es de:"+interes+ "  dando un saldo de: "+ inversion);
     		meses= meses+1;
		}
		
	}

}
