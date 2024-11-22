package com.arrays;

import java.util.Scanner;

public class Arrays1_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Crea un array de 10 posiciones de números con valores pedidos por teclado. 
//		Muestra por consola el índice y el valor al que corresponde.
		
		int [] numeros = new int [10];
		
		int uno;
		int dos;
		int tres;
		int cuatro;
		int cinco;
		int seis; 
		int siete;
		int ocho; 
		int nueve;
		int diez;
		System.out.println("Introduce un numero ");
		Scanner entrada = new Scanner (System.in);
		uno= entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		dos=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		tres=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		cuatro=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		cinco=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		seis=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		siete=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		ocho=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		nueve=entrada.nextInt();
		
		System.out.println("Introduce un numero ");
		diez=entrada.nextInt();
		
		
//	//FORMA REDUCIDA
		int []numeros2= {uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez};
////		
////		for (int i = 0; i < numeros.length; i++) {
////			System.out.println("introduce un numero");
////			
////			numeros= entrada.nextInt();
//		}
		
		//condicional		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("INDICE "+i+ " VALOR: "+numeros2[i]);
		}
		

	}

}
