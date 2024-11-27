package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Expresiones Lambda
		// Son tambien conocidas como expresiones anónimas
		// Las cuales implementan un método de una interface funcional

		// El operador es ->
		// Su sintáxis es (parametros) -> {cuerpo de Lambda}

		/*
		 * (con estos parámetros que provienen de método) -> {esto es lo que quiero que
		 * se ejecute}
		 */

		// Vamos a crear un objeto que nos permita implementar la interface
		// IFuncuional. El objeto se crea de una clase anónina para poder
		// implementar la interface

		IFuncional calculadora = (x, y, z) -> System.out.println(x + y);

		// Ahora podemos probar el método orioriginal de la interface
		// a través del objeto calculadora

		calculadora.operacion(4, 5, 0);

		// La ventaja de las expresiones Lambda es que podemos solicitar
		// con otro objeto y el mismo método alguna otra operación
		IFuncional calculadora2 = (a, b, c) -> System.out.println(a - b);

		calculadora2.operacion(10, 7, 0);

		// Si tenermos una sintáxis más larga entonces ya ocupamos las llaves
		// en el cuerpo de Lambda
		IFuncional calculadora3 = (d, e, f) -> {

			Scanner input = new Scanner(System.in);
			System.out.println("Ingresa el primer número a multiplicar: ");
			d = input.nextInt();
			System.out.println("Ingresa el segundo número a multiplicar: ");
			e = input.nextInt();

			System.out.println(e * d);

		}; // en el caso de las expresiones Lambda, su llave de cierre sí lleva el punto y
			// coma

		// Aquí probamos la última implementación a través de calculadora3
		calculadora3.operacion(0, 0, 0);
	}

}
