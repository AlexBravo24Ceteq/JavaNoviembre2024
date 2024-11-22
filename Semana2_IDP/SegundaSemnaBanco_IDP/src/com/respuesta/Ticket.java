package com.respuesta;

import java.util.Date;

public class Ticket {
	//proposito de este paquete e sber i las operaciones
	//se realizron con exito o no
	
	private int folio;
	private Date fechaHora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idCajero;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int folio, Date fechaHora, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public int getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}
	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	

}