package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Expresiones lambda
		//son tambien conocidas como expresiones anonimas
		// las cuales implementan un metodo de una interface funcional
		//el operador es -> 
		//la sintaxis es la sig:
		//(parametros) -> {cuerpo de lambda}
		/*
		 * (con estos parametros que provienen de mi metodo)
		 * -> {esto es lo que quiero que se ejecute}
		 */
		
		//vamos a crear un objeto que nos permita implementar la interface IFuncional
		//El objeto se crea de una clase anonima para poder implementar la interface
		
		IFuncional calculadora = (x,y) -> System.out.println(x+y);
		
		calculadora.operacion(4, 5);
		//la vebtaja de las expresiones lambda es que podemos solicitar con otro objeto el mismo metodo alguna otra operacion
		
		IFuncional calculadora2 = (a,b) -> System.out.println(a-b);
		calculadora2.operacion(10, 4);
		
		//si tenemos una sintaxis mas larga entonces ya ocupamos las llaves en el cuerpo de lambda
		IFuncional calculadora3 =(c,d) -> {
			
			Scanner input = new Scanner(System.in);
			System.out.println("ingresa el primer numero a multiplicar");
			c = input.nextInt();
			System.out.println("ingrese el segundo numero a multiplicar");
			d = input.nextInt();
			System.out.println(c*d);
			
			
		};
		
		calculadora3.operacion(0, 0);
		
	}

}
