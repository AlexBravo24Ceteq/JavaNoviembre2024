package com.modelo;

public class Cuenta {
	/* 
	 * en el paquete com.modelo guardaremos la informacion en los objetos o entidades a los cuales queremos acceder
	 * En este ejemplo necesitaremos crear varias cuentas de usuarios  y agregaremos a un HashMap para simular una BD
	 */
	
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double salMax;
	private String tipoCuenta;
	
	public Cuenta() {
		
	}

	public Cuenta(String usuario, double saldo, double saldoMin, double salMax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.salMax = salMax;
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

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSalMax() {
		return salMax;
	}

	public void setSalMax(double salMax) {
		this.salMax = salMax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", salMax=" + salMax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	 

}
