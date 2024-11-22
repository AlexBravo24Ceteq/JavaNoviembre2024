package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos nuestro hashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//para agregar cuentas a nuestro HashMap podemos hacerlo de dos formas
		
		//creando una cuenta y agregandolar despues
		
		Cuenta Alex = new Cuenta("Alex", 13000, 4000, 500000, "Debito");
		
		cuentas.put(1001, Alex);
		
		//creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Luis", 20000, 6000, 600000, "Debito"));
		cuentas.put(1004, new Cuenta("Adriana", 25000, 5000, 750000, "Debito"));
		
		//si nos acordamos, para recuperar el valor de un objeto en mi HashMap
		
	//	System.out.println(cuentas.get(1003));
		
		Cajero santander = new Cajero ("Engelopolis", cuentas);
		
		System.out.println(santander.consultar(1006));
		
		//probar el metodo retirar
		System.out.println(santander.retirar(1001, 8000));
		System.out.println(santander.retirar(1001, 90000));
		
		//quiero retirar dinero de una cuenta que no existe
		System.out.println(santander.retirar(1002, 8000));
		
		//probar el metodo de deposito exitoso
		System.out.println(santander.depositar(1001, 5000));
		System.out.println(santander.depositar(1002, 16000));
		System.out.println(santander.depositar(1004, 16000));
	}

}
