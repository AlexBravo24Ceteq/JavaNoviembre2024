package com.servicio;

import com.modelo.Cuenta; //Cuenta es importado para que podamos crear métodos tipo cuenta.
import com.respuesta.Ticket; // lo mismo con ticket

public interface IMetodos {

	//aquí declaramos las operaciones que la clase encargada de lógica debe resolver.
	
	//Consultar cuenta de banco
	
	public Cuenta consultar(int numeroCuenta);
	
	//retirar recursos de nuestra cuenta
	
	public Ticket retirar (int numeroCuenta, double monto); //básicamente, estamos declarando un "retirar", que es una acción o método, de la clase Ticket. Lo mismo arriba.
	public Ticket depositar (int numeroCuenta,double monto); // Ticket lo hace porque es lo que queremos que maneje todo si la operación se hace correctamente.
}
