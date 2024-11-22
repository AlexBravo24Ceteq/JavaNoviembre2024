package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{
	
	private double temp=0, res=0, numero=0;
	private char r='y';
	Boolean bandera=true;
	Scanner entrada = new Scanner(System.in);
	
	public Cientifica(){}
	
	public Cientifica(String marca, String color, String precio) {
		super(marca, color, precio);
	}



	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public Boolean getBandera() {
		return bandera;
	}

	public void setBandera(Boolean bandera) {
		this.bandera = bandera;
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	
	public double ingresarNumero() {
		System.out.println("Ingresa un numero");
		numero= entrada.nextDouble();
		
		return numero;
	};

	@Override
	public void suma() {
		// TODO Auto-generated method stub
		
		
		while(r=='y') {
			temp=ingresarNumero();
			res=res+temp;
			System.out.println("La suma es: "+res);
			System.out.println("Deseas sumar otro nuemro? y/n");
			r = entrada.next().charAt(0);
		}
		System.out.println("Resultado final de la operacion= "+res);
		
		
	}

	@Override
	public double suma(double x, double y) {
		// TODO Auto-generated method stub
		res=x+y;
		return res;
	}

	@Override
	public void restar() {
		
		double temp1=ingresarNumero();
		double temp2=ingresarNumero();
		res=temp1-temp2;
		System.out.println("La resta es= "+res);
		System.out.println("Deseas restar otro nuemro? y/n ");
		r = entrada.next().charAt(0);
	
		
		while(r=='y') {
			temp=ingresarNumero();
			res=res-temp;
			
			System.out.println("Deseas restar otro nuemro? y/n ");
			r = entrada.next().charAt(0);
		}
			System.out.println("Es resultado final de la operacion es= "+res);
		
		
	}

	@Override
	public double restar(double x, double y) {
		res=x-y;
		return res;
	}

	@Override
	public void multiplicar() {
		
		double temp1=ingresarNumero();
		double temp2=ingresarNumero();
		res=temp1*temp2;
		System.out.println(temp1+" x "+temp2+" = "+res);
		System.out.println("Deseas multiplicar por otro numero? y/n ");
		r = entrada.next().charAt(0);
	
		
		while(r=='y') {
			temp=ingresarNumero();
			res=res*temp;
			System.out.println("Deseas multiplicar x otro nuemro? y/n ");
			r = entrada.next().charAt(0);
		}	
			System.out.println("Resultado final de la operacion = "+res);
			
		
	}

	@Override
	public double multiplicar(double x, double y) {
		// TODO Auto-generated method stub
		res=x*y;
		return res;
	}

	@Override
	public void dividir() {
		
		double temp1=ingresarNumero();
		double temp2=ingresarNumero();
		
		if(temp2==0) {
			
			System.out.println("No es posible dividir entre 0 byeee");
			
		}else {
			res=temp1/temp2;
			System.out.println(temp1+" x "+temp2+" = "+res);
			System.out.println("Deseas dividir por entre otro numero? y/n ");
			r = entrada.next().charAt(0);
		
			
			while(r=='y') {
				temp=ingresarNumero();
				if(temp==0) {
					System.out.println("No es posible dividir entre 0 byeee");
				}else {
					res=res/temp;
					System.out.println("Deseas dividir entre otro numero? y/n ");
					r = entrada.next().charAt(0);
				}
			}	
				System.out.println("Resultado final de la operacion = "+res);
		}	
		
	}

	@Override
	public double dividir(double x, double j) {
		// TODO Auto-generated method stub
		if(j==0) {
			System.out.println("No es posible dividir entre 0 byeee");
		}
		else {
		res=x/j;
		}
		return res;
	}
	
	

}
