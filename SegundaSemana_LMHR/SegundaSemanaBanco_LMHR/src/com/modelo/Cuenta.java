package com.modelo;

public class Cuenta {
	
	//En el paquete com.modelo guardamos la inf de los objetos o entidades a los cuales queemos accerder
	//necesitamos crear varias centas de usuarios
	//se agregaran a un HashMap para 
	//simular una pequena base de Datoos (BD)
	
	
	private String usuario;
	private double saldo;
	private double saldominimo;
	private double saldomaximo;
	private String tipoCuenta;
	
	public Cuenta () {}

	public Cuenta(String usuario, double saldo, double saldominimo, double saldomaximo, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldominimo = saldominimo;
		this.saldomaximo = saldomaximo;
		this.tipoCuenta = tipoCuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldominimo() {
		return saldominimo;
	}

	public void setSaldominimo(double saldominimo) {
		this.saldominimo = saldominimo;
	}

	public double getSaldomaximo() {
		return saldomaximo;
	}

	public void setSaldomaximo(double saldomaximo) {
		this.saldomaximo = saldomaximo;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldominimo=" + saldominimo + ", saldomaximo="
				+ saldomaximo + ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	

}
