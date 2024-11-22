package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//El proposito de esta clase es reponder si las operaciones se realizaron conexito o no
	
	private int folio, idCajero;
	private Date fechaHora;
	private String usuario, sucursal;
	private double saldo;
	
	public Ticket() {}

	public Ticket(int folio, int idCajero, Date fechaHora, String usuario, String sucursal, double saldo) {
		super();
		this.folio = folio;
		this.idCajero = idCajero;
		this.fechaHora = fechaHora;
		this.usuario = usuario;
		this.sucursal = sucursal;
		this.saldo = saldo;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", idCajero=" + idCajero + ", fechaHora=" + fechaHora + ", usuario=" + usuario
				+ ", sucursal=" + sucursal + ", saldo=" + saldo + "]";
	}
	
	

}
