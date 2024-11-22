package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//Aqui declaramos las operacion que la clase encargada de la logica tendra que resolver
	
	//Consultar una cuenta de banco
	public Cuenta consultar (int numeroCuenta);
	
	//retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);
	
	//Depositar recursos en nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);
}
