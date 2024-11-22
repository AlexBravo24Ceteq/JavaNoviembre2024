package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos { //IMetodos tiene las abstracciones de métodos que tenemos que hacer, provieniente de otras clases.
	//Pero Cajero tiene que resolver que hacen esos métodos.

	private String sucursal;
	private Map<Integer,Cuenta> cuentas; //Este mapa guarda un indice y objetos tipo Cuenta. 
	private int folio=1; //PAra llevar la cuenta de las operaciones hechas, o tickets impresos.
	
	
	public Cajero() {} //ESta cosa sigue siendo un objeto, así que debemos de poner sus constructores.
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		
		Cuenta cuenta = null;// este método necesita regresar una cuenta. Imposible si no tiene objeto tiempo Cuenta para poder regresarlo. Aquí declaro uno vacío.
		cuenta = cuentas.get(numeroCuenta);//obtengo el que necesito
		return cuenta;//y lo regreso.
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		
		Ticket ticket = null; // De nuevo, esto necesita un objeto Ticket. 
		//Alguien ya hace el trabajo por mi. Usemos consultar.
		//Primero localizemos la cuenta, para manipularla.
		if (consultar(numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);// La encontramos. Coloquemosla en un objeto cuenta, pera poder usar sus métodos y otras manipulaciones.
			if(monto>9000) { //Una validación más sobre el monto. Total ya encontramos la cuenta.
				System.out.println("Monto máximo de retiro excedido");
				return ticket;//Evita la operación regresando un valor. Aqui termina.
			} else if (cuenta.getSaldo()<monto) {// Si el saldo es menor...
				System.out.println("Chavo eres pobre");
				return ticket; // Vuelve a terminarlo!
			} else if (cuenta.getSaldo()-monto < cuenta.getSaldoMin()) {
				System.out.println("Este retiro te dejaría pobre. RECHAZADO.");
				return ticket;
			} else {//ok , todo salió bien.
				cuenta.setSaldo(cuenta.getSaldo()-monto); //ahora si quitale el dinero.
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1); // Actualiza el ticket a imprimir.
				return ticket; //no se te olvide regresarlo.
			}
			
			
		}else {
		 System.out.println("No existe tal cuenta. Mentiroso.");
		 return ticket;
		}
		
		
		//return null;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null; // De nuevo, esto necesita un objeto Ticket.

		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);// La encontramos. Coloquemosla en un objeto cuenta, pera poder usar
													// sus métodos y otras manipulaciones.
			if (monto > cuenta.getSaldoMax()) { // Una validación más sobre el monto. Total ya encontramos la cuenta.
				System.out.println("No tienes más espacio! Actualiza tu cuenta a premium.");
				return ticket;// Evita la operación regresando un valor. Aqui termina.
			} else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {// Si el saldo es mayor...
				System.out.println("Tu saldo sería demasiado. Buscate otro banco.");
				return ticket; // Vuelve a terminarlo!
			} else {// ok , todo salió bien.
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1); // Actualiza
																												// el
																												// ticket
																												// a
																												// imprimir.
				return ticket; // no se te olvide regresarlo.
			}

		} else {
			System.out.println("No existe tal cuenta. Mentiroso.");
			return ticket;
		}
	}

}
