package com.arrays;

public class Arrays2_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Crea un array de números de 100 posiciones, que contendrá los números del 
//		 1 al 100. Obtén la suma de todos ellos y la media. 
		
		int [] numeros = new int [100];
		double suma = 0;
		double promedio=0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros [i]=i+1;
			suma = suma + numeros [i];
			promedio = suma/numeros.length;
//	 		System.out.println("la suma de todos los numeros es:"+ suma);
//			System.out.println(numeros [i]);
		}
		System.out.println("la suma de todos los numeros es:"+ suma +" y la media es: " + promedio);
		

		}
	
	}


