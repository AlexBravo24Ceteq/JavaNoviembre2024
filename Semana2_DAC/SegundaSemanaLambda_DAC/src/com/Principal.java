package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Expreciones Lambda
		//tambien conicidas como exprecions anonimas
		//las cuales implementan un metodo de una interface funcional
		
		// la sintaxis e sla siguiente
		//el operador es ->
		//la sintaxyses la siguiente
		//(parametros) -> {cuerpo lambada}
		
		//se podria explicar como:
			//(con estos parametros) -> {ejecuta esto}
		
		//Vamos a crear un objeto que nos permita implementar la interfave 
		//IFuncional . El objeto se crea de unaclase anonima para poder implementar la interface
		
		
		IFuncional calculadora = (x,y) -> System.out.println(x+y);
		
		//Ahora podemos-probar e metodo original de la interface a travez del metodo calculadora
		
		calculadora.operacion(4, 5);
		
		//La ventaja de las expresiones lambda es que podemos solicita otro objeto y el mismo metodo alguna otra operacion
		
		IFuncional calculadora2 =(a,b) -> System.out.println(a-b);
		calculadora2.operacion(10, 7);
		
		// si tenemos una sintaxys mas larga o la respuesta es mas compleja ocupamos las llaves {}
		
		IFuncional calculadora3 =(c,d) -> {
			Scanner input = new Scanner(System.in);
			System.out.println("Ingresa el primer numro a multiplicar");
			c= input.nextInt();
			System.out.println("Ingresa el segundo numro a multiplicar");
			d= input.nextInt();
			
			System.out.println(c*d);
		};
		
		calculadora3.operacion(0, 0);
		
		
		// nota si hay mas parametros de los que en teoria se van a ocipar si se deben declarar ya que si no el programa marcara error
		
		
		
	}

}
