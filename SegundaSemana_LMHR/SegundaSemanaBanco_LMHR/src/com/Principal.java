package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vamos a crear nuestra base de datos 
		
		//Declaramosnuestro HashMap
		Map <Integer,Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//APara agregar cuentas en nuestro HashMap
		// Crear la cuenta y agregandola despues 
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		// Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("BereNice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Carlos", 500, 100, 10000, "Debito"));
		
		// para recuperar el valor de un objeto en mi hashMap
		//System.out.println(cuentas.get(1003));
		
		//Crearmi cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		//Probar el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Retirar dinero de una cuenta que no existe 
		System.out.println(angelopolis.consultar(1006));
		
		//probar metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 10000));

	}

}
