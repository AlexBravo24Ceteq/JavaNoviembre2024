package com.arrays;

import java.util.Scanner;

public class Arrays3_HTC {

	public static void main(String[] args) {
		
		String words;
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Introduce una oración. Te dare sus caracteres");
		words = input.nextLine();
		
		char [] wordArray = new char [words.length()];
		
		for (char i:wordArray) {
			wordArray[count] = words.charAt(count);
			System.out.println("El caracter "+(count+1)+ " es " +wordArray[count]);
			count++;
		}
		
		// esta madre es .toCharArray() e_e
	}

}
