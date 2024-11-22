package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Estructuras Ciclos
		//Son tambien llamadas bucles o estructuras de iteración
		//nos permiten ejecutar o repetir varias veces una tarea
		//mientras una variable booleana sea verdadera

		//while - mientras ... se cumpla una condición
		
		/*
		 * mientras (esto se cumpla o sea verdadero){
		 * 
		 * se ejecuta este bloque de código
		 * }
		 */
		
		//Vamos a ver un ejemplo sencillo de este ciclo, declaramos
		//una variable de tipo entero con un valor numerico
		
		int x=1;
		/*while (x<5) {//mientas x sea menor a 5 el ciclo tiende a 
			//ejecutarse indefinidamente
			System.out.println(x+ ".-Hola mundo");
			//Para evitar que el ciclo continue y continue necesitamos incrementar x
			//x= x+1;
			//otra forma de ejecutar más facil el incremento de uno en uno de x es la sig
			x++;
			*/
			
			//do while- similar al while, pero este primero ejecuta y luego pregunta si
			//se debe de seguir ejecutando el programa
			//no es util cuando posiblemente la condición no pueda cumplirse y así aseguramos
			//que nuestro programa se ejecute por lo menos una vez
			
//			do {//haz lo siguiente
		//si necesitara un incremento o decremento se indica aqui despues de la impresión
		//en consola
//				System.out.println("Hola mundo");
//			}while(x>10);
//			
		
		//for - ciclo determinado
		//es el más utilizado ya que es util cuando sabemos cuantas
		//veces se debe ejecutar una tarea
		
		/*
		 * for (los siguientes argumentos){
		 * ejecuta este bloque de código
		 * }
		 * los argumentos son los siguientes
		 * (una variable de control; una condición; un incremento o decremento)
		 */
		for (int i = 0; i <5; i++) {
			System.out.println(i + ".-Hola mundo");
		}
			
		
	}//cierre del main

}//cierre de clase
