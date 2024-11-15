package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estructuras de decision If/ else
		/*
		 * si (esto es verdadero) ejecuta este bloque de codigo
		 * 
		 * si no / de otro modo ejecuta este otro bloque de codigo
		 */

		int x = 10;
		if (x < 10) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		// System.out.println(x<=10?"cierto": "falso");

		// evaluar condiciones compuestas con Operadores Logicos
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD

		// AND - &&- devuelve el primer bloque (true) cuando todas las condidicones se
		// cumplan
		System.out.println("probando operador AND &&");
		if (x <= 10 && x > 5) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// OR || devuelve el primer bloque (true) cuando se
		// cumpla AL MENOS UNA condicion

		System.out.println("probando operador OR");
		if (x < 10 || x > 5) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// NOT ! - NUEGA SU CONDICION O CAMBIA SU VALOR DE TRUE A FALSE Y VICEVERSA
		// cumpla AL MENOS UNA condicion

		System.out.println("probando operador NOT");
		if (!(x < 10)) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		// IGUALDAD ==  - Compara los valores entre si y si son iguales devuelve true
		//este operador es recomendabkle en valores numericos enteros primitivos y el .equals en valores de cadena de texto

		System.out.println("probando operador IGUALDAD");
		if (x == 10) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		// DIFERENTE DE != -  dEVUELVE TRUE CUANDO LOS VALORES A COMPARAR son diferentes uno de otro  
		//
		
		System.out.println("probando operador DIFERENTE DE");
		if (x != 11 ) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		// estructura if/else anidada
		
		//ejemplo un juego de piedra papel tijera 
		System.out.println("Juego piedra papel o tijera");
		String game ="piedra";
		if (game.equals("piedra")) {
			System.out.println("papel");
		}else if (game.equals("papel")) {
			System.out.println(game.equals("Tijera"));
		}else if (game.equals("Tijera")) {
				System.out.println("piedra");
		} else {
			System.out.println("error de juego");
		}
//		
		//Estructura Switch case - evalua el cambio de una variable
		//nos permite ejecutar varias opciones segun el caso
		System.out.println("probando estructura switch case");
		switch (game) {
		case "piedra":
			System.out.println("papel");
			break;
		case "papel":
			System.out.println("Tijera");
			break;
		case "tijera":
			System.out.println("piedra");
			break;
		default:
			System.out.println("error de juego");
			break;
		} 


	} // cierre main

} // cierre clase
