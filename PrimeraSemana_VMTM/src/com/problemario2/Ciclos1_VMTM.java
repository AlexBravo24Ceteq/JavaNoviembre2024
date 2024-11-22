package com.problemario2;

import java.util.Scanner;

public class Ciclos1_VMTM {
	public static void main(String[] args) {
		//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		//no es claro el enunciado al establecer un limite, por lo que lo manejo por teclado
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce hasta que numero quieres hacer la tabla del 12: ");
		int limite=entrada.nextInt();
		if(limite<0) {
			System.out.println("El numero no puede ser menor a 0 ");
			System.exit(1);
		}else {
			System.out.println("Entré al ciclo");
			for(int i=0;i<limite+1;i++) {
				System.out.println("12*"+i+"= "+(12*i));
			}
		}
	}
}
