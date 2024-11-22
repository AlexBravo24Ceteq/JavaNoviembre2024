package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// para comentar todo s epuede con la tlecla ctrl+7 y se agregan // a todos los inicios de linea o se puede colocando al inicio
		
		/* esto al inicio y
		 * asterisco diagonal al final
		 */
		
		// ENTRADA DE DATOS O INTRODUCIR VALORES POR TECLADO CON LA CLASE Scanner
		
		// Se necesita una variable donde guardar un valor
		
		
		int nipUsuario;
		
		String password;
		
	//ejemplo, primero bamos a probar a guardar un valor numerico en la variable nipUsuario a travez de introducirlo por teclado 
		//para ello usamos la clase Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		
		// LO que se vaya a teclear se va a guardar provisionalmente en la variable entrada a travez de un metodo entonces ese valor se asigna hacia la variable nipUsuario
		
		//Necesito mandar un mensaje en consola para saber que se solicita algo
		
		
		 System.out.println("Introduce tu nip de 4 digitos");
		 
		nipUsuario = entrada.nextInt();
		
		// una vez que se guarda el valor tecleado sinquierpuedo mostrarlo o utilizarlo
		
		System.out.println("Tu nip es:"+nipUsuario);
		
		System.out.println("Bienvenido");
		
		// con el scanner pudo seguir solicitando valores ejemplo un String password
		
		System.out.println("Introduce tu Password");
		
		//password = entrada.next(); // .next me va a apermitir introducir una palabra sin espacios ni saltos de linea
		
		// declaramos antes de la linea de password un salto de linea para guardar el valor correcto
		
		entrada.nextLine();
		
		
		password= entrada.nextLine();// aqui .nextline consumio el espaciuo de la impresion de consola anteriror y lo guarda, entonces se debe consumir 
		//antes para realizar la asignacion correctamente
		
	
		
		
		System.out.println("Su password es:"+ password);
	
		
		
		//Operador moduulo % - en una operacion de division devuelve el valor del residuo de esta division
		
		int n = 10;
		
		int resultado = n%3;
		
		System.out.println(resultado);
		
		
		
		
		
		
		
		
	}// cierre del main

}// cierre de la clase
