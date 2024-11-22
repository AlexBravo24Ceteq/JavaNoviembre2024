package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();

		Cuenta jair = new Cuenta("Jair", 24000, 1000, 200000, "Debito" );
		cuentas.put(1001, jair);
		
		cuentas.put(1002, new Cuenta("Alex", 23400, 1000, 300000, "Debito")); 
		cuentas.put(1003, new Cuenta("Maria", 15000, 500, 150000, "Credito"));
		cuentas.put(1004, new Cuenta("Jose", 12000, 800, 200000, "Debito")); 
		cuentas.put(1005, new Cuenta("Ana", 18000, 1200, 250000, "Credito")); 
		cuentas.put(1006, new Cuenta("Luis", 22000, 900, 270000, "Debito"));
		
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		System.out.println("1) " + angelopolis.consulta(1001) + "\n");
		System.out.println("2) " + angelopolis.retirar(1002,2000) + "\n");
		System.out.println("3) " + angelopolis.retirar(1010,1000) + "\n");
		System.out.println("4) " + angelopolis.retirar(1004,1000000) + "\n");
		System.out.println("5) " + angelopolis.depositar(1004,1000) + "\n");
		System.out.println("6) " + angelopolis.depositar(1004,20000000));
		
	}

}
