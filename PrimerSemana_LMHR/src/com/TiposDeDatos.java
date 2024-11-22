package com;//nombre del paquete

public class TiposDeDatos { //nombra de la clase
//metodo principal la sintaxis es :
	public static void main(String[] args) {//apertura del main
		//anotaciones si queremos ecribir algo
		//el metodo main es el punto de entrada y de ejecución de un programa JAVA
		/*
		 * comentarios de multiples lineas 
		 * con diagonal y asterisco
		 * y conforme demos slatos de linea el comentario
		 * puede ir creciendo
		 */
		/*TIPOD DE DATOS PRIMITIVOS
		 * numericos enteros
		 */
		//Declarar variables sin valor asignado inicialmente
		//esto me va a permitir asignarles algun valor mas adelante en caso 
		//de ser necesario
		
		byte numero;
		//potseriormente le puedo asignar un valor
		numero=127;
		//declarar variables con valor asignado desde un inicio
		byte by= -128; //1 byte de memoria (-128 a 127)
		short sh=32767; //2 bytes de memoria (-32768 a 32767)
		int in=2147483647; //el mas ocupado porque es de 4 bytes de memoria
		long largo= 2147483649L; //necesita sufijo L al final para poder almacenar los valores
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * numericos en coma flotante (decimales) 
		 */
		float pulgadas=2.54F; //4 bytes y necesitan sufijo F
		double pi=3.1416; //8 bytes y es el tipo de dato comodin 
		//mas utilizado para decimales 
		
		/* TIPOS DE DATOS  PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		boolean evalua= true ; //solo pueden contener true o false
		//son utiles para evaluar exprresiones o condiciones segun se necesite
		
		char caracter='a';
		char simbolo = '#'; //almacenan un caracter a la vez 
		
		/*tipos de dato estructurado
		 * NO PRIMITIVOS
		 * TIPO DE DATO OBJETO
		 * datos complejos, incluso provenientes de clases
		 */
		//cadena de texto- String 
		
		String nombre = "leslie hdez";
		String cadena; //se puede declarar vacio
		cadena= "hola mundo"; //ñe asignamos valor posteriormente
		//Los tipos dr dato objeto, pueden acceder a metodos o funciones 
		//para realizar alguna determinada tarea
		caracter = '?'; //aqui etsmos guardando un nuevo valor en la variable caracter
		
		nombre.toLowerCase(); //aqui estamos accediendo a una funcion 
		//que convierte lo que esta guardando en nombre a minusculas
		
		//otros tipos de dato objeto son los tipos wrapped-envoltorio
		//sonnclases que envuelven a los tipos de dato primitivo para poder otorgarles 
		//otras funcionalidades
		Byte variable;
		Short numshort;
		Integer numInt;
		Long numLong;
		Boolean evalua2;
		Character letra;
		Float decimal;
		Double decimales;
		
		letra= '$';
		letra.charValue();
		
		
		//Salida a los datos en consola
		//impresion en consola
		
		System.out.println("HOLA MUNDO"); //println se da un salto de liinea
		//
		
		System.out.println(nombre); //dadno slaida  a lo contenido en la variabole nombre
		
		//syso + ctrl + barra espaciadora y se completa la linea rapido
		System.out.println(3+18);
		
		int x=3;
		int y=18;
		
		System.out.println(x+y);

		//concatenación - se van uniendo los valores para mostrarse en consola
		System.out.println("la suma es:"+ x+y);
		
 
	}//cierre del main
}// cierre de la clase
