package com.ciclos;

public class Ciclos7_HTC {

	public static void main(String[] args) {
		
		float inversion = 700;
		
		for (int i = 1; i <= 99 ; i++) {
			inversion*=1.02;
			if(inversion >= 1500) {
				System.out.println("Conseguiste más de 1500 hielocos en " + i + " meses");
				break;
			}
		}
		System.out.println(inversion);

	}

}
