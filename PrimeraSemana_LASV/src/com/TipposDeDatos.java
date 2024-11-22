package com;//nombre del paquete

public class TipposDeDatos {//nombre de la clase
	
	public static void main(String[] args) {// appertura del main
		
		/*
		 * comentarios de multiples lineas
		 * con diagona "/" y asterisco"*"
		 * yy conforme damos saltos de line el comentario
		 * puede ir creciendo
		 */
		
		
		/*Tipos de datos primitivos
		 * numeros enteros
		 */
		
		
		//declarar variables sin valor asignado inicialmente
		// esto me va a peprmitir asignarlles algun valor mas adelante n caso
		// de ser necesario
		
		byte numero;
		
		//posteriormente le puedo asignar un valor
		numero = 127;
		
		//Declarar variables con valor asignado desde un inicio
		
		byte by = -128;// 1 byte de memoria (-128  a 127)
		short sh = 32767; //2 bytes de moria (-32768 a 32767)
		int in = 2147483647; // 4 bytes de memoria
		long largo = 2147483647L; // 8 bytes de memoria y requieren el sufijo L
		// para almacenar los valores
		
		
	    //El topo de dato mas utilizado (comdin) es el tipo int
		
		/*tipos de datos primitivos
		 * numeros en coma flotante(decimales)
		 */
		float pulgadas = 2.54F;//4 bytes y necesitan el sufijo F
		double pi = 3.11416;//8 byytes de memoria yy es el tipo de dato comodin
		//mas utulizado papra decimales
		
		/*Tipo de datos Primitivos
		 * Boleanos
		 * Caracter
		 */
		
		boolean evalua = true;// solo puede contener ture o false
		//son utiles para evaluar exppresiones o condiciones segun se necesite
		
		
		char caracter = 'a';
		char simbolo = '%';// almacenan un caracter a la vez
		
		/*TIPO DE DATO ESTRUTURADO
		 * NO PRIMITIVOS 
		 * TIPO DE DATO OBJETO
		 */
		
		//Cadena de texto - String
		
		String nombre = "luis";
		
		String cadena;// igual podemos declararlo vacio
		cadena = "Hola mundo";// le asignamos valor posteriormente
		
		
		caracter = '&';// estamos guradando un nuevo laor en 
		//la variable caracter
		
		nombre.toLowerCase();// aqui estamos accediendo a una funcion
		//que convierte lo que esta guardado en nombre a minusculas
		
		/*otros tipos de datos objetos son los topo wrapper / envoltorio
		 * son clases que 'envuelven' a los tipos de datos primitivos para poder otrograrles
		 * otras funciones
		 */
		
		byte varuable;
		short numShort;
		Integer numInt;
		Long numLong;
		Boolean evalua2;
		Character letra;
		float decimal;
		double decimales;
		
		letra = '$';
		
		letra.charValue();
		
		//salida a los datos en consola
		//impresion en consola
		
		System.out.println("hola mundo");// cib orubtln se da un salto de linea
		// para mostrar la siguiente impresion el a consola
		
		System.out.println(nombre);//dando salida al contenido de una variable
		
		//syso + control + barra espaciadora y se completa la linea mas rapido
		System.out.println(3+18);
		
		int x = 4;
		int y = 18;
		System.out.println(x+y);
		
		
		//concatenacion -  se van uniendo los valores uno a uno para mostrarse en consola
		System.out.println("la suma es : " + x+y);
		
		System.out.println("la suma es : " + (x+y));// si quiero ver el resusltado de la suma
		// tengo que encerrar entre parentesis la operacion
		
		
	}

}
