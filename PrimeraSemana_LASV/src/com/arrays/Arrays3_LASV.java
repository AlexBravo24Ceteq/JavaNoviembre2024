package com.arrays;

import java.util.Scanner;

public class Arrays3_LASV {

	public static void main(String[] args) {
		
		 Scanner entrada=new Scanner(System.in);
	        
	        System.out.println("Escriba una frase");
	        
	        String frase=entrada.nextLine(); 
	        
	        char caracteres[]=new char[frase.length()];
	        
	        for(int i=0;i<frase.length();i++){
	            caracteres[i]=frase.charAt(i);
	            System.out.print(caracteres[i]);
	        }

	}

}
