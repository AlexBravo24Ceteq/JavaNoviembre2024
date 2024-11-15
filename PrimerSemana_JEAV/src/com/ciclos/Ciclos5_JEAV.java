package com.ciclos;

public class Ciclos5_JEAV {

	public static void main(String[] args) {

		double montoInicial = 1000.00; 
		double tasaInteresMensual = 0.02; 
		
		double monto = montoInicial; 
		
		for (int i = 1; i <= 12; i++) { 
			monto += monto * tasaInteresMensual; 
			} 
		
		System.out.println("Monto despues de un año: " + monto);

	}

}
