package com.modelo;

public class Cuenta {
	
	//En el paquete com.modelo guardamos la informacion
	//de los objetos o entidades a los cuales queremos acceder
	//En este ejemplo necesitamos crear varias cuentas de usuarios y las agregaremos a un HashMap
	//para simular una pequeña BD
	
	private String usuario, tipoCu;
	private double saldo, saldoMin, saldoMax;
	
	Cuenta(){}

	public Cuenta(String usuario, String tipoCu, double saldo, double saldoMin, double saldoMax) {
		super();
		this.usuario = usuario;
		this.tipoCu = tipoCu;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTipoCu() {
		return tipoCu;
	}

	public void setTipoCu(String tipoCu) {
		this.tipoCu = tipoCu;
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

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", tipoCu=" + tipoCu + ", saldo=" + saldo + ", saldoMin=" + saldoMin
				+ ", saldoMax=" + saldoMax + "]";
	}
	
	
}
