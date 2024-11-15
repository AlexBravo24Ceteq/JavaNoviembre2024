package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructurtas de decision if/else

		// van a validar valores booleanos

		/*
		 * si (esto es verdadero){ ejecuta este bloque de codigo }si no/ else { ejecuta
		 * este otro bloque de codigo }
		 * 
		 */

		int x = 10;

		if (x < 10) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

//		System.out.println(x<=10?"ciento":"falso");
//		
//		string evalua = x<=10?"cierto":"falso";
//		System.out.println(evalua);

		// evaluar condiciones comppuestas con operadores logicos
		// AND, OR, NOT, diferente de, igualdad

		// AND - && devuelve el primer bloque (true)cuando TODAS las condiciones se
		// cumplen

		System.out.println("pprobando operador AND &&");
		if (x < 10 && x > 5) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// OR - || devuelve el primer bloque (true)cuando cumpla almenos una condicion

		System.out.println("pprobando operador OR || ");
		if (x < 10 || x > 5) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// NOT - ! devuelve el primer bloque (true)esta condicion cambia su valor de true

		System.out.println("pprobando operador NOT ! ");
		if (!(x < 10)) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// Igualdad - == compara los valores entre si y si son iguales devuelve true
		// este operador de igualdad es mas recomendale en valores numericos primitivos
		// y el metodo .equals en valores de cadena de texto

		System.out.println("pprobando operador Igualdad == ");
		if (x == 10) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		
		// Diferente de - != Devuelve true cuando los valores a comparar son difgerentes uno de otro
		
		System.out.println("pprobando operador Diferente de  != ");
		if (x != 11) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		
		
		//estructura if Else anidada
		// ejemplo un pequeño juego de priedra, papel o tijera
		
		String game = "tijera";
		if (game.equals("piedra")){
			System.out.println("papel");
		}else if (game.equals("papel")) {
			System.out.println("tijera");
		}else if (game.equals("tijera")) {
			System.out.println("piedra");
		}else {
			System.out.println("error de juego");
		}
		
		//estructura Switch case - evalua el cambio de una variable y nos permite ajecutar
		//varias opciones segun el caso
		
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
			System.out.println("error de juego");
			break;
		}
	}

}
