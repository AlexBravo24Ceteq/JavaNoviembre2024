package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Vamos a crear nuestra base de datos
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		
		//Para agregar cuentas en nuestro HashMap podemos hacerlo
		//de dos formas
		
		//La primera sería creando la cuenta y agregándola después
		
		Cuenta michi= new Cuenta("Michi", 13000,4000,50000, "Debito");
		
		cuentas.put(1001, michi);
		
		
		//La segunda forma es creando las cuentas directamente en el Hashmap
		
		cuentas.put(1002, new Cuenta("Johny", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Willy", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Josy", 500, 100, 10000, "Debito"));
		
		
		//Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		
		//System.out.println(cuentas.get(1003));
		
		//Crear mi nuevo Cajero
		Cajero angelopolis =new Cajero("Angelopolis",cuentas);
		
		//Probar el método consultar
		System.out.println(angelopolis.consultar(1001));
		
		
		//Probar método retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		System.out.println(angelopolis.retirar(1004, 1000));
		
		
		//Probar el método depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		System.out.println(angelopolis.depositar(1003, 10000));
	}

}
