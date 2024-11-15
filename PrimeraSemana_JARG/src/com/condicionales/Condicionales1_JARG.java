package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JARG {

	public static void main(String[] args) {
		// Ejercicio 1
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		
		
		int primerNumero;
		int segundoNumero;
	
		try { //intenta ejecutar el siguiente codigo
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el primer número");
		
		primerNumero = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		
		
		segundoNumero = entrada.nextInt();
		
		//Si por ejemplo, al usuario se le ocurre introducir una letra en lugar de un numero
		//nos dará una excepcion. Para controlar esto, podemos ejecutar nuestro código 
		//dentro de una estructura llamada try and cathc
		//Esta estructura es útil para controlar excepciones en tiempo de ejecución,
		//conversiones de tipos de dato y obtencion de datos de un programa externo
		
		
		//Estructura condicional 
		

		if (primerNumero > segundoNumero) {
			System.out.println("EL PRIMER NUMERO ES MAYOR");
		}  else if (primerNumero < segundoNumero) {
			System.out.println("EL SEGUNDO NÚMERO ES MAYOR");
		} else {
			System.out.println("AMBOS NÚMEROS SON IGUALES");
		}
		} catch (Exception e) { //Si algo alla se atrapa eb esta Excepcion 
			//y se ejecuta el siguiente bloque de codigo
			System.out.println("No se pudo ejecutar el programa. Intenta de nuevo. Introduce numeros");
		}
		
	}

}
