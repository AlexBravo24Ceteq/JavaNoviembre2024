package com.condicionales;

import java.util.Scanner;

public class Condicionales8_VMTM {
	//8.Realiza un programa que pida el día de la semana (del 1 al 7) 
	//y escriba el día correspondiente. Si introducimos otro número nos da un error.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el dia de la semana");
		int diaSemanal=entrada.nextInt();
		if(diaSemanal>7 || diaSemanal<1) {
			System.out.println("ERROR EN EL DÍA INTRODUCIDO");
			System.exit(1);
		}else if(diaSemanal==1) {
			System.out.println("Lunes");
		}else if(diaSemanal==2) {
			System.out.println("Martes");
		}else if(diaSemanal==3) {
			System.out.println("Miércoles");
		}else if(diaSemanal==4) {
			System.out.println("Jueves");
		}else if(diaSemanal==5) {
			System.out.println("Viernes");
		}else if(diaSemanal==6) {
			System.out.println("Sábado");
		}else {
			System.out.println("Domingo");
		}
	}

}
