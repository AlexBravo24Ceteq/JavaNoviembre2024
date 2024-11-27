package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Vamos a crear nuestra base de datos

		// Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// Para agregar "cuentas" en nuestro HashMap podemos hacerlo de dos formas:
		// 1.- Creando la cuenta y agregandola despues:
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Débito");

		cuentas.put(1001, alex);

		// 2.- Creando las cuentas directamente en el HashMap:
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Débito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Débito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Débito"));

		// Si nos acrodamos, para recuperar el valor de un objeto en mi HashMap es:
		// System.out.println(cuentas.get(1003));

		// Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);

		// Probar el método consultar
		System.out.println(angelopolis.consultar(1006));
		
		//Probar el método retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));

		//Retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Probar el método depositar exitoso:
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 21000));
	}

}
