package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	//en el paquete com.logica se encuentra la clase encargada de resolver la logica
	
	//atributos del cajero
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;
	
	//declaramos variable auxiliar para incrementar folio de nuestro ticket
	private int folio=1;
	
	public Cajero() {}
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	



	@Override
	public Cuenta consultar(int numeroCuenta) {
		// TODO Auto-generated method stub
		//se necesita crear una cuenta vacia inicialmente por tanto
		Cuenta cuenta=null;
		//posteriormente ya se hace la consulta
		cuenta=cuentas.get(numeroCuenta);
		
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		
		//se tiene que devolver un ticket por tanto se va a crear el objeto 
		Ticket ticket=null;
		//se hace la busqueda de la cuenta y se necesita validar
		//si se encuentra la cuenta se asigna para manipularla
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta= consultar(numeroCuenta);
			//se valida el monto
			if(monto>9000) {//se valida el maximo del cajero
				System.out.println("El monto excede el máximo diario permitido por el cajero.");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {//validar el saldo
				System.out.println("Salfdo insuficiente");
				return ticket;
			}else if(cuenta.getSaldo()-monto<=cuenta.getSaldoMinimo()) {//se valida saldo minimo
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
				return ticket;
			}else {
				//retiro que cumple con los retiro se actualiza saldo de las cuentas
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//generacion de ticket
				ticket=new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("Cuenta inexistente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		//se debe regresar objeto Ticket por tanto se procede a crearlo
		Ticket ticket=null;
		
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta=consultar(numeroCuenta);
			if(monto>cuenta.getSaldoMaximo()) {
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMaximo()) {
				System.out.println("El saldo excedería el máximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket=new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("Numero de cuenta inexistente");
			return ticket;
		}
		
		//eso es lo que se va a regresar
		
	}
	

}
//una lambda es una funcion anonima, implementan un metodo definido en una interface
//su sintaxis (parametros)->{cuerpo-lambda}

//api stream es caracteristica para realizar operaciones en colecciones de datos 
//stream proporciona una forma de procesar y transformar elementos de una colección de datos
