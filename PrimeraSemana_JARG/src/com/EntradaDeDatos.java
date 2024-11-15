package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// ENTRADA DE DATOS- INTRODUCIR VALORES POR TECLADO CON LA CLASE SCANNER
		
		
		
		//VAMOS A NECESITAR UNA VARIABLE DONDE PUEDA GUARDAR UN VALOR
		
		int nipUsuario;
		
		String password;

		//Ejemplo, vamos a probar guardar un valor numérico 
		//en la variable nipUsuario a través de introducirlo por tecladp
		//Para ello necesitamos a la clase scanner
		Scanner entrada = new Scanner(System.in); 
		
		//Lo que vayamos a teclear se va a guarda provicionalmente en la variable entrada
		//a través de un método y entonces ese valor, lo asignamos hacia la variable nipUsuario
				System.out.println("Introduce tu nip de 4 dígitos");
		nipUsuario = entrada.nextInt();
		
			
		//Una vez que se guardó el valor tecleado, si quiero puedo mostrarlo o utilizarlo
		System.out.println("Tu nip es; " + nipUsuario);
		System.out.println("Bienvenido");
		
		//Con el mismo scanner puedo seguir solicitando valores, ejemplo un string password
		System.out.println("Introduce tu password");
		//.next() sólo me va a permitir introducir una palabra, sin espacios
		//ni saltos de línea
		//Si quiero que lo reconozca con espacios o saltos de línea, lo hago con.nextLine()
				//Declaramos un consumo del salto de línea antes, para que se pueda guardar el valor correcto
		
		entrada.nextLine(); //esto consume el espacio de la impresión anterior
		password = entrada.nextLine(); //aquí .nextLine() consumió el espacio de la impresión en consola
		//anterior y lo guardó, entonces, tenemos que consumirlo antes, para realizar la asigniación
	//correctanebte
	System.out.println("su password es: " + password);
		
		
		//Operador modulo % - En una operacion de division devuelve el valor del residuo de esa
		//division
		int n = 10;
		int resultado = n%3;
		System.out.println(resultado);
	}

}
