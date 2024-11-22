package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	//aca se declaran las operaciones que la clase encargada de la logica tendra que resolver
	
	//consultar cuenta de banco
	public Cuenta consultar(int numeroCuenta);
	
	//retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);
	
	//depositar recursos en la cuenta
	public Ticket depositar(int numeroCuenta, double monto);
	

}
