package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// Aquí declaramos las operaciones que la clase encargada de la lógica
	// tendrá que resolver

	// Consultar una cuenta de banco
	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de nuestra cuenta:
	public Ticket retirar(int nuemroCuenta, double monto);

	// Depositar recursos de nuestra cuenta:
	public Ticket depositar(int nuemroCuenta, double monto);

}
