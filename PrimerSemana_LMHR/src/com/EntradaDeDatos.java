package com;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrada de datos -introducir valors por teclado con la clase 
		//Scanner
		
		//vamos a necesitar una variable donde guardar el valor
		
		int nipUsuario;
		
		String password;
		
		//ejemplo primero vamsos a probar a guarrdar un valor numerico
		//en la variable nipUsuario  a traves de introducirlo por teclado 
		//para ello necesitamos la clase scanner 
		Scanner entrada = new Scanner (System.in);
		
		//Lo que vayamos a teclear se va a guardar providionalmente en la variable entrada 
		//a traves dde un metodo y entonces ese valor lo asiganmos
		//hacia la variable nipUsuario
		//necesito mandar un mensaje en la conosla para saber que se esta solicitando
		System.out.println("introduce tu nip de 4 digitos");
		nipUsuario= entrada.nextInt();
		
		//Una vez que se guardo el valor teclado, si quiero pueedo mostrarlo o utilizralo
		System.out.println("Tu nip es "+nipUsuario);
		System.out.println("bienvenido");
		
		//con el mismo scanner puedos eguir solicitando valores 
		System.out.println("introduce tu password");
		//password = entrada.next(); //.next() solo me va a apermitir escribir una palabra
		//sinnespacios ni saltos de linea
		
		// si quiero que se reconoxca los epsacios o saltos de linea lo hago con .nextLine();
		//declaramos un consumo de salto de linea 
		entrada.nextLine(); //esto consume el esacio de impresion anterior 
		password = entrada.nextLine(); // aqui .nnextLine consumio el espacio de la impresion en
		//consola anterior y lo guardo, por lo que se tiene que conumir antes 
		
		System.out.println("su password es: " + password);
		
		//operador modulo %- en una operacionnde divison devuelve el valor del residuo de esa divison
		int n= 10;
		int resultado = n%2;
		
		System.out.println(resultado);
	
		

	}

}
