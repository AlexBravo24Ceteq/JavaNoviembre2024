package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda
		//Son también conocidas como expresiones anonimas
		//Las cuales implementan un metodo de una interface
		//funcional
		
		//El operador es ->
		
		//Y la sintaxis es la sig:
		//(parametros) -> {cuerpo de Lambda}
		
		/*
		 * (con estos parametros que provienen de mi metodo 
		 * -> {esto es lo que quiero que se ejecute}
		 * 
		 */
		
		//Vamos a crear un objeto que nos permita implementar la interface
		//IFuncional
		
		IFuncional calculadora=(x,y) -> System.out.println(x+y);
		
		
		//Ahora podemos probar el metodo original de la interface
		//a traves del objeto calculadora
		
		calculadora.operacion(4, 5);
		
		//La ventaja de las expresiones lambda es que podemos solicitar
		//con otro objeto y el mismo metodo alguna otra operacion
		IFuncional calculadora2 = (a,b) -> System.out.println(a-b);
		
		calculadora2.operacion(10, 7);
		
		//Si tenemos una sintaxis mas larga entonces ya ocupamos las llaves en
		//el cuerpo de Lambda
		
		IFuncional calculadora3 = (c,d) -> {
			Scanner input = new Scanner(System.in);
			System.out.println("Ingresa el primer numero");
			c = input.nextInt();
			System.out.println("Ingresa el segundo numero");
			d = input.nextInt();
			System.out.println(c*d);
		};
			
		//Aqui probamos la ultima implementacion a traves de calculadora3
		calculadora3.operacion(0, 0);
		
	
	}

}
