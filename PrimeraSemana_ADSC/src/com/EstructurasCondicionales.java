package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {

		// Estructuras de desición "if" / "else"

		// Van a validar valores booleanos

		/*
		 * si (esto es verdadero){ ejecutar este bloque de código } si no / de otro modo
		 * { ejecuta este otro bloque de código }
		 */

		int x = 10;

		if (x < 11) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

//		String evalua = x<=10?"Cierto":"Falso";
//		System.out.println(evalua);
//		System.out.println(x<10?"Cierto":"Falso");

		// Evaluar condiciones compuestas con Operadores lógicos: AND, OR, NOT,
		// DIFERENTE DE, IGUALDAD

		// AND - && - Devuelve el primer bloque (true) cuando TODAS las condiciones se
		// cumplan

		System.out.println("Probando Operador AND &&");

		if (x <= 10 && x > 5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		// OR - || - Devuelve el primer bloque (true) cuando se cumpla al menos una condición

		System.out.println("Probando Operador OR ||");

		if (x < 10 || x > 5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		// NOT - ! - Niega una condición o cambia su valor de true a false y viceversa

		System.out.println("Probando Operador NOT !");

		if (!(x < 10)) { //Aquí volvemos una condición falsa en verdadera 
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		// IGUALDAR - == - Compara los valores entre sí, y si son iguales, devuelve true
		//Este operador de igualdad es recomendable más en valores numéricos enteros primitivos
		//Y el método .equals en valores de cadena de texto

		System.out.println("Probando Operador IGUALDAD ==");

		if (x == 10) { 
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//DIFERENTE DE - != Devuelve true cuando los cuando los valores a comparar son diferentes uno de otro
		
		
		// Estructura if else anidada
		
		//Ejemplo, un pequeño juego de PIEDRA, PAPEL, TIJERAS
		
		String game = "PIEDRA";
		
		if(game.equals("PIEDRA")) {
			System.out.println("PAPEL");
		}else if (game.equals("PAPEL")) {
			System.out.println("TIJERA");
		}else if (game.equals("TIJERA")) {
			System.out.println("PIEDRA");
		}else {
			System.out.println("Error de juego");
		}
		
		//Estructura switch case - evalua el cambio de una variable y nos permite ejecutar varias opciones seún sea el caso
		
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
			System.out.println("Error de juego");
			break;
		}



	} // cierre del main

} // cierre de la clase
