package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos a crear nuestra simulacion de base de datos hashMap
		Map<Integer,Cuenta> cuentas= new HashMap<Integer,Cuenta>();
		
		//para agregar cuentas en nuestro hashmap
		//forma 1 crear cuenta y agregarla
		
		Cuenta terron=new Cuenta("Terron", 99999, 100, 999999, "Debito");
		cuentas.put(1001, terron);
		
		//forma 2 directamente en el hashmap
		cuentas.put(1002, new Cuenta("Usuario1", 120, 100, 5000, "Credito"));
		cuentas.put(1003, new Cuenta("Usuario2", 120, 100, 5000, "Debito"));
		cuentas.put(1004, new Cuenta("Usuario3", 120, 100, 5000, "Credito"));
		
		//para recuperar el valor del hashmap : a lo basico sin usar la herencia y demás conceptos
		//System.out.println(cuentas.get(1003));
		//como debe hacerse
		//Crear objeto cajero que va a hacer las operaciones
		Cajero cajero=new Cajero("Angelopolis", cuentas);
		
		//se va a probar el método consultar
		System.out.println(cajero.consultar(1003));
		
		//probar metodo de retiro
		System.out.println(cajero.retirar(1001, 500));
		//retiro por debajo del minimo
		System.out.println(cajero.retirar(1002, 9999));
		
		//retiro de cuenta inexistente
		System.out.println(cajero.retirar(10010, 9999));
		
		//depositar pruebas
		System.out.println(cajero.depositar(1001, 501));
	}

}
