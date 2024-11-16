package com.ciclos;

public class Ciclos5_AED {

	public static void main(String[] args) {
	
		// Ejercicio 5
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		// de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		// tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		
		double inversionInicial = 1000.0; // Inversión inicial en dólares
        double tasaInteres = 0.02; // 2% de interés mensual
        int meses = 12; // 12 meses en un año
        
        double montoAcumulado = inversionInicial;
        
        for (int i = 1; i <= meses; i++) {
            montoAcumulado += montoAcumulado * tasaInteres;
            System.out.printf("Mes %d: $%.2f\n", i, montoAcumulado);
        }
        
        System.out.printf("\nLa cantidad total después de un año es: $%.2f\n", montoAcumulado);
    
	}
}
