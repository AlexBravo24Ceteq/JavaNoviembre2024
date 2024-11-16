package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Estructuras Ciclos
		// son tambien llamadas bucles o estructuras de iteracion
		// Nos permiten ejecutar o repetir varias vceces una tarea 
		//mientras una variable booleana sea verdadera
		
		
		// while - mientras .... se cumpla una condicion
		
		/*
		 * mientras (esto se cumpla o sea verdadero){
		 *         se ejecuta este codigo 
		 *  } 
		 *  
		 */

		// Declaramos una variable de tipo entero con un valor numerico
	
	    int x = 1;
	    
	/*    while (x<5) { //mientras x sea menor que 5, si lo decvlaramos asi el ciclo tiende as infinito 
	    	//ejecutamos esto de aqui 
	    	System.out.println(x + ".- Hola mundo");
	    	// para evitar que se cicle se nesecita incrmentar el valor de x
	    	//x = x+1;
	    	// otra forma mas simple de exprezar un incrmeneto 
	    	x++;
	    }
	*/
	    
	    // do while primero ejecuta y luego pregunta si se debe seguir ejecutando
	    // nos es util cuando la condicion pueda cumplirse
	    
	 /*   do { // haz lo siguiente
	    	System.out.println("Hola mundo");
	    }while (x>10); // mientras x sea mayor a 10,
	 */   
	    // for - ciclo determinado
	    // Es el mas utilizad ya que es util cuando sabemos cuantas veces se debe 
	    // ejecutar una tarea
	    
	    /* para (los siguientes argumentos){
	     *       ejecuta este copdigo 
	     * }
	     * 
	     * los argumentos son los siguientes :
	     * 
	     * una variable de control; una condicion; un incremento o decremento;
	     */
	    
	    for (int i = 0; i < 5; i++) {
			System.out.println( i + ".- Hola mundo");
		}
	    
	}

}
