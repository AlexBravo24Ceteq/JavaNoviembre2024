package com;

public class Principal {

	public static void main(String[] args) {
		
		// EJERCICIO CALCULADORA
		
		Cientifica casio = new Cientifica("Casio", "Negra", true, 150, "XW-9000");

		// Sumas
		casio.sumar(10, 5);
		casio.sumar(3, 48, 1);
		// Restas
		casio.restar(12, 4);
		casio.restar(25, 15, 10);
		// Multiplicacion
		casio.multiplicar(3, 3);
		casio.multiplicar(10, 480, 1);
		// Dividir
		casio.dicidir(15, 3);
		casio.dicidir(58, 2, 4);
	}

}
