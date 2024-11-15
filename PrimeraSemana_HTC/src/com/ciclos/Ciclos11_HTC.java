package com.ciclos;

import java.util.Scanner;

public class Ciclos11_HTC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pon el alto");
		int h = input.nextInt();
		System.out.println("Pon el ancho");
		int w = input.nextInt();
		
		for (int i = 0; i < h; i++) {
			System.out.println("");
			for (int j = 0; j < w; j++) {
				System.out.print("* ");
			}
		}
		
	}

}
