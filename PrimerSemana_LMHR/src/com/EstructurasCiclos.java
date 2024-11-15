package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ESTRUCTURAS CICLOS
//		//son tamien llamadas bucles o estructuras de iteración
//		nos permiten ejecutar o repetir varias veces una tarea
//		mientras una variable booleana sea verdadera
//		
//		CICLO While- mientras se cumpla una condición
		/* mientras (esto se cumpla o sea verdadero) {
		 *           se ejecuta este bloque de codigo
		 * }          
		 */
		
//		EJEMPLO
//		declaramos una variable de tipo entero con valor numerico
		
		int x=1;
		while (x<5) { // mientras x sea menor a 5, si lo declaramos asi el ciclo tiende a 
			//ejecutarse infinitamente 
			//ejecutamos esto de aqui
			System.out.println(x + ".-Hola mundo");
			//para evitar que el ciclo continue y continue, necesitamos incrementar x
			//x=x+1;
			//segunda forma mas simple de expresar un incremeneto 1 en 1 en x es 
			x++; //más comun
		}
//	 CICLO do while - similar al while, pero este primero ejecuta y luego pregunta si se debe 
//	 seguir ejecutando el programa
//	 nos es util cuando posiblemente la condición no pueda cumplirse y asi aseguramos que nuestro
//	 programa se ejecute por lo menos 1 vez 
		 
		do { //haz lo siguiente 
			System.out.println("Hola mundo");
			//si necesitara un incremento o decremento se indica aqui despues de la 
			//impresión en consola 
			//x++;
		} while (x>10); //mientras x sea mayor a 10, lo cual, no es cierto pero ya se ejecutó por lo menos 1 vez
		
////   CICLO for - ciclo determinado
//	   es el mas utilizado ya que es utilcuando sabemos cuantas veces debe ejecutar 1 tarea
		
		/*
		 * para (los siguientes argumentos){
		 *          ejecuta este bloque de codigo
		 *}  
		 *
		 * los argumentos son los siguientes:
		 *( una variable de control; una condición;un incremento o decremento)       
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo");
		}
	}

}
