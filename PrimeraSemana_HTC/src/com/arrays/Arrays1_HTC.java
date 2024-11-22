package com.arrays;

import java.util.Scanner;

public class Arrays1_HTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista = new int [10];
		int pos=1;
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		lista [0] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [1] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [2] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [3] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [4] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [5] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [6] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [7] = input.nextInt();
		System.out.println("Introduce otro número");
		lista [8] = input.nextInt();
		System.out.println("Introduce el último número");
		lista [9] = input.nextInt();
		
		
		for(int i:lista) {
			
			System.out.println("El número "+ i + " esta en la posición "+ pos + " del arreglo");
			//System.out.println(i);
			pos++;
		}
		
	}

}
