package com.ciclos;

public class Ciclos7_JEAV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inversion = 700;
		double interes = 0.02;
		
		int total = inversion;
		
		int i = 1;
		
		while(total <= 1500) {
			total = (int) (total + inversion*interes);
			i++;
		}
		
		System.out.print("Logrará juntar mas de 1500 en " + i + " meses (total exacto: " + total + ")");

	}

}
