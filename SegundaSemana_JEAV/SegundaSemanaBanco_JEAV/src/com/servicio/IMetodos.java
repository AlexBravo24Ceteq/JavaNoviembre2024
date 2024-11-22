package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	public Cuenta consulta (int numeroCuenta);
	public Ticket retirar (int numeroCuenta, double monto);
	public Ticket depositar (int numeroCuenta, double monto);

}
