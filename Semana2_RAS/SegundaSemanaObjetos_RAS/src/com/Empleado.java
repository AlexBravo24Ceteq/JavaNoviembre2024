package com;

public class Empleado {
	
	private String nombre, puesto;
	private int id;
	private float Salario;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String puesto, int id, float salario) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.id = id;
		Salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", puesto=" + puesto + ", id=" + id + ", Salario=" + Salario + "]";
	}
	
	
	

}
