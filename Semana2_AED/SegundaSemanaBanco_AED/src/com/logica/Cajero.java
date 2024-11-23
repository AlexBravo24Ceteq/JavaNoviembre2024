package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	// En el paquete com.logica se encuentra la clase
	// encargada de resolver las operaciones
	
	// Vamos a delcarar unos atributos del cajero
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	// Declarar una variable auxiliar para incrementar el folio en 
	//nuestri ticket
	private int folio = 1;
	
	public Cajero() {
		
	}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
	
		// Nesecitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;
		// Entonces asiganmos posteriormente la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {		
		Ticket ticket = null;
		
		// Vamos a buscar la cuenta y nesecitamos unas validaciones 
		// Primero si se encuentra o localiza la cuenta, la asignamos para manipularla
		// para manipular
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// Una vez localizamnos la cuenta para manipular realizamos cietas 
			// validaciones
			if(monto>9000) { // validamos si el monto excede el monto maximo del cajero
				System.out.println("El monto excede el monto maximo permitido por el cajero");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {// Si el saldo es menor mandamos un mensaje 
				System.out.println("Saldo insuficionete para realizar el retiro");
				return ticket;
			}else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo la cuenta");
				return ticket;
			}else {// si el retiro puede realizarse
				cuenta.setSaldo(cuenta.getSaldo() - monto);// realizamos el retiro
				// Entonces ahora si emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {			
		System.out.println("No existe una cuenta asociada a ese cliente");
		return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
	    Ticket ticket = null;
	    if (consultar(numeroCuenta) != null) {
	    	Cuenta cuenta = consultar(numeroCuenta);
	    	//Validaciones
	    	if(monto>cuenta.getSaldoMax()) {
	    		System.out.println("El monto a depositar exede el maximo permitido en la cuenta");
	    		return ticket;
	    	}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
	    		System.out.println("El saldo exede el maximo permitido en la cuenta");
	    		return ticket;
	    	}else {
	    		cuenta.setSaldo(cuenta.getSaldo()+monto);
	    		ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
	    		return ticket;
	    	}
	    }else {
	    	System.out.println("No hay una cuenta asociada a ese cliente ");
	    	return ticket;
	    }		
	}

}
