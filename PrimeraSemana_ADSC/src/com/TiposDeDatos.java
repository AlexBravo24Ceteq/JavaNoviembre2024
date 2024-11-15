package com; // nombre del paquete

public class TiposDeDatos { // nombre de la clase
	
	public static void main(String[] args) { //apertura del main
		
		//El método "main" es el punto de entrada y de ejecución de un progama de java)
		/*
		 * Comentarios de múltiples líneas 
		 * con diagonal y asterisco
		 * y conforme demos saltos de línea, el comentario
		 * puede ir creciendo
		 */
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		
		//Ejemplos de cómo se declaran estas variables en Java
		
		//Declarar variables sin valor asignado inicialmente
		//Esto me va a permitir asignarles algún valor más adelanto en caso necesario
		
		byte numero;
		
		//Posteriormente le puedo asignar un valor
		numero = 127;
		
		//Declarar variables con valor asignado desde un inicio
		byte by = -128; //byte ocupa un byte de memoria (-128 a 127)
		short sh = 32767; //2 bytes de memoria (-32768 a 32767)
		int in = 21478647; //4 bytes de memoria
		long largo = 2147483647; //8 bits de memoria y requieren el sufijo "L"
		//para almacenar los valores
		
		//El tipo de dato más utilizado (comodín) es el tipo "int"
		
		/* TIPÓS DE DATOS PRIMITIVOS
		 * NUMERICOS EN COMA FLOTANTWE (DECIMALES)
		 */
		
		float pulgada = 2.54F; //4 bytes y necesitan el sufijo "F"
		double pi = 3.1416; //8 bytes de memoria y es el tipo de dato comodín más utilizado para decimales
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean evalua = true; //Solo pueden contener "true" o "false" y son útiles para evaluar expresiones o condiciones según se necesite
		
		char caracter = 'a';
		char simbolo = '#'; //almacena un caracter a la vez
		
		//CTRL + S es para guardar cambios en nuestra clase o código que voy escribiendo
		
		/*TIPO DE DATO ESTRUCTURADO
		 * NO PRIMITIVOS
		 * TIPO DE DATO OBJETO
		 * Prácticamente son datos más complejos, incluso provenientes de clases
		 */
		
		//Cadena de texto - String
		
		String nombre = "Alejandro Sánchez";
		String cadena; //igual podemos declararlo vacío
		cadena = "Hola Mundo"; //le asignamos valor posteriormente
		
		//Los tipo de dato objeto, pueden acceder a métodos o funciones para realizar alguna determinada tarea
		caracter ='?'; //aquí estamos guardando un nuevo valo en la variable "caracter"
		
		nombre.toLowerCase(); //aquí estamos accediendo a una función que convierte lo que está guardando en nombre a minúsculas
		
		//Otros tipos de dato objeto son los tipo "Wrapper" - Envoltorio
		//Son clases que 'envuelven' a los tipos de dato primitivo para poder otorgarles otras funcionalidades
		Byte variable;
		Byte numShort;
		Integer numInt;
		Long numLog;
		Boolean evalua2;
		Character letra;
		Float decimal;
		Double decimales;
		
		letra = '$';
		
		letra.charValue();
		
		//Salida a los datos en consola, es decir, una impresión en consola
		
		System.out.println("Hola mundo"); // con "println" se da un salto de línea para mostrar la siguiente impresión en consola
		
		System.out.print(nombre); //Aquí estamos dándole salida a lo contenido en una variable
		
		//syso + ctrl + barra espaciadora y se completa la línea más rápido
		System.out.println();
		
		System.out.println(3+18);
		
		int x = 3;
		int y = 18;
		
		System.out.println(x+y);
		
		//Concatenación - se van uniendo los valores, uno a uno, para mostrarse en consola
		System.out.println("La suma es: " + x+y);
		
		System.out.println("La suma es: " + (x+y)); //si quiero ver el resultado de la suma tengo que encerrar entre paréntesis la operación
		
		
	} // cierre del main
	
} // cierre de la clase
