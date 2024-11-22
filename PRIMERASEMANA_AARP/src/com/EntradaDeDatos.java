package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos- introducir valores por teclado con la clase Scanner
		//Vamos a necesitar una variable donde guardar el valor
		
		int nipUsuario;
		String password;
		
		//Ejemplo, primero vamos a probar un valor numérico en la variable nipUsuario
		//en la variable nipUsuario a traves de introducirlo por teclado
		//para ello necesitamos la clase Scanner
		Scanner entrada= new Scanner(System.in);
		
		//Lo que vayamos a teclear se va a guardar provicionalmente en la variable entrada a traves de 
		//un metodo y entonces ese valor, lo asignamos hacia la variable nipUsuario
		//Necesito mandar un mensaje en consola para saber que se esta solicitando algo
		System.out.println("Introduce tu nip de 4 digitos");
		nipUsuario= entrada.nextInt();
		
		//Una vez que se guardo el valor tecleado, si quiero puedo mostrarlo o utilizarlo
		System.out.println("Tu nip es: "+ nipUsuario);
		System.out.println("Bienvenido xd");
		
		//Con el mismo Scanner puedo seguir solicitando valores, ejemplo un String password
		System.out.println("Introduce tu password");
		//password= entrada.next();//.next() solo me va a permitir introducir una palabra, sin 
		//espacios ni saltos de línea
		//si quiero que lo reconozca con espacios y saltos de línea, lo hago con .nextline()
		//Declaramos un consumo del salto de línea antes, para que se pueda guardar el valor correcto
		entrada.nextLine(); //Esto consume el espacio de la impresion anterior
		password= entrada.nextLine(); 
		
		System.out.println("Su password es: "+ password);
		
		
		

	}

}
