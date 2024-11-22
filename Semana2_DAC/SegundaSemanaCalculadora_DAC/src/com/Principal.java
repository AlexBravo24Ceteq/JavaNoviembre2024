package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cientifica casio = new Cientifica("Casio", "Negro", true, "MG250", "AAA", 10);
		
		
		casio.sumar(2, 3);
		casio.sumar(2, 3, 4);
		
		casio.restar(52, 25);
		casio.restar(153, 125, 10);
		
		casio.multiplicar(3);
		casio.multiplicar(5, 4);
		
		casio.dividir(10, 2);
		casio.dividir(24);
		
		
		
		
		
		
		
	}

}
