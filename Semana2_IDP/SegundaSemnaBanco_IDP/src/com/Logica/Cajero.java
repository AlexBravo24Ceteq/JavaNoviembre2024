package com.Logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// en el paquete com.logica e encuentra la clae encargaa
	// de resolver las operaciones

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	// declaramos una variable auxiliar para incrementar bnuestro folio
	private int folio;

	public Cajero() {

	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public Map<Integer, Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Map<Integer, Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "Cajero [sucursal=" + sucursal + ", cuentas=" + cuentas + ", folio=" + folio + "]";
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// ncesitamos crear una cuenta vacia
		Cuenta cuenta = null;

		// entonces asignamo la cuenta al hahMap
		cuenta = cuentas.get(numeroCuenta);

		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		//vamos a bucra nuna cunta y hacer algunas validacione
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una vez localizamos la cuenta para manipulr
			//realizamos validacion
			if(monto>9000) {
				System.out.println("el monto de retiro excede el maximo permitido por el cajero");
			    return ticket;
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente paa realizar el retiro");
				return ticket;
			}else if(cuenta.getSaldo()- monto<cuenta.getSaldoMin()) {
				System.out.println("el retiro lo deja por debajo del minimo a la cuenta");
				return ticket;
			}else {// si el rtiro se puede realizar
				cuenta.setSaldo(cuenta.getSaldo()- monto);	
				// como la operacion e exitosa ahora si devolvemos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
			
			
		}else {
		
		System.out.println("No existe una cuenta para hcer retiro");
		return ticket;
		}
	
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(consultar (numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//validaciones
			if(monto>cuenta.getSaldoMax()) {
				
				System.out.println("el monto a epositar excede el maximo permitido");
			return ticket;
			
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				
				System.out.println("el saldo excederia el maximo permitido en l cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);

				return ticket;
			}
		}else {
		System.out.println("no hay una cuent asociada a ese cliente");
		return ticket;
		}
	}

}
