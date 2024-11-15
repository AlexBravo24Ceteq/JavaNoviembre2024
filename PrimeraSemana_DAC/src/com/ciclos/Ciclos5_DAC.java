package com.ciclos;

import java.util.Scanner;

public class Ciclos5_DAC {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?

		double inicio;
		double interes = .02;
		double total;
		
		
		
		
		
		
		
		Scanner din =new Scanner (System.in);
		
		System.out.println("Ingrese el monto inicial");
		inicio = din.nextInt();
		
		
		for (int i = 1; i < 13; i++) {
			
			System.out.println("Mes "+i + " " + inicio);
			total = inicio*interes;
			
			inicio = inicio+total;
			
			
			
			
			
		}
			
			
		}
			
		
		
	}
