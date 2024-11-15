package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {   //apertura del main
		

		//el metodo main es el punto de entrda y e ejecucion
		// de un programa e java
		
		/* comentrio de multiples lineas 
		 * con diagonal y aterisco
		 * en cada linea
		 */
		
		//Vamos a ver ejemplo e como eclarar variables sin valor asignado
		//esto nos permitira asignar un valor mas adelante en caso de ser nesesario 
		
		byte numero;
		
		numero = 127; //asignacion de valor a la variable numero
		
		byte by =-128; //1 byte ocupa un valor de memoria esde -128 hasta 127
		
		short sh = 32767; // 2 byte de memoria desde -32768 hsta 32768
		
		int in = 214743647;// 4 bytes de memoria
		
		long largo = 21474364985l; //8 bytes de memoria soportado con cifras de 64 byst requiere el 
		                        //sufijo l para almacenar los valores
		
		//int es el tipo de variable m utilizado de forma numerica
		
		float pulgadas = 2.5f; //4 bytes datos con decimal y ubfijo f
		
		double pi = 3.1416; // 8 bytes datos con un rango mayor e decimas y no utiliza subfijo
		
		//double es el dato decimal ma utilizado 
		
		boolean evalua = true; //solo puee contener true o false
		 //boolean son utiles para evaluar expresiones o condiciones
		
		char caracter = 'a'; //solo puede lmcenar un caracter a la vez  
		
		String letras;
		
		//Array nombre;
		
		caracter= '?'; //estamos agregando nuevo valor a char
		
		//nombre.tolowerCase(); //aqui estamos accedienddo  un funcion que convierte la cadena a minuscula
		
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
		
		
		System.out.println("Hola mundo");	//da un salto de linea	
		System.out.println(letra);
		
		System.out.println(3+2);
		
		int x = 10;
		int y = 20;
		
		System.out.println(x+y);

		System.out.println("la um es:" + x+y);
		

		System.out.println("la um es:"+(x+y));
		
		
		
		
	}//cierre del main
	

}
