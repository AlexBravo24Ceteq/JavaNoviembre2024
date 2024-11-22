package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Cientifica calculadora1=new Cientifica();
		
		calculadora1.setColor("blanca");
		
		calculadora1.setMarca("Casio");
		
		calculadora1.setTamaño("grande");

		
		calculadora1.sumar(1, 2, 3);
		calculadora1.restar(3, 2, 1);
		calculadora1.multiplicar(1, 2, 3);
		calculadora1.dividir(2, 1);	
		
		
		
		System.out.println(calculadora1);

	}

}
