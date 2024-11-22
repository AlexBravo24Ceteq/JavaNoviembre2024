package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// entrada de datos o intrudicir valores por el teclado con la clase
		// Scaner
		
		//Vamos a necesitar una variable donde guardar el valor
		
//		int nipUsuario;
//		String password;
//		
//		//ejemplo primero vamos a probar a guardar un valor numerico
//		//en la variable nipUsuario a traves de introducirlo por teclado
//		//Para ello necesitamos a la clase Scanner
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		//Lo vayamos a teclear se v a guardar provisionalmente en la variable entrada
//		//a traves de ese metodo y entonces ese valor, lo asignamos hacia la variable nipUsuario
//		System.out.println("introduce tu nip de 4 digitos");
//		nipUsuario = entrada.nextInt();
//		
//		// una vez que se guardo el valor tecleado, si quiero puedo mostrarlo o utilizarlo
//		System.out.println("tu nip es: " + nipUsuario);
//		System.out.println("Bienvenido");
//		
//		//con el mismo Scanner puedo seguir solicitando valores, ejemplo un String password
//		System.out.println("introduce tu password");
//		//password = entrada.next();//.nect() solo va a permitir introducir una palabra, sin  espacios
//		//ni saltos de linea
//		// si quiero que lo reconozca con espacios y saltos de linea lo hago con .nextLine()
//		//declaramos un consumo del salto de line antes para que se pueda guardar el valor correcto
//		entrada.nextLine();//esto consume el esppacio de la impresion anteriror
//		
//		password = entrada.nextLine();// aqui .nextLine() consumio el espacio de la impresion en consecuencia
//		// anterio yy lo guardo, entonces tenemos que consumirlo antes, para realizzar la asignacion
//		//correctamente
//		System.out.println("su password es: " + password);
		
		//Operador modulo% en operacion de division devuelve el valor del residui de esa division
		
		int n = 8;
		int resultado = n%2;
		System.out.println(resultado);

	}

}
