package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 */

		int x = 10;

		System.out.println(x <= 8 ? "cierto" : "falso");
		;

		if (x < 10) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Evaluar condiciones compuestas con operadores logicos
		// AND, OR, NOT, Diferente de, Igual a

		// Operador AND

		System.out.println("probando operador AND &&");

		if (x < 10 && x > 5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Evaluar condiciones compuestas con operadores logicos
		// AND, OR, NOT, Diferente de, Igual a

		// Operador OR

		System.out.println("probando operador OR ||");

		if (x < 10 || x > 5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Evaluar condiciones compuestas con operadores logicos
		// AND, OR, NOT, Diferente de, Igual a

		// Operador NOT !

		System.out.println("probando operador NOT !");

		if (!(x < 10)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Evaluar condiciones compuestas con operadores logicos
		// AND, OR, NOT, Diferente de, Igual a

		// Operador Igaldad ==

		System.out.println("probando operador comparacion o igualddad ==");

		if ((x == 10)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Evaluar condiciones compuestas con operadores logicos
		// AND, OR, NOT, Diferente de, Igual a

		// Operador Diferente de !=

		System.out.println("probando operador Diferente de !=");

		if ((x != 10)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		// Condicion if else anidado
		
		String game= "papel";
		
		if(game.equals("piedra")) {
			System.out.println("papel");
			
		}else if(game.equals("papel")) {
			System.out.println("tijera");
			
		}else if(game.equals("tijera")) {
			System.out.println("piedra");
		}else {
			System.out.println("Error de juego");
		}
		
		//sentencia Switch
		
		switch (game) {
		case "piedra":
			System.out.println("papel");
			break;
		case "papel":
			System.out.println("tijera");
			break;	
		case "tijera":
			System.out.println("piedra");
			break;
		default: 
			System.out.println("Error de juego");
			break;
		}

	}

}
