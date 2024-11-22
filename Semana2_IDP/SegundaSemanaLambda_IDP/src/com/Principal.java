package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// expresiones lambda
		// son tambienconocidas como expresiones anonimas

		// el operador es ->
		// y la intaxis es la siguiente:
		// (parametros) -> {cuerpo de lambda}

		// (con los parametro)->{hago ue esto se ejecute}
		// vamos a crear un objeto que nos permita implementar la interface
		// IFuncional

		IFuncional calculadora = (x, y) -> System.out.println(x + y);

		calculadora.operacion(4, 6);

		IFuncional calculadora2 = (a, b) -> System.out.println(a - b);

		calculadora2.operacion(10, 6);

		// si tenemos un expreion mas gande utilizamos las llaves

		IFuncional calculadora3 = (c, d) -> {
			Scanner input = new Scanner(System.in);
			System.out.println("ingres el primer numero a multiplicar");
			c = input.nextInt();
			System.out.println("ingres el primer numero a multiplicar");
			d = input.nextInt();
			System.out.println(c*d);
		};
		
		calculadora3.operacion(0,0);


	}

}
