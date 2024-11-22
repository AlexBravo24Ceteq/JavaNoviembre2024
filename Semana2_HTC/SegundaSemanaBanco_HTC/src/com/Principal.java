package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
	//Aqui creamos la base de datos.
		
	//Hashmap time.
		
	Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
	//Hay que llenar el Map.
	
	Cuenta alex = new Cuenta ("Alex",13000,4000,50000,"Débito"); //Construimos un objeto "alex" tipo Cuenta. Cuenta tiene todos esos valores.
	cuentas.put(1001, alex); //ahora a ponerlo en la base de datos, o el Map.

	//Pero puedo colocarlas directamente en el Hashmap.
	cuentas.put(1002, new Cuenta("Berenice",1000,100,15000,"Débito")); //Usando put para colocarla, pero usando el segundo valor para generar la cuenta también.
	cuentas.put(1003, new Cuenta("Humberto",10000,100,20000,"Débito")); 
	cuentas.put(1004, new Cuenta("Pablo",500,100,10000,"Débito")); 
	
	//Nuevo Cajero
	Cajero angelopolis = new Cajero("Angelopolis",cuentas);
	
	System.out.println(angelopolis.consultar(1003));
	
	//vamos a probar el metodo retirar.
	System.out.println(angelopolis.retirar(1003, 5000));
	System.out.println(angelopolis.retirar(1003, 5000));
	
	System.out.println(angelopolis.retirar(1100, 5000));
	System.out.println(angelopolis.retirar(1004, 1000));
	
	System.out.println(angelopolis.depositar(1001, 250000));
	System.out.println(angelopolis.depositar(1004, 1000));
	
	
	
	}

}
