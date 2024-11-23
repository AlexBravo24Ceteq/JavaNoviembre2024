package com;

public class Casa {

	private String color;
	private int numHabitaciones;
	private int cantPlantas;
	private Sala sala;
	private Cocina cocina;
	private Comedor comedor;
	
	public Casa() {
		
	}

	public Casa(String color, int numHabitaciones, int cantPlantas, Sala sala, Cocina cocina, Comedor comedor) {
		super();
		this.color = color;
		this.numHabitaciones = numHabitaciones;
		this.cantPlantas = cantPlantas;
		this.sala = sala;
		this.cocina = cocina;
		this.comedor = comedor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getCantPlantas() {
		return cantPlantas;
	}

	public void setCantPlantas(int cantPlantas) {
		this.cantPlantas = cantPlantas;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Cocina getCocina() {
		return cocina;
	}

	public void setCocina(Cocina cocina) {
		this.cocina = cocina;
	}

	public Comedor getComedor() {
		return comedor;
	}

	public void setComedor(Comedor comedor) {
		this.comedor = comedor;
	}

	@Override
	public String toString() {
		return "Casa [color=" + color + ", numHabitaciones=" + numHabitaciones + ", cantPlantas=" + cantPlantas
				+ ", sala=" + sala + ", cocina=" + cocina + ", comedor=" + comedor + "]";
	}
	
}
