package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	//En el paquete com.logica se encuentra la clase
	//encargada de resolver las operaciones 
	
	//Vamos a declarar atributos de nuestro cajero 
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Vamos a declarar una variable auxiliar para incrementar el folio 
	//en un tickt
	
	private int folio=0;
	
	Cajero(){}
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	


	@Override
	public Cuenta consultar(int numeroCu) {
		//Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta =null;
		
		//ENtonces asiganamos la cuenta si existe en el hasMap
		cuenta=cuentas.get(numeroCu);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		
		Ticket ticket = null;
		//Vamos a buacar la xcuenta
		//SI se encuentra la cuneta la aisgnamos para manipularla
		if(consultar(numCuenta)!=null) {
			
			Cuenta cuenta= consultar(numCuenta);
			//Una vez loclicemos la cuenta para manipular 
			//Realicemos cierta validacion
			if(monto>9000) {//Se valida si el moento eccede el maximo que permite el cajero 
				System.out.println("Solo puedes retirar un monto de $9,000 maximo por dia ");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo inusficiente");
				return ticket;
			}else if(cuenta.getSaldo()-monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejara por debajo del minimo a la cuenta");
				return ticket;
			}else {//Si el retiro puede realizarse
					//Acutualizamos el saldo en nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Como la operacion es exitosa emitimos un nuevo ticket
				ticket = new Ticket(folio++, 1, new Date(), cuenta.getUsuario(), sucursal, cuenta.getSaldo());
				return ticket;
			}
		}else {
			System.out.println("No hay ninguna cuenta asociada con ese nuemro de cuneta");
			return ticket;
		}
		
		
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {	
		//Devolver un ticket 
		Ticket ticket =null;
		
		if(consultar(numCuenta)!=null) {
			Cuenta cuenta= consultar(numCuenta);
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("Este deposito eccederia el moento maximo permitido");
				return ticket;
			}else if(cuenta.getSaldo()+monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo eccederia el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, 1, new Date(), cuenta.getUsuario(), sucursal, cuenta.getSaldo());
				return ticket;
			}
		}else {
			
			System.out.println("No hay una cuenta asociada a un clinete");
			return ticket;
		}
		
	}
	

}
