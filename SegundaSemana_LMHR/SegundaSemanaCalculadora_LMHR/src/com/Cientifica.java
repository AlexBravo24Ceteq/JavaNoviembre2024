package com;

public class Cientifica extends Calculadora{
	
	public Cientifica () {}

//	private String marca;
//	private String color;
//	private boolean solar;

	


////
//	public Cientifica(String marca, String color, boolean solar) {
//		super();
//		this.marca = marca;
//		this.color = color;
//		this.solar = solar;
//	}
//
//	public String getMarca() {
//		return marca;
//	}
//
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public boolean isSolar() {
//		return solar;
//	}
//
//	public void setSolar(boolean solar) {
//		this.solar = solar;
//	}

//	@Override
//	public String toString() {
//		return "Cientifica [marca=" + marca + ", color=" + color + ", solar=" + solar + ", toString()="
//				+ super.toString() + "]";
//	}

	@Override
	public void sumar(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println("suma:" + (a+b+c));
		
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("resta:" + (a-b));
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("multiplicacion: " + (a*b*c));
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("division:" + (a/b) );
	}
	
	
	 
	

}
