package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calculadora1 = new Cientifica();
		
		calculadora1.setColor("rojo");
		calculadora1.setMarca("casio");
		calculadora1.setTamaño("mediana");
		
		calculadora1.sumar(4, 6);
		
		calculadora1.restar(10, 4);
		
		calculadora1.dividir(8, 2);
		
		calculadora1.multiplicar(10, 5);
		System.out.println(calculadora1);

	}

}
