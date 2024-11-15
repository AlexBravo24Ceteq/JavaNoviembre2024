package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// ESTRUCTURAS CICLOS
		//Son también llamadas Bucles o estructuras de iteración
		//Nos permiten ejecutar o repetir varias veces una tarea
		//Mientras una variable booleana sea verdadera
		
		//while - mientras.... se cumpla una condición
		
		/*
		 * Mientras (esto se cumpla o sea verdadero) {
		 * 
		 * 			se ejecuta este bloque de código
		 * }
		 */
		
		//Vamos a ver un ejemplo sencillo de este ciclo, declatamos 
		//una variable de tipo entero con un valor numérico
		
		
		int x=1;
		
		//while (x<5) { //mientras x sea menor a 5, si lo declaramos así, el ciclo tiende a ejecutarse indefinidamente (ciclo indefinido)
			
			//ejecutamos esto de aquí
			//System.out.println(x+".-Hola mundo");
			//Para evitar que el ciclo sea infinito, necesitamos incrementar x
			//x=x+1;
			
			//Otra forma más simple de expresar un incremento de uno en x es la sig:	
			
			//x++;					
		//}
			
		//do while - similar al while, pero este primero ejecuta y luego pregunta si se debe
		//seguir ejecutando el programa
		//Nos es útil cuando posiblemente la condicion no pueda cumplirse y asi aseguramos
		//que nuestro programa se ejecute por lo menos 1 vez
		
//		do { //significa haz lo siguiente
//			System.out.println("Hola mundo");
		//Si necesitara un incremento o decremento se indica aquí, después de la impresion
			//en consola o en este bloque
//			x++;
//		}while (x>10); //mientras x sea mayor a 10, lo cual no es cierto, pero ya se ejecutó
		//por lo menos 1 vez en nuestro programa
		
		
		//for - ciclo determinado
		//Es el más utilizado ya que es útil cuando sabemoscuántas veces se 
		//debe ejecutar una tarea 
		
		/*
		 *  para (los siguientes argumentos) {
		 *  		ejecuta este bloque de código
		 *  }i
		 *  los argumentos son los siguientes:
		 *  
		 *  (una variable de control; una condición; un incremento o un decremento
		 *  
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo");
			
		}
		}

	}


