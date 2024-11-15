package com;//nombre del paquete

public class TiposDeDatos { //nombre de la clase

	public static void main(String[] args) { //apertura del main
		
		// de esta forma se agregan comentarios
		
		//El metodo main es el punto de entrada y ejecución de un programa de java
		
		
		//apertura de comentario de miltiples lineas diagonal asterisco
		/*
		 * De esta forma se crean comentarios de multiples lineas
		 */
		
		/*
		 * Tipos de datos primitivos
		 * ejemplos de como se declaran estas variables en java
		 */
		
		
		//Declarar variables sin vlor asignado inicialmente
		//permite agrgar un valor posterior de sr necesario
		
		byte numero;
		//posteriormente se le puede asignar un valor
		numero=127;
		
		//Variables con valor asignado desde un inicio
		byte by = -128;//byte ocupa 1 byte de memoria y ocupa desde (128 a 127)
		
		short sh = 32767; // 2bytes de memoria y va del (-32,768 a 32,767)
		
		int in = 2147483647; //4bytes de memoria y abarca ese valor a negativos y positivos es el mas utilizado para guardar numeros enteros
		
		long largo = 2147483649L; //8bytes de memoria pero requieren el sufijo "L" Para almacenar los valores
		
		// El tipo de dato mas utilizado o comodin es el tipo INT
		
		/*Tipos de datos  primitivos
		 * numero con coma flotante (decimales)
		 */
		
		float pulgadas = 2.54F; // 4 bytes necesitan el sufijo "F"
		
		double pi = 3.1416; //8bytes tipo de dato comodin mas utilizado para decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		boolean evalua = true; // solo pueden contener TRUE o FALSE 
		//son utiles para evaluar expresiones o condicioe¿nes segun se necesite
		
		char caracter ='a';
		char simbolo = '#'; //alamcenan un caracter a la vez el que sea
		
		
		//CTRL + S para guardar cabios en el codigo 
		
		
		/*
		 * Tipos de datos estructurado
		 * No Primitivos
		 * Tipo de dato Objetos
		 * Tipos de datos complejos provenientes de clases
		 */
		
		//Cadena de texto  - String
		
		String nombre ="David Andrade";
		
		String cadena; // se puede declarar la variable vacia
	
		
		cadena = "Hola mundo";// se le asigna valor posteriormente
		
		//Los tipos de dato objeto pueden acceder a metodos o funciones para realizar determinada tarea
		
		caracter = '?'; //aqui estamos guardando un nuevo valor para variable carcter
		
		nombre.toLowerCase(); // A quie estamos accediendo a una función que Convierte lo que esta guardado en nombre a minusculas
		
		//Otros tipos de dato objeto son los tipo Wrapper -  Envoltorio
		//Son clases que envuelven a los tipos de daro primitivo para otorgarles otras funcionalidades
		
		Byte variable;
		Short numShort;
		Integer numInt;
		Long numLong;
		Boolean evalua2;
		Character letra;
		Float decimal;
		Double decimales;
		letra = '$';
				
		
		
		
		letra.charValue();
		
		//Salida a los datos en consola
		//Impresion en consola
		
		System.out.println("Hola mundo"); //ln se da un saltod de linea para mostrar la siguiente impresion en consola
		
		System.out.print(nombre);//aqui estamos dandole salida al contenido en la variable de nombre
		
		//syso + ( mantener apretado ctrl + barra espaciadora) completa linea más rapído
		System.out.println(3+18);// se pueden ejecutar operaciones matematica con variables o numeros
		
		int x=3;
		int y =18;
		
		System.out.println(x+y);
		
		//Concatenacion - se van uniendo los valore uno a uno para mostrarse en consola
		
		System.out.println("La suma es:"+ x+y);
		
		System.out.println("La suma es:" + (x+y));//Si quiero ver el resultado de la suma se debe encerrar el texto en parentesis para qu elo pueda interpretar aparte el programa y la ejecute.
		
		
		
		
		
		
		
		
		
	}// cierre del main
	
	
}//cierre de la clase
