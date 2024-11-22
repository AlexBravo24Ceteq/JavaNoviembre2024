package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String modo = null;
		
		Scanner input = new Scanner(System.in);
		Cientifica calculos = new Cientifica("CASIO",2,false);
		
		System.out.println(calculos);
		System.out.println("¿Que operación deseas? Introduce SUMA, RESTA, MULTIPLICACION, DIVSION.");
		modo = input.next();
		
		switch(modo) {
		case "SUMA" :
			calculos.sum();
			break;
		case "RESTA" :
			calculos.abst();
			break;
		case "MULTIPLICACION" :
			calculos.mult();
			break;
		case "DIVISION" :
			calculos.div();
			break;
			
		
		}
		
		//calculos.mult();
		
		
		
	}

}
