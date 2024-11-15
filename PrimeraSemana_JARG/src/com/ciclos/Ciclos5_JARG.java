package com.ciclos;

public class Ciclos5_JARG {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		//tendrá al cabo de un año si todo el dinero lo reinvierte? 
		
		
		float dinero=1000;
		int interes=2;
		float total;
		
		
		System.out.println("Las ganancias por mes son ");
		
		for (int i = 1; i < 13; i++) {
			total=(dinero*interes)/100;
			dinero=dinero+total;
			System.out.println("Mes: "+i+": "+dinero);
			
			
			
		}
		
		System.out.println("Ganancia total= "+dinero);
		

	}

}
