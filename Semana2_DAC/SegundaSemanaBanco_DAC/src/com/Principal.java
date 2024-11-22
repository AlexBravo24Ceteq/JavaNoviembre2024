package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// vamos a crear nuestra base de datos
		//declaramos nuestro HashMap
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		//Para agregar cuentas en el HashMap podemos hacerlo de dos formas
		//Creando la cuenta y agregarla despues
		
		Cuenta alex = new Cuenta("Alex",13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//Segunda forma de agregar cuentas en el HashMap  crendolas directamente en el Hashmap
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Recapitulando para recuperar el valor de una cuenta en mi hashmap
			//System.out.println(cuentas.get(1003));
		/*
		//Crear nuevo cajero
		
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1006));
		
		
		//Probando el metodo retirar exitoso
		
		System.out.println(angelopolis.retirar(1001, 9000));
		
		System.out.println(angelopolis.retirar(1001, 1000));		
		
		
		//Retirar dinero de una cuenta que no existe
		
		System.out.println(angelopolis.retirar(1006, 1000));	
		

		//Probar el método depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 10000));
		
		System.out.println(angelopolis.depositar(1003, 100));
		
		*/
		
		
		
		
		//creamos el menu a consultar
		String operacion;
		
		System.out.println("Coloca la operación deseada");
		System.out.println("Consultar");
		System.out.println("Retirar");
		System.out.println("Depositar");
		Scanner op = new Scanner(System.in);
		operacion=op.next();
		
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		if(operacion.equalsIgnoreCase("consultar")) {
			System.out.println("Coloca la cuenta que deseas consultar");
			int numeroDeCuenta;
			Scanner num = new Scanner(System.in);
			numeroDeCuenta = num.nextInt();
			System.out.println(angelopolis.consultar(numeroDeCuenta));
			
			
		}else if(operacion.equalsIgnoreCase("retirar")) {
			System.out.println("Coloca la cuenta a la que deseas retirrar");
			int numeroDeCuenta;
			Scanner num = new Scanner(System.in);
			numeroDeCuenta = num.nextInt();
			
			System.out.println("Coloca el monto a retirar");
			int monto;
			Scanner num2 = new Scanner(System.in);
			monto= num2.nextInt();
			System.out.println(angelopolis.retirar(numeroDeCuenta, monto));
			
			
		}else if(operacion.equalsIgnoreCase("depositar")) {
			System.out.println("Coloca la cuenta a la que deseas depositar");
			int numeroDeCuenta;
			Scanner num = new Scanner(System.in);
			numeroDeCuenta = num.nextInt();
			
			System.out.println("Coloca el monto a depositar");
			int monto;
			Scanner num2 = new Scanner(System.in);
			monto= num2.nextInt();
			System.out.println(angelopolis.depositar(numeroDeCuenta, monto));
			
		}else {
			System.out.println("Favor de colocar una operación valida");
		}
		
		
		
		
	}

}
