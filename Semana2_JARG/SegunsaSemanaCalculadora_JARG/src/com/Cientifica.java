package com;

public class Cientifica extends Calculadora{

	
	
//	private String marca;
//	private String color;
//	private String tamaño;
	
	
	
	
	public Cientifica() {}
	
	
	
//	@Override
//	public String toString() {
//		return "Cientifica [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + ", toString()="
//				+ super.toString() + "]";
//	}
	public void sumar(int a, int b, int c) {	
		System.out.println("La suma es: "+(a+b+c));
	}
	public void restar (int a, int b, int c) {
		System.out.println("La resta es: "+(a-b-c));
	} 
	public void multiplicar (int a, int b, int c) {
		System.out.println("La multiplicación es: "+(a*b*c));
	} 
	public void dividir (int a, int b) {
		System.out.println("La división es: "+(a/b));
	} 

	
	
	
	
	
}
