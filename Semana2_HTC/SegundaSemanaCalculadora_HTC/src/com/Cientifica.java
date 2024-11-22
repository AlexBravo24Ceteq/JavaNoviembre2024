package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {

	private double x =0;
	private double y =0;
	private double mem =0;
	
	Scanner input = new Scanner(System.in);
	
	public Cientifica() {
		
	}
	
	public Cientifica(String marca, int precio, boolean consciente) {
		super(marca, precio, consciente);
	}

	@Override
	public String toString() {
		return "Soy una calculadora científica. Mis especificaciones son: " + super.toString() + "";
	}

	@Override
	public void sum() {
	
		System.out.println("Ingresa el valor inicial.");
		mem = input.nextDouble();
		
		try {
			for (int i = 1 ; i!=0 ; i++) {
				
				System.out.println("Ingresa un número a sumar.Escribe STOP para detener la operación.");
				x = input.nextDouble();
				mem+=x;
				System.out.println(mem);
			}
		} catch (Exception e) {
			System.out.println("Resultado final: "+mem);
		}
		
		
	}
			@Override
	public void mult() {
		// TODO Auto-generated method stub

				System.out.println("Ingresa el valor inicial.");
				mem = input.nextDouble();
				
				try {
					for (int i = 1 ; i!=0 ; i++) {
						
						System.out.println("Ingresa el sigueinte multiplicante.Escribe STOP para detener la operación.");
						x = input.nextDouble();
						mem*=x;
						System.out.println(mem);
					}
				} catch (Exception e) {
					System.out.println("Resultado final: "+mem);
				}
	}

	@Override
	public void div() {
		System.out.println("Ingresa el dividendo.");
		x = input.nextDouble();
		System.out.println("Ingresa el divisor.");
		y = input.nextDouble();
		mem = x/y;
		System.out.println("Resultado: "+mem);
		
		
	}

	@Override
	public void abst() {

		System.out.println("Ingresa el valor inicial.");
		mem = input.nextDouble();
		
		try {
			for (int i = 1 ; i!=0 ; i++) {
				
				System.out.println("Ingresa un número a restar.Escribe STOP para detener la operación.");
				x = input.nextDouble();
				mem -= x;
				System.out.println(mem);
			}
		} catch (Exception e) {
			System.out.println("Resultado final: "+mem);
		}
		
		
	}

	
	
}
