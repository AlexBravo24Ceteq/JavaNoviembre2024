package com.ciclos;

public class Ciclos10_HTC {

	public static void main(String[] args) {
		
		int [] list = {1,-2,3,-4,-5,6,7,-8,9,10};
		int sumImpairs = 0;
		int sumPositives = 0;
		
		for(int i = 0; i < list.length; i++) {
			
			if(list[i]%2 == 0 && list[i]>0) {
				System.out.println(list[i] + " es par y positivo.");
				sumPositives += list[i];
					
			} else if (list[i]%2 == 0 && list[i]<0){
				System.out.println(list[i] + " es par y negativo.");
				
			}else if (list[i]>0) {
				System.out.println(list[i] + " es impar y positivo.");
				sumPositives += list[i];
				sumImpairs += list[i];
			}else if (list[i]<0) {
				System.out.println(list[i] + " es impar y negativo.");
				sumImpairs += list[i];
			}
			
		}

		System.out.println("La sumatoria de los positivos es "+ sumPositives);
		System.out.println("La sumatoria de los impares es "+ sumImpairs);
	}
}