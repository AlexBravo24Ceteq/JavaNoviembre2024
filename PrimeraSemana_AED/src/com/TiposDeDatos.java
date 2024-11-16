package com; //Nombre del paquete

public class TiposDeDatos { // Nombre de la clase
	
	public static void main(String[] args) {//apertura del main
		
		// Si queremos escribir algo 
		// lo hacemos anteponiendo dos comentarios//
	
		// El metodo main es el punto de entrada y de ejecucion 
		// de un programa java
	
		/*
		 * Comentario de multiples lineas
		 * con diagonal y asterisco
		 * y conforme demos saltos de lineas el comentario 
		 * puede ir creciendo
		 */
		
		/* Tipos de datos
		 * Numericos enterors
		 */
		
		//vamos a ver como se declaran estas variables en java
		
		//Declarar variables sin valor asignado inicialmente
		//esto me va a permitir asignarles un valor mas adelante en caso 
		//de se necesario
		
		byte numero;
		
		// posteriormente le puedo asignar un valor 
		numero = 127;
		
		//declarar variables con valor asignado desde el inicio
		byte by = 127; // 1 bytes de memoria y contiene (-128 a 127)
        short sh = 32767; //  2 bytes de memoria (-32768 a 32767)
        int in = 2147483647; // 4 bytes de memoria
        long largo = 2147483649L; // 8 bytes de memoria y requieren el sufijo L para almacenar memoria
        
        // El tipo de dato mas utilizado (comodin)
	
	    /*Tipos de datos primitivos
	     * numeros con coma flotante (Decimales)
	     */
        
        float pulgadas = 2.54F; //4 bytes y nesecitan el sufijo F
        double pi = 3.1416; // 8 bytes de memoria y es el tipo de dato comodin mas utilizado para decimal
        
        /*
         * tipos de datos primitivos
         * booleanos
         * caracter
         */
        
        boolean evalua = true; // solo pueden contener true o false 
        // son utiles para evaluar expreciones o condiciones segun su nesecidad
        
        char caracter = 'a';
        char simbolo = '*'; // almacena un caracter a la vez
        
        // CTRL + S para guardar cambios en el codigo 
        
        /*
         * tipos de dato estructurado 
         * no primitivos
         * tipo de dato objeto
         */
        
        // Cadena de texto -String
        String nombre = "Abimael";
        String cadena; // igual podemos declararlo vacio
        cadena = " Hola mundo"; // le asignamos valor posteriormente 
        
        // los tipos de dato objeto, pueden acceder a metodos o funciones 
        // para realizar alguna determinada tarea 
        
        caracter = '?'; // aqui estamos guardando un nuevo valor en la variable caracter
        // la variable caracter
        
        nombre.toLowerCase(); // aqui estamos acediendo a una funcion que convierte a minusculas
        
        // otros tipos de dato objeto son los tipo wrapper - envoltorio
        // son clases que envuelven a los tipos de dato primitivo para poder otorgarles 
        // otras funciones 
        
        Byte variable;
        Short numShort;
        Integer numInt;
        Long numLong;
        Boolean evalua2;
        Character letra;
        Float decimal;
        Double decimales;
        
        letra = '*';
        
        letra.charValue();
        
        // Salida a los datos en consola 
        // Imprension en consola 
        
        System.out.println("Hola mundo"); //con println se da un salto de linea para mostrar la siguiente impresion
        
        System.out.println(nombre); // aqui estamos dando salida a lo contenido en la variable 
        
        //  syso + ctrl + barra espaciadora y se completa la linea mas rapido 
        System.out.println(3+18);
        
        int x = 3;
        int y = 18;
        
        System.out.println(x+y);
        
        // concatenacion se van uniendo los valores uno a uno para mostrar en consola 
        System.out.println("La suma es :" + (x+y));
        
        
        
	} //Cierre del main

}// cierre de la clase
