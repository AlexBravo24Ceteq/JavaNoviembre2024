package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	
	//En el paquete com.logica se encuentra la clase
	//encargada de resolver las operaciones
	
	//Vamos a declarar unos atributos de nuestro cajero
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar
	//el folio en nuestro ticket
	private int folio=1;
	public Cajero() {}
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	


	@Override
	public Cuenta consultar(int numeroCuenta) {
		//Necesitamos crear una cuenta vacía inicialmente
		
		Cuenta cuenta=null; 
		
		//Asignamos posteriormente la cuenta si existe en el HashMap
		cuenta=cuentas.get(numeroCuenta);
		
		return cuenta;
	
	
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket=null;
		
		//Vamos a nuscar la cuenta y necesitamos hacer unas validaciones
		//Primero, si se encuentra o localiza la cuenta, la asignamos
		//para manipularla
		
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta=consultar(numeroCuenta);
			//Una vez localizamos la cuenta para manipular
			//realizamos ciertas validaciones
			
			if (monto>9000) { //Validamos si el monto excede el máximo del cajero
				System.out.println("El monto excede el máximo permitido por el cajero");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
					
			} else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
				return ticket;
					
			}else { //Si el retiro puede realizarse
				//Actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);//Realizamos el retiro
				//Entonces ahora sí emitimos un nuevo ticket
				ticket= new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		
		} else {
			System.out.println("no existe una cuenta asociada al clienta");
		
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta=consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el máximo permitido en la cuenta");
				return ticket;
				
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo excedería el máximo permitido en la cuenta");
			return ticket;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			ticket= new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
			return ticket;
		}
		
		}else { 
			System.out.println("No hay una cuenta asociada a ese cliente");
	
		return ticket;
		}
		}

}
