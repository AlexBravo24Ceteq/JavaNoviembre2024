package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////Expresiones lamda
		/*
		 * Son conocidas tambien como expresiones anonimas
		 * las cuales implementan un metodo de una interface
		 * funcinal
		 * 
		 * El operador es ->
		 * 
		 * y la sintaxis es la siguiente 
		 * (parametros) -> {cuerpo de lambda}
		 * 
		 * (Con los parametros que vieien de mi metodo ) ->{ esto es lo que quiero que se ejecute}
		 * 
		 * 
		 */
		
		//Vamos a crear un objeto que nos permita immplementar la interface IFuncional
		//EL objetos se crea de una clase anonima para poder implementar la interface
		
		
		IFuncional calculadora =  (a,b) ->System.out.println(a+b);
		
		//Ahora podemos probar el metodo original de la interface
		//a travez del objeto calculadora
		
		calculadora.operacion(4,5);
		
		//La ventaja de las expresiones Lamnbda es que podemos solicitar 
		//con otro objeto y el mismo metodo alguna otra operacion
		
		IFuncional calculadora2 =  (a,b) ->System.out.println(a-b);
		
		calculadora2.operacion(4,5);
		
	}

}
