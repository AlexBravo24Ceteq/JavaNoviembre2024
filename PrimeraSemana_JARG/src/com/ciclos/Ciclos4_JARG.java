package com.ciclos;

import java.util.Iterator;

public class Ciclos4_JARG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas=24;
		int minutos=60;
		int segundos=60;
		
		for (int i = 0; i<horas; i++) {
			for (int j = 0; j < minutos; j++) {
				for (int j2 = 0; j2 < segundos; j2++) {
					System.out.println(i+":"+j+":"+j2);
					
				}
			
				
			}
		}
		

	}

}
