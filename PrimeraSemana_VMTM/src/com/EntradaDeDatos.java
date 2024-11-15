package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducir datos con clase scan
		int nipUsuario;
		
		String password;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nip: ");
		nipUsuario=entrada.nextInt();
		
		System.out.println("Introduce tu contraseña: ");
		entrada.nextLine();
		password=entrada.nextLine();//espacios son aceptados

	}

}
