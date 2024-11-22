package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Entrada de datos - introducir valores por teclado con la clase Scanner
		
		//Vamos a necesitar una variable dónde guardar el valor
		
		
//		int nipUsuario;
//		
//		String password;
//		
//		//Ejemplo, primero vamos a probar a guardar un valor numérico en la variable nipUsuario a través de introducirlo por teclado
//		//para ello necesitamos a la clase Scanner
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		//Lo que vamos a teclear se va a guardar provisionalmente en la variable entrada
//		//a través de un método y entonces ese valor, lo asignamos hacia la variable nipUsuario
//		//Necesito mandar un mensaje en consola para saber que se está solicitando algo
//		System.out.println("Introduce tu nip de 4 dígitos");
//		nipUsuario = entrada.nextInt();
//		
//		//Una vez que se guardó el valor tecleado, si quiero puedo mostrarlo o utilizarlo
//		System.out.println("Tu nip es: " + nipUsuario);
//		System.out.println("Bienvenido");
//		
//		//Con el mismo Scanner puedo seguir solicitando valores, ejemplo, un String password
//		System.out.println("Introduce tu password");
//		// password = entrada.next(); //.nest() sólo me va a permitir introducir una palabra, sin espacioos ni saltos de línea
//		//Si quiero que lo reconozca con espacios o saltos de línea, lo hago con .nextLine()
//		//declaramos un consumo del salto de línea antes, para que se pueda guardar el valor correcto
//		entrada.nextLine(); //este consume el espacio de la impresión anterior
//		password = entrada.nextLine(); //aquí .nextLine() consumió el espacio de la impresión en consola
//		//anterior y lo guardo, entonces, tenemos que consumirlo antes, para realizar la asignación correctamente
//		System.out.println("Su password es: " + password);
//
		//Operador modulo % - En una operación de división devuelve el valor de residuo de esa división
		int n = 10;
		
		int resultado = n%3;
		System.out.println(resultado);

	} // cierre del main
	

} // cierre de la clase
