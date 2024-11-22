package com.ciclos;

public class Ciclos4_IDP {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital,
		// imprimiendo la hora, minutos y segundos de un día
		// desde las 00:00:00 horas hasta las 23:59:59 horas

		//int segundo;
		//int minuto;
		//int hora;
		
		System.out.println("RELOJ");
		
		for(int hora = 0; hora<= 23; hora ++) {
			for(int minuto= 0; minuto<=59; minuto++) {
				for(int segundo=0; segundo<=59; segundo++) {
				 System.out.println(hora+":"+ minuto+":"+segundo);
				}
			}
		}
	}
}
	
