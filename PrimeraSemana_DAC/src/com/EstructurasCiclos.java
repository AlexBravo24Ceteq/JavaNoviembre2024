package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Estructuras ciclos son tambien llamadas bucles o estructuras de iteracion
		//nos permite ejecutar o repetir tareas mientras una condicion se cumpla
		
		
		//while - mientras  .... se cumpla una condicion
		
		
		/*
		 * mientras () verdadero {
		 * 
		 * se ejecuta este bloque de codigo  
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		
		// ejemplo cencillo de codigo
		// una variable de tipo entero con valor numerico
		
		
		int x =1;
		
		while (x<5) {// mientras x < 5			// ejecutamos esto
			// si x =5 se ejecutara indefinidamente
			System.out.println(x + ".-Hola mundo");
			x=x+1;
		}
			// para evitar esto necesitamos incrementar valor de x
			
    //	x=x+1;
			
			//otra forma de expresar el valor de x es la siguiente
			
		//	x++;
			
			/*
			 * do while - similar al while pero este primero se ejecuta y bluego pregunta si se debe seguir ejecutando elprograma
			 * Nos es util cuando posiblemente la condicion no pueda cumplirse y asi aseguramos que el programa se ejecute 1 vez
			 */
		//// si se nececita incrementar o decrementar se indica despues de la impresion
		// x++;
		
//			do { // haz lo siguiente
//				System.out.println("Hola mundo");
//			}while (x>10); // mientras x sea mayor a 10, lo cual , no es cierto pero ya se ejecuto por lo menos 1 vez en el programa.
//			
		
		// ciclo for- ciclo determinado 
		// ciclo determinado y es el mas hutilizado ya que es posible o util cuando sabemos cuantas veces se debe ejecutar una tarea
		
		/*
		 * para ( los siguientes argumentos ) {
		 * ejecuta este bloque de codigo
		 * }
		 * 
		 * los argumentos son los siguientes
		 * 
		 * (una variable de control; una condicion; un incremento o decremento;
		 * 
		 */
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i + ".- Hola mundo");
			
		//}
		
		
		}
		

	}

