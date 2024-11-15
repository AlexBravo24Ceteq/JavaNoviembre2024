package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Estructuras Ciclos
		//Son también llamadas Bucles, o estructuras de iteración
		//Nos permiten ejecutar o repetir varias veces una tarea mientras una variable booleana
		//sea verdadera o una condición se cumpla
		
		//while - mientras... se cumpla una condición
		
		/*
		 * mientras (esto se cumpla o sea verdadero) {
		 * 	se ejecuta éste bloque de código
		 * }
		 */
		
		//Declaramos una variable de tipo entero con un valor numérico
		
		int x = 1;
		
		while (x < 5) { //mientras x sea menor a 5, el ciclo tiende a ejecutarse indefinidamente
			//se ejecuta ésto:
			System.out.println(x + ".- Hola Mundo");
			//para evitar que el ciclo continúe y continúe, necesitamos incrementar x
			x = x + 1;
		}

	}

}
