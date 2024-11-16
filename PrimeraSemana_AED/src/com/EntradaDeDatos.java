package com;
import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos -introducir valore con la clase scanner
		//Scanner
		
		// Vamos a nesecitar una clase donde guardar el valor
		
		int nipUsuario;
		
		String password;
		
		// Ejemplo primero vamos a probar a guardar un valor numerico
		// en la variable nipUsuario atraves de introducirlo por entrada
		// para ello nesecitaremos a la clase Scanenner
		
		Scanner entrada = new Scanner(System.in);
		
		// Permitimos o iniciamos el scanner
		// lo que vayamos a teclear se guardara provicionalmente en la variable entrada
        // nesecito mandar un mensaje en consola que me diga que se solicita algo 
		System.out.println("Se solicita tu nip de 4 digitos");
		nipUsuario = entrada.nextInt();
		
		// Una vez que se guardo el valor puedes mostrarlo 
		System.out.println("Tu nip es:" + nipUsuario);
		System.out.println("Bienvenido");

		//Con el mismo scanner puedo seguir solicitando valores 
		System.out.println("Introduce tu Password");
		//password = entrada.next(); // .next() solo me va permitir introducir una palabra sin espacio ni salto de linea
		//declaramos un consumo del salto de linea antes 
		entrada.nextLine(); // esto consume el espacio de la imprecion anterior
		password = entrada.nextLine();
		System.out.println("Su password es: " + password);
		
		// operador modulo % En una opercaion de divicion devuelve el valor derl residuo de esa divicion
		
/*		int n = 10;
		
		int resultado = n%3;
		
		System.out.println(resultado); */
	}

}
