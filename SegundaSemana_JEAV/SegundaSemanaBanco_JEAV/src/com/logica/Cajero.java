package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	
	private String sucursal;
	private Map<Integer,Cuenta> cuentas; 
	
	private int folio = 1;
	
	public Cajero() {
		
	}
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta consulta(int numeroCuenta) {
	
		return cuentas.get(numeroCuenta);
	}
	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
	    Cuenta cuenta = cuentas.get(numeroCuenta);
	    
	    if (cuenta == null) {
	        System.out.println("La cuenta con el numero " + numeroCuenta + " no existe.");
	        return null;
	    }

	    synchronized (cuenta) {
	        
	    	if (cuenta.getSaldo() < monto) {
	            System.out.println("Saldo insuficiente para realizar el retiro.");
	            return null;
	        }
	    	
	    
	        cuenta.setSaldo(cuenta.getSaldo() - monto);

	        Ticket ticket = new Ticket(
	            folio++,
	            new Date(),
	            cuenta.getUsuario(),
	            cuenta.getSaldo(),
	            sucursal,
	            1
	        );

	        return ticket;
	    }
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
	    Cuenta cuenta = cuentas.get(numeroCuenta);
	    
	    if (cuenta == null) {
	        System.out.println("La cuenta con el numero " + numeroCuenta + " no existe.");
	        return null;
	    }

	    synchronized (cuenta) {
	        if (monto <= 0) {
	            System.out.println("El monto a depositar debe ser mayor a cero.");
	            return null;
	        }
	        
	        if (cuenta.getSaldoMax() < monto) {
	            System.out.println("Deposito rechazado por limite de cuenta.");
	            return null;
	        }

	        cuenta.setSaldo(cuenta.getSaldo() + monto);

	        Ticket ticket = new Ticket(
	            folio++,
	            new Date(),
	            cuenta.getUsuario(),
	            cuenta.getSaldo(),
	            sucursal,
	            1
	        );

	        return ticket;
	    }
	}



	@Override
	public String toString() {
		return "Cajero [sucursal=" + sucursal + ", cuentas=" + cuentas + ", folio=" + folio + "]";
	}

}
