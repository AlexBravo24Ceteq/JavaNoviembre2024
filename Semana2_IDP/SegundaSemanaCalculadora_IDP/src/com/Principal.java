package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cientifica calcu1 = new Cientifica();
		calcu1.setMarca("casio");
		calcu1.setPantalla("LCD");
		calcu1.setColor("gris");
		calcu1.setTipo("grafica");
		System.out.println(calcu1);
		
		calcu1.sumar(2, 6);
		calcu1.restar(5, 10);
		calcu1.multiplicar(3, 5);
		calcu1.dividir(10, 10);
		
		//metodos propios de cientifica
		
		System.out.println(calcu1.sumar(300, 40, 0));
		System.out.println(calcu1.restar(100, 2000, 0));
		System.out.println(calcu1.multiplicar(20, 400, 0));
		System.out.println(calcu1.dividir(300,4, 0));
		
		
		
		
	}

}
