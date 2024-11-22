package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//Declaramos la operaciones que la clase encargada 
	//de la logica tendra que resolver
	
	//Consultar una cuenta de banco
	public Cuenta consultar(int numeroCu);
	
	//Retirar recursos de la cuenta
	public Ticket retirar(int numCuenta, double monto);
	
	//	//Depositar recursos en la cuenta
	public Ticket depositar(int numCuenta, double monto);
	
	
	
	
	
}
