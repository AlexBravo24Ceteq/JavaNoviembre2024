package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char oper;
		char respuesta='y';
		char r2;
		double x,y;
		
		
		Cientifica cal = new Cientifica("casio", "gris", "$300");
		
		while(respuesta=='y') {
			
				System.out.println("Bienvedio a esta calculadora");
				System.out.println("De la marca: "+cal.getMarca()+", de color: "+cal.getColor()+", de precio: "+cal.getPrecio());
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println();
				System.out.println("Que peracion deseas hacer?");
				System.out.println("Sumar .......> '+'");
				System.out.println("Restar ......> '-'");
				System.out.println("Multiplicar..> '*'");
				System.out.println("Dividir......> '/'");
				System.out.println();
				System.out.println("Ingresa el caracter de correspondiente: ");
				oper = entrada.next().charAt(0);
				
			
				
				switch (oper) {
				
				
				case '+':
					System.out.println("------------Vamos a sumar");
					System.out.println("Operacion sesinlla o compleja? s/c");
					r2=entrada.next().charAt(0);
					if(r2=='s') {
						System.out.println("Ingresa dos numeros");
						System.out.println("ingresa el primer numero");
						x=entrada.nextDouble();
						System.out.println("Ingresa el segundo numero");
						y=entrada.nextDouble();
						
						System.out.println("El resultado de la operacion es= "+cal.suma(x,y));
					}else if(r2=='c'){
					System.out.println();
					cal.suma();}
					break;
				case '-':
					System.out.println("------------Vamos a restar");
					System.out.println("Operacion sesinlla o compleja? s/c");
					r2=entrada.next().charAt(0);
					if(r2=='s') {
						System.out.println("Ingresa dos numeros");
						System.out.println("ingresa el primer numero");
						x=entrada.nextDouble();
						System.out.println("Ingresa el segundo numero");
						y=entrada.nextDouble();
						
						System.out.println("El resultado de la operacion es= "+cal.restar(x,y));
					}else if(r2=='c'){
					System.out.println();
					cal.restar();}
					break;
				case '*':
					System.out.println("------------Vamos a Multiplicar");
					System.out.println("Operacion sesinlla o compleja? s/c");
					r2=entrada.next().charAt(0);
					if(r2=='s') {
						System.out.println("Ingresa dos numeros");
						System.out.println("ingresa el primer numero");
						x=entrada.nextDouble();
						System.out.println("Ingresa el segundo numero");
						y=entrada.nextDouble();
						
						System.out.println("El resultado de la operacion es= "+cal.multiplicar(x,y));
					}else if(r2=='c'){
					System.out.println();
					cal.multiplicar();}
					break;
				case '/':
					System.out.println("------------Vamos a dividir");
					System.out.println("Operacion sesinlla o compleja? s/c");
					r2=entrada.next().charAt(0);
					if(r2=='s') {
						System.out.println("Ingresa dos numeros");
						System.out.println("ingresa el primer numero");
						x=entrada.nextDouble();
						System.out.println("Ingresa el segundo numero");
						y=entrada.nextDouble();
						
						System.out.println("El resultado de la operacion es= "+cal.dividir(x,y));
					}else if(r2=='c'){
					System.out.println();
					cal.dividir();}
									
					break;
				default: 
					System.out.println(oper);
					System.out.println("Ingresaste un elemento invalido byeee");
					System.out.println();
					break;
				}
				System.out.println("***************************************");
				System.out.println();
				System.out.println("Deseas realizar otra operacion ? y/n");
				System.out.println();
				respuesta=entrada.next().charAt(0);
				
				
		
		}
		System.out.println("Apagando calculadora...");
		
		
		
		

	}

}
