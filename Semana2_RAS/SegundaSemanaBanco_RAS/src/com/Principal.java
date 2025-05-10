package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vamos a crear nuestra BD
		
		//Declaramos nuestro HashMap
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		//Nescecitamos crear un onjeto de cuenta
		Cuenta alex = new Cuenta("Alejandro", "Debito", 13000, 4000, 50000);
		
		cuentas.put(1001, alex);
		
		//Creando las cuentas directamente en el hashMap
		cuentas.put(1002, new Cuenta("Berenice", "Debito", 1000, 100, 15000));
		cuentas.put(1003, new Cuenta("Humberto", "Debito", 2000, 100, 25000));
		cuentas.put(1004, new Cuenta("Pablo", "Debito", 500, 100, 10000));
		cuentas.put(1005, new Cuenta("Jose", "Debito", 23000, 100, 50000));
		
		//Para recuperar o imprimir 
		
		//System.out.println(cuentas.get(1003));
		Cajero cajero1 = new Cajero("Angelopolis", cuentas);
		//Probar  el metodo consultar
		
		//System.out.println(cajero1.consultar(1002));
		
		//Probar metodo retirar exitoso
		//System.out.println(cajero1.retirar(1004, 1000));
		//System.out.println(cajero1.retirar(1006, 1000));
		//System.out.println(cajero1.retirar(1005, 8000));
		System.out.println(cajero1.depositar(1000, 30000));
		
	}

}
