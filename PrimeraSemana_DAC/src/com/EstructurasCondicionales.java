package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estructuras de decisipon que son If / else

		// Van a validar valores booleanos

		/*
		 * si (esto es verdadero ){
		 * 
		 * ejecuta este bloque de codigo } {Si no / se ejecuta este otro codigo }
		 * 
		 */

		int x = 10;

		System.out.println(x);

		System.out.println("evaluación con if");

		if (x < 10) {
			System.out.println("Cierto");

		} else {
			System.out.println("Falso");
//			

			// esta sintaxis es util para evaliaciones mas complejas
		}

		// pedimos que evalue una condicion sencilla e imprima la respuesta

		System.out.println("Evaluación sencilla");
		System.out.println(x < 10 ? "Cierto" : "Falso");
		// este metodo es util para evaluaciones sencillas

		System.out.println("Evaluación imprimiendo variable");
		// Guardamos el booleano en una variable y lo imprimimos

		String evalua = x < 10 ? "Cierto" : "Falso";

		System.out.println(evalua);

		// evaluar condiciones compuestas con operadores logicos

		// AND, OR, NOT, DIFERENTE DE, IGUALDAD

		System.out.println("Evaluación con operador logico AND &&");

		// AND - && - Devuelve el primer bloque (true) cuando todas las condiciones se
		// cumplan

		if (x < 10 && x > 5) {
			System.out.println("Cierto");

		} else {
			System.out.println("Falso");

		}

		// Nota es comun perderse en el tema de las llaves es importantes crearlas para
		// evitar error de sintaxis
		
		
		
		
		

		// OR - || "tecla junto al numero 1" - Devuelve el primer bloque (true) cuando se cumpla almenos una condición
		// cumplan

		System.out.println("Evaluación con operador logico OR ||");
		
		if (x < 10 || x > 5) {
			System.out.println("Cierto");

		} else {
			System.out.println("Falso");

		}
		
		
		
		// NOT - ! "SHIFT +  1" - Cambia el valor de true a false y viceversa
				// cumplan

				System.out.println("Evaluación con operador logico NOT !");
				
				if (!(x < 11 )) {
					System.out.println("Cierto");

				} else {
					System.out.println("Falso");

				}
				
				

				// IGUALDAD - == Compara los valores entre si y si son iguales devuelve TRUE
						// cumplan
				
				
				// este operador de igualdad es mas recomendable en valores numericos (enteros primitivos) y metodo .equals en cadenas de texto

						System.out.println("Evaluación con operador logico Igualdad == ");
						
						if (x == 10 ) {
							System.out.println("Cierto");

						} else {
							System.out.println("Falso");

						}
								
				// Diferente de - != - Devuelve True cuando los valores a comparar son diferentes uno de otro
						
						System.out.println("probando operador diferente De !=");
		
						if (x != 11 ) {
							System.out.println("Cierto");

						} else {
							System.out.println("Falso");

						}
						
						
						
		
		// Estructura if else anidada
						
						// Revisar bien sintaxis en video
						
						
		// Ejemplo juego de Piedra Papel Tijera
//						
//		String game = "piedra";

String game = "piedra";

if(game.equals("piedra")) {
	System.out.println("papel");
}else if (game.equals("papel")) {
	System.out.println("tijera");
}else if (game.equals("tijera")) {
	System.out.println("piedra");
}else {
	System.out.println("error del juego");
		
}
	
						
						
						
						
						
		
		
	}	// cierre del main

}	// cierre de la clase
