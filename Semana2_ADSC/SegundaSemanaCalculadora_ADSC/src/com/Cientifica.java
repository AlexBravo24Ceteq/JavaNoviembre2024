package com;

public class Cientifica extends Calculadora {

	private int existencias;
	private String proveedor;

	public Cientifica() {

	}

	public Cientifica(String marca, String color, String modelo, int existencias, String proveedor) {
		super(marca, color, modelo);
		this.existencias = existencias;
		this.proveedor = proveedor;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Cientifica [existencias=" + existencias + ", proveedor=" + proveedor + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println("El resultado de " + a + "+" + b + " es= " + (a + b));

	}

	@Override
	public void restar(int a, int b) {
		System.out.println("El resultado de " + a + "-" + b + " es= " + (a - b));

	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de " + a + "x" + b + " es= " + (a * b));

	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("El resultado de " + a + "/" + b + " es= " + (a / b));
		

	}

}
