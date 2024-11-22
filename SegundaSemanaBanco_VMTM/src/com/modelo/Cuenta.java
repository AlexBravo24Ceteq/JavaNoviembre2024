package com.modelo;

public class Cuenta {
	//com.modelo se guarda la informacion de objetos o entidades a los cuales queremos acceder
	//en este ejemplo se crearán varias cuentas de usuario y se agregarana  un hashmap 
	//para simular una base de datos
	private String usuario;
	private double saldo;
	private double saldoMinimo;
	private double saldoMaximo;
	private String tipoCeunta;
	
	public Cuenta() {}

	public Cuenta(String usuario, double saldo, double saldoMinimo, double saldoMaximo, String tipoCeunta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMinimo = saldoMinimo;
		this.saldoMaximo = saldoMaximo;
		this.tipoCeunta = tipoCeunta;
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

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	public void setSaldoMaximo(double saldoMaximo) {
		this.saldoMaximo = saldoMaximo;
	}

	public String getTipoCeunta() {
		return tipoCeunta;
	}

	public void setTipoCeunta(String tipoCeunta) {
		this.tipoCeunta = tipoCeunta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMinimo=" + saldoMinimo + ", saldoMaximo="
				+ saldoMaximo + ", tipoCeunta=" + tipoCeunta + "]";
	}
	
	

}
