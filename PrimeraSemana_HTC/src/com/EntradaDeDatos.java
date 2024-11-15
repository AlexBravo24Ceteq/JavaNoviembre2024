package com;

import java.util.Scanner; //importando la clase de Scanner. Si terminara en *, importaríamos todo. Pero no es tan bueno traerlo todo.

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Valores por teclado con la clase Scanner
		
		int nip;
		String password;
		
		Scanner input  = new Scanner(System.in); //Scanner es la clase para introducir datos. Input es el nombre de nuestro Scanner.
		// se le pone "new" a este, junto con lo demás, porque sstamos declarando un nuevo Scanner, que acepte System.in (stream de inputs del teclado)
		// Ahora cada que usamos este scanner que utiliza el teclado, lo llamamos como input.(algo), que es como vamos a aceptar datos.
		
		System.out.println("Introduce tu NIP de 4 digitos.");
		nip = input.nextInt(); //Next int se usa gracias a Scanner. Esta esperando que el usuario lo teclee.
		System.out.println("NIP: " + nip);
		System.out.println("Ya te hackiaron chavo");
		
		//Con el mismo scanner pido password.
		
		System.out.println("Password?");
		input.nextLine();//me comi el espacio que imprime println para evitar introducir datos al siguiente nextLine
		password = input.nextLine();//Detallito, esta leyendo espacios de los prints.El anterior nos dejo ese espacio. PAra evitar este bug esta la linea anterior
		System.out.println("Password: "+ password);
		
	}

}
