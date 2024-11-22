package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// aqui declramos las operciones que
	// la clase encrgada de la logica debe de resolver

	public Cuenta consultar(int numeroCuenta);

	// Retirr recursos de nuetra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// depositar recursos de nuetra cuenta
	public Ticket depositar(int numeroCuenta, double monto);

}
