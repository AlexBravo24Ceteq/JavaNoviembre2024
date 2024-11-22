package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// estructurs de decision if else
		// validan valores booleanos
		// si es verdadero se abre llave y se ejecuta bloue de codigo
		int x = 10;
		System.out.println("probando if operador normal");
		if (x < 10) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
//el operador and nos pide que las dos condiciones se cumplan
		System.out.println("probando operador AND &&");

		if (x < 10 && x > 5) {
			System.out.println("cierto");
		} else {
			System.out.println("Falso");
		}

		// Probando operador OR || si una de las condiciones se cumple es verdadero
		System.out.println("probando operador OR ||");

		if (x < 10 || x > 5) {
			System.out.println("cierto");
		} else {
			System.out.println("Falso");
		}

		// Probando operador NOT !, este operador niega o cambia de true a false
		System.out.println("probando operador NOT !");

		if (!(x < 10)) {
			System.out.println("cierto");
		} else {
			System.out.println("Falso");
		}

		// Probando operador igualdad ==, este operador se recomienda en vlores
		// numericos
		// y el metodo equals en cadena de texto
		System.out.println("probando operador igualdad ==");

		if (x == 10) {
			System.out.println("cierto");
		} else {
			System.out.println("Falso");
		}

		// operador de diferente != devuelve verdadero si los valores son diferentes
		System.out.println("probando operador desigual o diferente !=");

		if (x != 10) {
			System.out.println("cierto");
		} else {
			System.out.println("Falso");
		}
		

		System.out.println("probando juego con if anidado");
		//juego de piedra papel tijeras
		
		String game="piedra";
		if (game.equals("piedra")){
			System.out.println("papel");			
		}else if(game.equals("papel")){
			System.out.println("tijera");						
		}else if(game.equals("tijera")) {
			System.out.println("piedra");
		}else {
			System.out.println("error de juego");
		}
		
		System.out.println("probando juego con switch");
		//estructura switch case evalua multiples opciones
		
		switch(game) {
		case "piedra":
			System.out.println("papel");
			break;
		case "papel":
			System.out.println("tijeras");
			break;
		case "tijera":
			System.out.println("piedra");
			break;
		default:
			System.out.println("error de juego");
			break;
		
		
		
		}
	}

}
