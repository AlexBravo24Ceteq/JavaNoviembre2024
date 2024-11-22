package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// En el paquete com.logica se encuentra la clase encargada de resolver
	// operaciones
	// vamos a declara atributos al cajero
	private String sucursa;
	private Map<Integer, Cuenta> cuentas;

	// Declarar una variable auxiliar para incrementar el folio en el ticket
	private int folio = 1;

	public Cajero() {
	}

	@Override
	public String toString() {
		return "Cajero [sucursa=" + sucursa + ", cuentas=" + cuentas + "]";
	}

	public String getSucursa() {
		return sucursa;
	}

	public void setSucursa(String sucursa) {
		this.sucursa = sucursa;
	}

	public Map<Integer, Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Map<Integer, Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public Cajero(String sucursa, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursa = sucursa;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;
		// Asignamos posterior mente la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);

		return cuenta;

	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		//
		Ticket ticket = null;
		// vamos a buscar la cuenat y necesitamos hacer unas validaciones
		// Primero si se encuentra o localiza la cuenta la asignamos para manipularla
		if (consultar(numeroCuenta) != null) {

			Cuenta cuenta = consultar(numeroCuenta);
			// Una vez localizada la cuenta para manipular realizamos ciertas validaciones

			if (monto > 9000) {// validamos si el monto excede el maximo que delimita el cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			} else if (cuenta.getSaldo() < monto) {// Si el saldo es menor al monto a retirar

				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;

			} else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {

				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;

			} else {// si el retiro puede realizarse actualizamos el saldo

				cuenta.setSaldo(cuenta.getSaldo() - monto);// Realizamos el retiro

				// Emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursa, 1);

				return ticket;
			} // cierre del ultimo else

		} else {
			System.out.println("No existe una cuenta asociada a ese cliente");

			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;

		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);

			// Validaciones
			if (monto > cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el máximo permitido en la cuenta");
				return ticket;

			} else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {

				System.out.println("El saldo excederia el máximo permitido en la cuenta");
				return ticket;

			} else {

				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursa, 1);
				return ticket;
			}
		} else {

			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}

	}

}
