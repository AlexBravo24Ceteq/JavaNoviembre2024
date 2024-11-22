package com.logica;

import java.nio.file.spi.FileSystemProvider;
import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	//en el paquetecom.logica se encuentra la clase que se encarga en resolver las operaciones
	//vamos a declarar atrivutos de nuestro cajero
	
	private	String sucursal;
	private Map<Integer, Cuenta> cuentas;
	//Declarar  una variable auxiliar  para incrementar el folio  de nuestro ticket
	private int folio= 1;
	
	public Cajero() {
		
	}
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos tener una cuenta basia inicialmente
		Cuenta cuenta = null;
		
		//Entonces asignamos si la cuenta si existe ne el HashMap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		
		Ticket ticket = null;
		//vamos a buscar la cuenta y necesitamos hacer validaciones
		//primero si se encuentra o localizarla la sigamos para manipularla
		
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una vez localicemos la cuenta para manipular realizamos ciertas validaciones
			
			if(monto>9000) {//Validamos si el monto excede al maximo del cajero
				System.out.println("El monto excede al maximo permitido por el cejero");
				
				return ticket;
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("saldo insuficiente para realizar el retiro");
				return ticket;
			}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("el retiro deejaria al saldo minimo de la cuenta");
				return ticket;
			}else {//si el retiro puede realizarse actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);//realizamos el retiro
				//entonces creamos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {System.out.println("no existe una cuenta asociada a ese cliente");
		return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		
		if(consultar(numeroCuenta)!= null) {
			Cuenta cuenta = consultar(numeroCuenta);
			if(monto>cuenta.getSalMax()) {
				System.out.println("el monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo() + monto >cuenta.getSalMax()) {
				System.out.println("El saldo excederia el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("no hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

}
