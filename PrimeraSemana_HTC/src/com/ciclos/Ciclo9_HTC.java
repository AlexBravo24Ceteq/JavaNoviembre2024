package com.ciclos;

import java.util.Scanner;

public class Ciclo9_HTC {

	public static void main(String[] args) {
		
		int firstN;
		int secondN;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca Primer Número");
		firstN = input.nextInt();
		System.out.println("Introduzca Segundo Número");
		secondN = input.nextInt();
		
		int checker = firstN+1;
		// int [] lista = new int [(firstN-secondN)-1];
		// int filler = 0;
		
		for(int i = firstN; i < secondN-1; i++) {
			
			if(checker%2 == 0) {
				System.out.println(checker);
				checker++ ;
				
					
			} else {
				checker++;
			}
			
		}
		
	}

}
