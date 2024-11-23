package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Expreciones Lamda
		// Son tambien conocidas como expreciones anonimas
		// Las cuales implementan un metodo de una interface
		// funcional
		
		// El operador es ->
		
		// y la sintaxis es la siguiente:
		// (parametros) -> {cuerpo de lamda}
		
		/*
		 * ()con estos parametros que provienen de mi metodo 
		 * -> {esto es lo que quiero que ejecutes}
		 */
		
		// vamos a crear un objetoq ue nos permita implem,entar 
		// la interface IFuncional. el objeto se crea de una clase anonima
		// para poder implementar la interface
		
		IFuncional calculadora = (x,y) -> System.out.println(x+y);
		
		
		// Ahora podemos probar el metodo original de la interface
		// atraves de el objeto calculadora
		
		calculadora.operacion(4, 5);
		
		// La ventaja de las expreciones Lamda es que podemos solicitar 
		// con otro objeto  y el mismo metodo alguna otra operqacion
		IFuncional calculadora2 = (x,y) -> System.out.println(x-y);
		
		calculadora2.operacion(10, 7);
		
		//Si tenemos una sintaxis mas larga entonces ya ocupamos las llaves
		// en el cuerpo de lamda
		IFuncional calculadora3 = (c,d) -> {
			Scanner input = new Scanner(System.in);
			System.out.println("Ingresa el primer numero a multiplicar");
			c= input.nextInt();
			System.out.println("Ingrese el siguiente numero a multiplicar");
			d= input.nextInt();
			System.out.println(c*d);
		};
		
		calculadora3.operacion(0, 0);
	}

}
