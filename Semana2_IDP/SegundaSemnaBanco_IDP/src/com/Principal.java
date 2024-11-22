package com;

import java.util.HashMap;
import java.util.Map;

import com.Logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// vamos a crear nuetra base de datos
		// declaramos nuestro map

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		// para agregar cuenta en nuestro hahmap se puede hacer de dos formas
		// forma 1 creando cuenta y agregando despues

		Cuenta isai = new Cuenta("isai", 15000, 3000, 100000, "Debito");
		cuentas.put(1001, isai);

		// forma 2 de agregar cuenta en hashMap

		cuentas.put(1002, new Cuenta("Fulanito", 1000, 500, 20000, "Debito"));
		cuentas.put(1003, new Cuenta("Maria", 9000, 300, 25000, "Debito"));
		cuentas.put(1004, new Cuenta("Pepe", 1500, 100, 30000, "Debito"));

		// para recuperar el vlor de un hashMap

		// System.out.println(cuentas.get(1001));
		Cajero angelopolis = new Cajero("angelopolis", cuentas);

		// probamos el metodo consultar
		System.out.println(angelopolis.consultar(1001));

		// probamos el metodo retirar
		System.out.println(angelopolis.retirar(100, 4000));
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 4000));
		
		// probamos el metodo depositar
		System.out.println(angelopolis.depositar(1001, 9000));
		System.out.println(angelopolis.depositar(1001, 300000));
		System.out.println(angelopolis.retirar(1001, 4000));

	}

}
