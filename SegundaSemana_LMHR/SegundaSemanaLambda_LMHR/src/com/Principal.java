package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXPRESIONES LAMBDA
		//Son tambien conocidas como expresiones anonimas
		//las cuales implementan un metodo de una interface funcional
		
		//operador ->
		//sintaxis: (parametros) -> {Cuerpo de lambda}
		
		//es decir 
		//(con estos parametros que propvienen de mi metodo)-> {Esto quiero que se ejecute}
		
		
		//Vamos a crear un objeto que nos permita implementar la
		//interface IFuncional
		
		//el objeto se crea de una clase anonima para poder implementar la interface
		IFuncional calculadora = (x,y) -> System.out.println(x+y); 
		
		//Ahora podemos probar el metodo original de la interface
		// a traves del objeto calculadora
		
		calculadora.operacion(4, 5);
		
		//la ventaja de las expresiones lambda es que podemos solicitar otro objeto
		//con el mismo objeto y el mismo metodo alguna tra operacion
		
		IFuncional calculadora2 = (a,b) -> System.out.println(a-b);
		calculadora2.operacion(10, 7);
		
		//Si tenemos una sintaxis mas larga entonces si se ocupan las llaves del cuepo
		//de lambda
		
		IFuncional calculadora3 = (c, d) -> {
			
			Scanner input = new Scanner(System.in);
			System.out.println("ingresa el primer numero");
			c= input.nextInt();
			System.out.println("ingresa el segundo numero");
			d= input.nextInt();
			
			System.out.println(c*d);
		};
		
		calculadora3.operacion(0, 0);

	}
}
