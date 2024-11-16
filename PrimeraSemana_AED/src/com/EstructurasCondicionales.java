package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructura de dicision if/ else
		
		//Van a validar valores booleanos
		
		/*
		 *si (esto es verdadero) {
		 * ejecuta el bloque de codigo 
		 * } si no / de otro modo {
		 * ejecuta edste otro bloque 
		 * }
		 */
		
		int x = 10;
			
		if (x < 10 ) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//System.out.println(x<10?"Cierto":"Falso");

 
		//Evalua condiciones compuestas con operadores logicos
		// AND, OR, NOT, DIFERENTE DE, IGUAL
		
		// AND && - devuelve erl primer bloque true cuando todas las condiciones sew cumplem
		
		System.out.println("Probar Operador AND &&");
		
		if (x<10 && x>5 ) {
			System.out.println("Cierto");		
		}
		else {
			System.out.println("Falso");
		}
		
		// OR || Devuelbe el primer bloque (true) cuando se cumple almenos una condicion
		
		System.out.println("Probar Operador OR || ");
		
		if (x<10 || x>5 ) {
			System.out.println("Cierto");		
		}
		else {
			System.out.println("Falso");
		}
		
		// NOT ! *- niega una condicion o cambia su valor de true a false y viceversa
		
		System.out.println("Probar Operador NOT ! ");
		
		if (!(x < 10)) {
			System.out.println("Cierto");		
		}
		else {
			System.out.println("Falso");
		}
		
		// IGUALDAD - COMPARA LOS VALORES ENTRE SI Y SI SON IGUALES REGRESA UN TRUE
		// ES MAS RECOMENDABLE EN VALORES NUMERICOS  Y EL METODO .EQUALS PARA STRINGS
		System.out.println("Probar Operador IGUALDAD == ");
		
		if (x == 10) {
			System.out.println("Cierto");		
		}
		else {
			System.out.println("Falso");
		}
		
		// Estructura If else anidado
		
		//Ejemplo un pequeño juego de piedra papel o tijera
		
		String game ="PIEDRA";
		System.out.println("Provando estructura if anidado");
		if (game.equals("PIEDRA")) {
			System.out.println("PAPEL");
		}else if (game.equals("PAPEL")){
			System.out.println("TIJERA");
		}else if(game.equals("TIJERA")) {
			System.out.println("PIEDRA");
		}else {
			System.out.println("Error de Juego");
		}
		
		// Estructura switch case - evalua el cambio de una variable y 
		// nos permite ejecutar varias opciones segun sea el caso 
		System.out.println("Provando estructura case");
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

		default: System.out.println("Error de juego");
			break;
		}
	}

}
