package com.ciclos;

import java.util.Iterator;

public class Ciclos4_DAC {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y 
		//segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
	int seg;
	int min;
	int hr;
	
		for (hr = 00; hr < 24; hr++) {
			for (min =00 ; min<60; min++) {
				for(seg=00; seg<60; seg++) {
					System.out.println(hr + ":"+min +":"+seg);
				}
			}
		}
		
		
		
		
		

	}

}
