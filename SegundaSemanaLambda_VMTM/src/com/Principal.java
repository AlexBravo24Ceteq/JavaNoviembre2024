package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Expresiones Lambda
		//tambien conocidas como expresiones anonimas
		//las cuales implementan un método de una interface
		//funcional
		
		//El operador es ->      y la sintaxis es (parametros) -> {cuerpo de Lambda}
		/* 
		 * (Con esos parametros que provienen de mi metodo)  ->  {quiero que ejecutes esto}
		 */
		//Vamos a crear un objeto para implementar la IFuncional. El objeto se crea de una 
		//interfaz anónima para poder implementar la interfaz
		
		IFuncional calculadora=(x,y)->System.out.println(x+y);
		IFuncional calculadora0=(x,y)->System.out.println(x-y);
		
		//Ahora se puede probar el metodo original de la interface a travez de calculadora
		calculadora.operacion(5, 8);
		calculadora0.operacion(5, 5);
		
		//la ventaja de las Lambda es que podemos solicitar con otro objeto y el mismo
		//método alguna operación
		IFuncional calculadora1=(x,y)->System.out.println(x*y);
		calculadora1.operacion(10, 10);
		
		//Si tenemos una sintaxis más larga entonces ya ocupamos las llaves en el cuerpo Lambda
		IFuncional calculadora2=(x,y) -> {
			Scanner entrada=new Scanner(System.in);
			System.out.println("Ingresa el primer número a dividir: ");
			x=entrada.nextDouble();
			System.out.println("Ingresa el segundo número a dividir: ");
			y=entrada.nextDouble();
			System.out.printf("El resultado de la división es: %.2f",(x/y));
		};
		calculadora2.operacion(0, 0);
		
		//decidi modificar la interfaz funcional a valores double para poder recibir puntos 
		//decimales en lugar de solo enteros
		
	}

}
