package com.ciclos;

import java.util.Iterator;

public class Ciclos4_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Simular el comportamiento de un reloj digital, imprimiendo la hora, 
//		minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
//		horas
		
		int hora= 23;
		int minutos = 60;
		int segundos=60;

		for (int i = 0; i <= hora; i++) {
			for (int j = 0; j < minutos; j++) {
				for (int j2 = 0; j2 < segundos; j2++) {
					System.out.println(i + ": " +j +": "+j2 );
				}
			}
		}
	}

}
