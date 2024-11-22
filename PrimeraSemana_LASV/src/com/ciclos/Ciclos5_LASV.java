package com.ciclos;

import java.util.Scanner;

public class Ciclos5_LASV {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		// de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		// tendrá al cabo de un año si todo el dinero lo reinvierte?

		double inversion;
		int plazo;
		double ganancia;
		double total;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("interes mensual 2%");
		System.out.println("introduce el dinero que desa invertir ");
		inversion = entrada.nextInt();
		
		System.out.println("introduce el plazo a meses de cuanto desea invertir");
		plazo = entrada.nextInt();

		for (int i= 1; i <= plazo; i++){

			ganancia =(.02*inversion);
			
			inversion = inversion + ganancia;
			

			System.out.println("el mes " + i + " tiene una ganancia de: "+ ganancia);

		}
		System.out.println("ganania final del año "+ inversion);
		
	}

}
