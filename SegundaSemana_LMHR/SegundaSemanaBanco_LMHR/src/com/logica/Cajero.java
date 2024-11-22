package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	//en el paquete com.logica se encuentra la clase
	//encargada a resolver las operaciones
	
	//vamos a declarar atributos al cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar
	//el folio en el ticket
	
	private int  folio= 1;
	
	public Cajero () {}
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta consultar(int numeroCuenta) {
		// TODO Auto-generated method stub
		
		//Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta  = null; 
		
		//Asignamos una cuenta si existe en el hashMap
		cuenta= cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		//vamos a buscar la cuenta y necesitamos hacer variaciones
		//Si se encuentra se asigna para manipularla
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Una vez localizamos la cuenta se realizan ciertas validaciones 
			if(monto>9000) { //Validamos si el monto excee el maximo del cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			} else if (cuenta.getSaldo()<monto) {//Si el saldo es mayor al monto a retirar
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldominimo()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;	
			} else {//Si el retiro puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); //Realizamos el retiro
				//Si la operacion es exitosa ahora si se emite nuevo ticket
				ticket = new Ticket(folio++, new Date (), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;		
			}
		}else {
			System.out.println("No existe una cuenta sociada a ese cliente");
			return ticket;
		}
	
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		
		if (consultar (numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldomaximo()) {
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldomaximo()) {
				System.out.println("El saldo excederia el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date (), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;	
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
		
		
	}
	
	
	

}
