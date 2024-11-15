package com;

import java.util.Scanner;
public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras if/else
		/*
		 * si (esto es verdadero){
		 * haz esto
		 * } si no/de otro modo {
		 * haz esto otro
		 * }
		 */
		
		int x = 10;
		if (x<10) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//System.out.println(x<10?"Cierto":"Falso");
		
		//Operadores logicos ahora. Como skyrim, lol
		// AND  - && - Si todo es verdad, lo pasa
		
		System.out.println("Probando AND");
		if (x<10 && x>5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		// OR  - || - Si al menos una cosa es verdad, pasa.
		System.out.println("Probando OR");
		if (x<10 || x>5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		// NOT  - ! - Niega una condición, volviendola false o viceversa, y luego pasa.
		System.out.println("Probando NOT");
		if (!(x<11)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// EQUAL - == - Si es igual, pasa.
		System.out.println("Probando EQUAL");
		if (x == 11) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// NOT EQUAL - != - Si no es igual, pasa.
		System.out.println("Probando NOT EQUAL");
		if (x != 11) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		
		//Scanner playerChoice = new Scanner(System.in);
		System.out.println("Tiempo de Jueguitos");
		System.out.println("Con IF anidado");
		String game = "PIEDRA";
		//If ELSE anidados.
		if (game.equals("PIEDRA")) {
			System.out.println("PAPEL");
		}else if (game.equals("PAPEL")) {
			System.out.println("TIJERA");
		}else if (game.equals("TIJERA")) {
			System.out.println("PIEDRA");
		}else {
			System.out.println("Te mamaste");
		}
		
		//Switch
		System.out.println("Con SWITCH CASE");
		switch (game) {
		case "PIEDRA":
			System.out.println("PAPEL");
			break;
		case "PAPEL":
			System.out.println("TIJERA");
			break;
		case "TIJERA":
			System.out.println("PIEDRA");
			break;
		default:
			System.out.println("Te mamaste");
			break;
		}
		
	}

}
