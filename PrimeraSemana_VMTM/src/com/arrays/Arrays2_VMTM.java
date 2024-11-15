package com.arrays;

public class Arrays2_VMTM {
	//2. Crea un array de números de 100 posiciones, que contendrá los números del
	//1 al 100. Obtén la suma de todos ellos y la media
	public static void main(String[] args) {
		int []numeros=new int[100];
		int suma=0;
		for(int i=0;i<100;i++) {
			numeros[i]=i+1;
			suma+=numeros[i];
		}
		float promedio=(float)suma/100;
		System.out.println("La suma es: "+suma);
		System.out.printf("El promedio/media aritmética es: %.2f",promedio);
	}
}
