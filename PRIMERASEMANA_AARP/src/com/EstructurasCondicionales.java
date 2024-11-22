package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {

		// Estructuras de decision if/else
		// Van a validar valores booleanos

		/*
		 * si(esto es verdadero) { ejecuta este bloque de codigo }si no /de otro modo{
		 * ejecuta este otro bloque de codigo }
		 */

		int x = 10;
		if (x < 10) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// String evalua= x<=10?"Cierto":"Falso";
		// System.out.println(evalua);

		// Evaluar condiciones compuestas con operadores logicos
		// AND,OR,NOT,DIFERENTE DE, IGUALDAD

		// AND- &&- Devuelve el primer bloque true cuando todas las condiciones se
		// cumplan
		System.out.println("probando Operador AND &&");
		if (x < 10 && x > 5) {
			System.out.println("Cierto");
		} else {
			System.out.println("falso");
		}

		// OR- || - Devuelve el primer bloque (true) cuando se cumpla al menos una
		// condicion

		System.out.println("probando Operador OR ||");
		if (x < 10 || x > 5) {
			System.out.println("Cierto");
		} else {
			System.out.println("falso");
		}

		// NOT- ! - Niega una condicion o cambia su valor de true a false y viceversa
		System.out.println("probando Operador NOT !");
		if (!(x < 10)) {// aqui volvemos una condicion falsa en verdadera
			System.out.println("Cierto");
		} else {
			System.out.println("falso");
		}

		// IGUALDAD- == - compara los valores entre si y si son iguales regresa el true
		System.out.println("probando Operador IGUALDAD ==");
		if (x == 10) {// aqui volvemos una condicion falsa en verdadera
			System.out.println("Cierto");
		} else {
			System.out.println("falso");
		}

		// DIFERENTE DE- != - Devuelve true cuando los valores a comparar son diferentes uno de otro
		System.out.println("probando Operador diferente de !=");
		if (x != 11) {// aqui volvemos una condicion falsa en verdadera
			System.out.println("Cierto");
		} else {
			System.out.println("falso");
		}

		
		//estructura if else anidada
		//ejemplo un pequeño juego de piedra, papel o tijera
		System.out.println("JUEGO PIEDRA, PAPEL O TIJERA");
		String game= "PIEDRA";
		
		if (game.equals("PIEDRA")) {
			System.out.println("PAPEL");
		}else if (game.equals("PAPEL")) {
			System.out.println("TIJERA");
		}else if (game.equals("TIJERA")) {
		System.out.println("PIEDRA");
		}else { 
			System.out.println("error del juego");
		}
		
		//Estructura switch case- evalua el cambio de una variable y nos 
		//permite ejecutar varias opciones segun sea el caso
		System.out.println("Probando estructura Switch case");
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
				System.out.println("error del juego");
				break;
		}
		
		
		
	}// cierre del main

}// cierre de clase
