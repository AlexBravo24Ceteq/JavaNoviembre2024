package com;

public class Automovil {
	
	private String marca;
	private String modelo;
	private String color;
	Motor motor;
	Transmision cajaVelocidades;
	SistemaDeSonido soundSystem;
	
	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(String marca, String modelo, String color, Motor motor, Transmision cajaVelocidades,
			SistemaDeSonido soundSystem) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
		this.cajaVelocidades = cajaVelocidades;
		this.soundSystem = soundSystem;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Transmision getCajaVelocidades() {
		return cajaVelocidades;
	}

	public void setCajaVelocidades(Transmision cajaVelocides) {
		this.cajaVelocidades = cajaVelocides;
	}

	public SistemaDeSonido getSoundSystem() {
		return soundSystem;
	}

	public void setSoundSystem(SistemaDeSonido soundSystem) {
		this.soundSystem = soundSystem;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor
				+ ", cajaVelocidades=" + cajaVelocidades + ", soundSystem=" + soundSystem + "]";
	}
	
	

}
