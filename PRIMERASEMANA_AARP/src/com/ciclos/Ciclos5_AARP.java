package com.ciclos;

public class Ciclos5_AARP {

	public static void main(String[] args) {
		// Ejercicio 5: Una persona desea invertir $1000 en un banco,
		//el cual le otorga un 2% de interes mensual. ¿Cual será la cantidad de dinero
		//que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		int interes=2;
		float inversion= 1000;
		float ganancia;
		
		//se determina la condicion y el incremento para el ciclo for contemplando 12 meses del año
		
		for (int i = 1; i < 13; i++) {
			ganancia= (inversion*interes)/100;
			inversion= inversion+ganancia;
		}System.out.println(inversion);
		
		//este programa no me salia ya qye había declarado float ganancia= (inversion*interes)/100;
		//y me salia 1240 asi que movi eso después del ciclor for como el compañero y ya me salió
		
	}

}
