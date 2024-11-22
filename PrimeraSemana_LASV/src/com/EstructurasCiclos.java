package com;

import java.util.Iterator;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Estructutras Ciclos
		// son tambien llamdas buckes o estructuras de iteracion
		// nos permiten ejecutar o repetir varias veces una tarea
		// mientras una variable booleana sea verdadera
		
		// while - mientras que... se  cumpla una condicion
		/*
		 * mientras (esto se cumopla o sea verdadero){
		 * 
		 *               se ejecuta este codigo
		 *               
		 * }
		 */
		
		//vamos a ver un ejemplo sencillo de este ciclo, declaramos
		//una variable de tipo entero con un valor numerico
		
		int x = 1;
//		
//		while (x<5) {//mientras x sea mmenor a 5, sii lo declaramos asi, el cliclo tiende 
//			// a ejecutarse indefinidamente
//			
//			//ejecutemos esto de aqui 
//			System.out.println(x + ".- Hola mundo");
//			
//			//para evitar que el ciclo continue y continue, necesitamos incrementar x
//			x = x + 1;
//			//otra forma mas simple de expresar un incremento de uno en uno en x es la sig
//			x++;
//			
//		}
		
		
		//do while - similar el while, pero este primero ejecuta yy luego pregunta si se debe 
		//seguir ejecutando el programa
		//nos es util cuando posiblemente la condicion no pueda cumplirse y asi aseguramos//
		//que nuestro programa se ejecuta por lo menos 111 vez
		
		
//		do {//haz lo siguiente
//			System.out.println(x + ".- Hola Mundo");
//			//si necesitara un incremento o decremento se indica aqui despues de la impresion en consola
//			x++;
//		}while(x<10);// mientas x sea mayor a 10, lo cual, no es cierto, pero ya se ejecuto por lo menos una vez
//		
//		
		
		//fo - ciclo determinado
		// es el "mas utilizado" yya que es util cuando sabemos cuanta veces se
		// debe efectuar una tarea
		
		/*
		 * para (los siguientes argumentos){
		 * 
		 *         ejecuta este bloque de codigo
		 * 
		 * }
		 * los argumentos son los sig:
		 * (una variable de control; una condicion; un incremento o decremento;
		 * 
		 */
		
		for (int i = 0; i <5; i++) {
			System.out.println(i + ".- Hola mundo");
			
		}

	}

}
