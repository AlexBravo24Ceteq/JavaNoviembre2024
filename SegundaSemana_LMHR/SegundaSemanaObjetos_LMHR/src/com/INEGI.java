package com;

public class INEGI {
	
	private String nombre;
	private int pisos;
	private int cuartos;
	private int familiares;
	private int focos;
	
	public INEGI () {
		
	}

	@Override
	public String toString() {
		return "INEGI [nombre=" + nombre + ", pisos=" + pisos + ", cuartos=" + cuartos + ", familiares=" + familiares
				+ ", focos=" + focos + "]";
	}

	public INEGI(String nombre, int pisos, int cuartos, int familiares, int focos) {
		super();
		this.nombre = nombre;
		this.pisos = pisos;
		this.cuartos = cuartos;
		this.familiares = familiares;
		this.focos = focos;
	}
	
	
	
	

}
