package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda. Expresiones anonimas que implementan un método de una interface funcional.
		// operador es ->
		
		//(parametros que vienen del método) -> {cosas a ejecutar} 
		
		//Vamos a crear un objeto que nos permita implementar la interface
		//IFuncional. El objeto se crea de una clase anonima para poder 
		//implementar la interface.
		
		IFuncional calculadora = (x,y) -> System.out.println(x+y);
		// Entonces, le pido que saque de IFuncional(Interfaz) lo que tengo que hacer, y es un objeto calculadora.
		// = (parámetros) como yo quiera, y seran iguales a los argumentos en el método en IFuncional.
		// -> Lo que se tiene que hacer.
		calculadora.operación(4,5);//Mandalo a llamar para que se haga. Este no se hace solo.
		
		IFuncional calculadora2 = (x,y) -> System.out.println(x-y);
		calculadora2.operación(4,5);
		
		IFuncional calculadora3 = (c,d)-> { // aqui es más claro. Esto es una operación compleja. De nuevo
			//saco las cosas de Ifuncional, nuevo objeto declarado, y mis parámetros.
			
			//aqui toda la mierda que va a hacer
			Scanner input = new Scanner(System.in);
			System.out.println("Primero número");
			c= input.nextInt();
			System.out.println("Segundo número");
			d= input.nextInt();
			
			System.out.println(c*d);
		};
		
		calculadora3.operación(0,0); // y mandalo a llamar porque no se ejecuta solo, como todo lo demás.Obvi.
		
	}

}
